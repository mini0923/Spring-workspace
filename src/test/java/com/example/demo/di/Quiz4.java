package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz4 {

	@Autowired
	Manager manager;
	
	@Autowired
	Cafe cafe ;
	
	@Test
	void 매니저() {
		System.out.println("그냥 카페 : "+cafe);
		System.out.println("그냥 매니저 : "+manager);
	}
	
	@Test
	void 카페내매니저 () {
		System.out.println("카페 내 매니저 : "+cafe.manager);
		System.out.println("그냥 매니저 : "+manager);
	}
}
