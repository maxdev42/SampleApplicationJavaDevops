package examplesampleapplication;

import static org.junit.Assert.*;

import org.junit.Test;

import example.application.sample.ExampleMaven;

public class additionTest {

	@Test
	public void test() {
		int output = ExampleMaven.addition(5, 5);
		assertEquals(10, output);
	}

}
