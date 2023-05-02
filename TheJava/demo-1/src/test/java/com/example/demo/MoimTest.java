package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class MoimTest {

	@Test
	public void isFull() {
		Moim moim = new Moim();
		moim.maxNumberofAttendess = 100;
		moim.numberOfEnrollment = 10;
		Assert.isTrue(!moim.isEnrollmentFull());
	}
}
