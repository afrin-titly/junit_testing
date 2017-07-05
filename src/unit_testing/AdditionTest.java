package unit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		
		Addition addition = new Addition();
		int output = addition.add(50, 30);
		int expected = 80;          
		assertEquals(expected, output);

	}
	
	@Test
	public void test1() {
		
		Addition addition = new Addition();
		int output = addition.add(50, -30);
		int expected = 20;           
		assertEquals(expected, output);

	}
	
	@Test
	public void test2() {
		
		Addition addition = new Addition();
		int output = addition.add(-50, -30);
		int expected = 80;           
		assertEquals(expected, output);

	}

}
