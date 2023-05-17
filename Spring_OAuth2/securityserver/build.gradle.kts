import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.1"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
	kotlin("plugin.jpa") version "1.7.22" // JPA를 사용하기 위한 플러그인
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation ("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.springframework.security:spring-security-test")
	implementation ("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
	implementation ("org.thymeleaf.extras:thymeleaf-extras-springsecurity5")
	implementation ("com.oracle.database.jdbc:ojdbc8")
	implementation ("io.jsonwebtoken:jjwt-api:0.11.5")
	implementation ("io.jsonwebtoken:jjwt-impl:0.11.5")
	implementation ("io.jsonwebtoken:jjwt-jackson:0.11.5")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	runtimeOnly("com.h2database:h2")


	runtimeOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly ("net.coobird:thumbnailator:0.4.8")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	testImplementation ("org.webjars:stomp-websocket:2.3.3")
	testImplementation ("org.springframework:spring-websocket")
	testImplementation ("org.springframework.boot:spring-boot-starter-websocket")
	testImplementation ("org.webjars:sockjs-client:1.0.2")

	implementation  ("org.projectlombok:lombok:1.18.26")
	annotationProcessor ("org.projectlombok:lombok:1.18.26")

	implementation ("org.bgee.log4jdbc-log4j2:log4jdbc-log4j2-jdbc4:1.16")
	implementation ("org.springframework.boot:spring-boot-starter-aop")
	implementation ("org.modelmapper:modelmapper:3.1.1")
	implementation ("org.springframework:spring-support:2.0.8")
	implementation ("org.webjars:webjars-locator-core")

}

allOpen {
	annotation("javax.persistence.Entity")
	annotation("javax.persistence.MappedSuperclass")
	annotation("javax.persistence.Embeddable")
}

noArg {
	annotation("com.my.Annotation")
	annotation("javax.persistence.Entity")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
