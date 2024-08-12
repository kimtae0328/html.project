package com.example.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class HomeController {
    /*
     * RequestParam : 사용자의 요청으로부터 param이라는 이름의 값을 변수에 저장하는 어노테이션
     *                기본값은 필수이므로 값을 받지 못하면 오류 발생
     */
    // url이 요청되면 해당 메서드를 실행
    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/bookList")
    public String bookList() {
        log.info("/bookList 호출");
        // 서비스 호출 list<BookDto>

        // templates폴더안에 book 폴더에 있는 bookList.html을 응답
        // templates/      .html   -> application.properties 설정파일에 설정
        return "book/bookList";
    }
    

    /*
     * GetMapping : get방식으로 url이 호출된 경우 실행
     * 
     * @return
     */
    @GetMapping("/bookDetail")
    public String BookDetail() {
        log.info("/bookDetail 호출");
        return "book/bookDetail";
    }
    
}
