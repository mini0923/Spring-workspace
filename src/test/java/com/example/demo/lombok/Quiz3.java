package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz3 {

	@Test
	void 학생테스트() {
		
		// getter, setter 방식
		Student Student1 = new Student();
		
		Student1.setSt_no(1);
		Student1.setName("둘리");
		Student1.setAge(10);
		
		System.out.println("학번 : " + Student1.getSt_no());
		System.out.println("이름 : " + Student1.getName());
		System.out.println("나이 : " + Student1.getAge());

		Student Student2 = new Student(2, "또치", 20);
		System.out.println(Student2.toString());
		
		Student Student3 = Student
													.builder()
													.st_no(3)
													.name("도우너")
													.age(30)
													.build();
		
		System.out.println(Student3);
		
		
	}
	
}
