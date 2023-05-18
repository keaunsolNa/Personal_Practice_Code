package com.example.securityserver.controller.login

import com.example.securityserver.component.provider.JwtTokenProvider
import com.example.securityserver.model.domain.user.EmpBase
import com.example.securityserver.model.domain.user.Role
import com.example.securityserver.model.domain.user.User
import com.example.securityserver.model.repository.login.LoginRepository
import com.example.securityserver.service.LoginService
import io.jsonwebtoken.ExpiredJwtException
import lombok.RequiredArgsConstructor
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import kotlin.collections.HashMap

@RestController
@RequestMapping("/api/userlogin")
@RequiredArgsConstructor
class LoginController(

    // 가변 생성자
    private val loginRepository: LoginRepository,
    private val jwtTokenProvider: JwtTokenProvider,
    private val passwordEncoder: PasswordEncoder,

) {
    // 로그인
    @PostMapping("/userCheck")
    fun login(@RequestBody user: EmpBase): String {

        // Parameter로 받아온 id(PK값)으로 user 객체를 가져온다.
        var member = loginRepository!!.findByEmpId(user.empId)

        // Spring Security 제공 passwordEncoder로 비크립트 암호와 비교
        if (!passwordEncoder!!.matches(user.userPassword, member?.userPassword)) {

            // 불일치 시 에러를 던진다.
            throw IllegalArgumentException("잘못된 비밀번호입니다.")
        }

        // 가변 List 타입 권한 객체
        val roles: MutableList<Role>? = member?.roles

        // 만약 유저에게 권한이 없다면
        if(roles.isNullOrEmpty()) {

            // 권한 관련 에러 발생
            throw IllegalArgumentException("권한이 없습니다.")
        }

        // NPE 방지 및 타입 안정성을 위해 불변 List로 권한 객체를 재 할당
        var authorityList: List<String?> = roles.map { it.authority!!.authorityName }

        // 유저 PK값과 권한 객체로 토큰을 만들어 반환한다.
        return jwtTokenProvider!!.createToken(member?.empId.toString(), authorityList)
    }

    // 토큰 정보로 유저 객체 가져오기
    @PostMapping("getLoginUser")
    fun getUserId(@RequestBody token: String): Any? {

        // 가변 Map타입 유저 아이디 객체 선언
        val userId: MutableMap<String, String> = HashMap()

        try {

            // 토큰으로부터 PK 값인 ID를 가져온다.
            val id = jwtTokenProvider!!.getUserPk(token)

            // 정상적으로 가져온다면 가변 Map 타입에 유저의 ID를 할당
            userId["SUCCESS"] = id

            // 토큰 기한 만료 Exception 발생 시
        } catch (e: ExpiredJwtException) {

            // 가변 Map 타입에 ERROR 메시지 할당
            userId["ERROR"] = "토큰 기한 만료. 다시 로그인 해 주세요"

            // 그 외 에러 발생 시
        } catch (e: Exception) {

            // 에러 출력하고 해당 에러 메시지 Value 할당
            e.printStackTrace()
            userId["ERROR"] = e.toString()

        }

        // Token으로부터 유저 PK 가져왔을 때면 
        return if (userId.containsKey("SUCCESS")) {

            // 불변 Not Null 변수로 재할당 후
            var userId = userId["SUCCESS"]!!

            // JPA로 가져온 유저 정보 반환
            return loginRepository!!.findByEmpId(userId.toLong())
            
            // 아닐 경우 메러 메시지 반환
        } else userId

    }
}