package com.jojoldu.webservcies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//http://localhost:8080/h2-console를 입력
		//JDBC URL : jdbc:h2:mem:testdb
		//connect !
		SpringApplication.run(Application.class, args);
	}

}
