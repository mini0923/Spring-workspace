package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz3 {
	
	@Autowired
	Employee em ;
	
	@Test
	void 회사원() {		
		em.work();		
	}
}