package com.example.securityserver.controller.login


import com.example.securityserver.component.provider.JwtTokenProvider
import com.example.securityserver.model.domain.user.Authority
import com.example.securityserver.model.domain.user.EmpBase
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
import kotlin.reflect.typeOf


@RestController
@RequestMapping("/api/userlogin")
@RequiredArgsConstructor
class LoginController {
    private val jwtTokenProvider: JwtTokenProvider? = null
    private val passwordEncoder: PasswordEncoder? = null
    private val loginRepository: LoginRepository? = null
    private val loginService: LoginService? = null

    // 로그인
    @PostMapping("/userCheck")
    fun login(@RequestBody user: EmpBase): String {

        println("로그인")
        println(user.empId is Long)
        println(user)
        var member = loginRepository!!.findByEmpId(user.empId)

        println(member)

        if (!passwordEncoder!!.matches(user.userPassword, member?.userPassword)) {
            throw IllegalArgumentException("잘못된 비밀번호입니다.")
        }

        val roles: MutableList<Authority>? = member?.roles
        println(roles)

        return jwtTokenProvider!!.createToken(member?.empId.toString())
    }

    // 토큰 정보로 유저 객체 가져오기
    @PostMapping("getLoginUser")
    fun getUserId(@RequestBody token: String): Any? {

        println("GetLoginUser")
        val userId: MutableMap<String, String> = HashMap()

        try {

            val id = jwtTokenProvider!!.getUserPk(token)
            userId["SUCCESS"] = id

        } catch (e: ExpiredJwtException) {

            userId["ERROR"] = "토큰 기한 만료. 다시 로그인 해 주세요"

        } catch (e: Exception) {

            e.printStackTrace()
            userId["ERROR"] = e.toString()

        }

        return if (userId.containsKey("SUCCESS")) {

            null

        } else userId

    }
}