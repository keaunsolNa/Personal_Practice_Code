package com.example.securityserver.model.repository.login


import com.example.securityserver.model.domain.user.Account
import com.example.securityserver.model.domain.user.User
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.transaction.annotation.Transactional
import java.math.BigDecimal
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@ExtendWith(SpringExtension::class)
@ActiveProfiles("test")
@Transactional
@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    private lateinit var userRepository: UserRepository
    @Autowired
    private lateinit var accountRepository: AccountRepository
    @PersistenceContext
    private lateinit var entityManager: EntityManager

    @BeforeEach
    fun setUp() {
        val user = userRepository.save(User("한태웅", "taewoong.han.squid@navercorp.com"))
        accountRepository.save(Account(user, "111-11111-1111", BigDecimal.ZERO))
    }

    @Test
    fun `계좌번호로 Account 정보 조회`() {
        println("--------- 계좌번호로 Account 정보 조회 ---------")

        //given
        val number = "111-11111-1111"
        entityManager.clear() // 영속성 컨텍스트에 User가 존재한다면 제대로 된 테스트가 진행되지 않기 때문에 영속성 컨텍스트를 clear해준 후에 테스트를 진행하였다.

        //when
        val dut: Account? = accountRepository.findByNumber(number)
//        println(dut?.user)

        //then
        Assertions.assertNotNull(dut)
        Assertions.assertEquals(number, dut!!.number)

        println("--------- 계좌번호로 Account 정보 조회 ---------")
    }
}