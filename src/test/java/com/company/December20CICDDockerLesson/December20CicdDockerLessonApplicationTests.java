package com.company.December20CICDDockerLesson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class December20CicdDockerLessonApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void helloTest() {
		HelloController helloController = new HelloController();
		String expected = "Hello!";
		String actual = helloController.getHello();
		assertEquals(expected, actual);
	}
	
	@Test
	public void failingTest() {
		fail();
	}
}
