package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo2.service.BookService;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class BookController {

    // 필요한 객체를 주입받는 이노테이션
    @Autowired
    BookService service;

    @GetMapping("/bookList")
    // Model : 화면에서 사용할 데이터를 저장하는 객체
    // 화면에서 데이터를 전달하기 위해 Model객체를 매개변수로 받아옴
    public String getMethodName(Model model) {

        // 이름, 객체
        model.addAttribute("name", "이무진");
        // 서비스로부터 현재 날짜를 반환받아서 model 객체에 담아 화면에 출력
        String date = service.selectDate();
        model.addAttribute("date", date);
        return "book/bookList";
    }
        
}
