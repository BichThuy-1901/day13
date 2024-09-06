package com.example.day13;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Day13ApplicationTests {
	@Autowired
	MathService mathService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testAdd_UC001(){
		int actualResult = mathService.add(2,3);
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testAdd_UC002(){
		int actualResult = mathService.add(-9,2);
		int expectedResult = -7;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testDivide_UC001(){
		double actualResult = mathService.divide(7,2);
		double expectedResult = 3.5;
		assertEquals(expectedResult, actualResult, 0.0001);
	}

}
