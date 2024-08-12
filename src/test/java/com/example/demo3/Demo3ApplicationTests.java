package com.example.demo3;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Demo3ApplicationTests {

	@Autowired
	BookMapper mapper;

	@Test
	void contextLoads() {
		String date = mapper.selectDate();
		// 값이 null인지 아닌지 판단
		// 테스트의 성공/실패를
		assertNotNull(date);
	}

}
