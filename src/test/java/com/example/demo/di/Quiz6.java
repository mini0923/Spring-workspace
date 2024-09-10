package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz6 {

	@Autowired
	Teacher teacher;

	@Autowired
	ScienceTeacher scienceTeacher;
	
	
	@Test
	void 선생님(){
		System.out.println(scienceTeacher.teach());
	}
	
}
