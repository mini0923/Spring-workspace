package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz2 {

	@Test
	void 차테스트() {
		Car car1 = new Car();
		car1.setModelName("소나타");
		car1.setMaker("현대");
		car1.setColor("빨강색");
		
		System.out.println(car1.getModelName());
		System.out.println(car1.getMaker());
		System.out.println(car1.getColor());
		
		Car car2 = new Car("쏘렌토","기아", "검은색");
		System.out.println(car2.toString());
		
		Car car3 = Car
									.builder()
									.modelName("레이")
									.maker("기아")
									.color("갈색")
									.build();
		
		System.out.println(car3);
		
	}
}
