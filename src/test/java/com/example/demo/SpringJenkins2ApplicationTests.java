package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkins2ApplicationTests {
	

	@Test
	void contextLoads() {
		System.out.println("first commit");
		System.out.println("second commit");
		assertEquals(2.1, 2.1);
	}

}
