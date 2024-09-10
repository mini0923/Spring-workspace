package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz5 {

	@Autowired
	Doctor doctor;
	
	@Autowired
	Hospital hospital;
	
	@Test
	void 병원테스트() {
		System.out.println("그냥 의사 : "+doctor);
		System.out.println("그냥 병원 : " +hospital);
	}
	
	@Test
	void 주치의테스트() {
		System.out.println("그냥 의사 : "+doctor);
		System.out.println("병원 내 주치의 : "+hospital.doctor);
	}
	
}
