package examplesampleapplication;

import org.junit.Test;

import example.application.sample.ExampleMaven;
import junit.framework.TestCase;

public class squareTest extends TestCase {
	
	@Test
	public void test()
	{
		int output = ExampleMaven.square(5);
		assertEquals(25, output);
	}
	
}
