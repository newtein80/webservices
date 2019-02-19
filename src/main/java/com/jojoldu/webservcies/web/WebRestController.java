package com.jojoldu.webservcies.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * WebRestController
 */
@RestController//@RestController는 @ResponseBody를 모든 메소드에서 적용
public class WebRestController {

    @GetMapping
    public String hello() {
        //문자열을 JSON 형태로 반환
        return "HelloWorld";
    }
}