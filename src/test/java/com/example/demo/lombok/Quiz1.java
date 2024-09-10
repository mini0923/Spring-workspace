package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz1 {

	@Test
	void 도서테스트() {
		Book book1= new Book();
		book1.setBookName("자바");
		book1.setPrice(20000);
		book1.setPublisher("한빛미디어");
		book1.setPageNum(200);
		
		System.out.println(book1.getBookName());
		System.out.println(book1.getPrice());
		System.out.println(book1.getPublisher());
		System.out.println(book1.getPageNum());
		
		Book book2 = new Book("스프링", 30000, "한빛미디어", 300);
		System.out.println(book2.toString());
		
		Book book3 = Book
												.builder()
												.bookName("JS")
												.price(40000)
												.publisher("한빛미디어")
												.pageNum(400)
												.build();
		
		System.out.println(book3);
		
	}
	
}
