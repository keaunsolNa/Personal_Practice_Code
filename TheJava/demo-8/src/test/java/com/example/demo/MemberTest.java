package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MemberTest {

	@Test
	public void getterSetter() {
		Member member = new Member();
		
		member.setName("test");
		
		assertEquals(member.getName(), "test");
	}
}
