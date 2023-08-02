package telran.recursion.test;

import static org.junit.jupiter.api.Assertions.*;
import static telran.recursion.LinearRecursion.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class LinearRecurtionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void functionTest() {
		function(3);
		function(30);
	}
	@Test
	void factorialTest() {
		assertEquals(6, factorial(3));
		assertEquals(24, factorial(4));
		assertThrowsExactly(IllegalArgumentException.class, () -> factorial(-1));
	}
	
	@Test
	@Disabled
	void powTest() {
		assertThrowsExactly(IllegalArgumentException.class, () -> pow(10, -3));
		assertEquals(-1000, pow(-10, 3));
		assertEquals(100, pow(-10, 2));
		assertEquals(1000, pow(10, 3));
	}
	
	@Test
	void displayArrayTest() {
		System.out.println("\nDisplaying range [1-5]");
		int[] ar = {1, 2, 3, 4, 5};
		displayArray(ar);
	}
	
	@Test
	void displayReverseArrayTest() {
		System.out.println("\nDisplaying reversed range [5-1]");
		int[] ar = {1, 2, 3, 4, 5};
		displayReversedArray(ar);
	}
	
	@Test
	void sumArrayTest() {
		int[] ar = {1, 2, 3, 4, 5};
		assertEquals(15, sumArray(ar));
	}
	
	@Test
	void reverseArrayTest() {
		int[] ar = {1, 2, 3, 4, 5};
		int[] expected = {5, 4, 3, 2, 1};
		reverseArray(ar);
		assertArrayEquals(expected, ar);
	}
	
	@Test
	void squareTest() {
		assertEquals(100, square(10));
		assertEquals(100, square(-10));
	}
}
