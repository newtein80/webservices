package com.jojoldu.webservcies.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * WebControllerTest
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class WebControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void mainh_loading() {
        /**
         * 테스트는 실제로 URL 호출시 제대로 페이지가 호출되는지에 대한 테스트
         * estRestTemplate를 통해 "/"로 호출했을때 main.hbs에 포함된 코드들이 있는지 확인
         */

        //when
        String body = this.restTemplate.getForObject("/", String.class);

        //then -- 해당 문자열이 포함되어있으면 테스트 성공
        assertThat(body).contains("스프링부트로 시작하는 웹 서비스");
    }
}