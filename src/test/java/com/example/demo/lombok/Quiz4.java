package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz4 {
	
	@Test
	void 영화테스트() {
		Movie movie1 = new Movie();
		movie1.setName("베테랑2");
		movie1.setDirect("류승완");
		movie1.setReleaseDate("2024-09-13");
		
		System.out.println(movie1.getName());
		System.out.println(movie1.getDirect());
		System.out.println(movie1.getReleaseDate());
		
		Movie movie2 = new Movie("사랑의 하츄핑","김수훈", "2024-09-01");
		System.out.println(movie2.toString());
		
		Movie movie3 = Movie
														.builder()
														.name("룩백")
														.direct("오시야마 키요타카")
														.releaseDate("2024-09-05")
														.build();
		System.out.println(movie3);
	}

}
