plugins {
	java
	id("org.springframework.boot") version "3.5.4-SNAPSHOT"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.supermarket"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-security")

	compileOnly("org.projectlombok:lombok:1.18.38")
	annotationProcessor("org.projectlombok:lombok:1.18.38")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	// JWT
	implementation("io.jsonwebtoken:jjwt:0.9.1")

	// DB
	runtimeOnly("org.postgresql:postgresql")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
