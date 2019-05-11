import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	//Arrange
	FizzBuzz underTest = new FizzBuzz();

		@Test
		public void shouldSay1For1() {
			//Act
			String result = underTest.getResponse(1);
			//Assert
			assertEquals("1", result);
			
		}
		
		@Test
		public void shouldSay2For2() {
			//Act
			String result = underTest.getResponse(2);
			//Assert
			assertEquals("2", result);
		}
		
		@Test
		public void shouldSayFizzFor3() {
			String result = underTest.getResponse(3);
			assertEquals("Fizz", result);
		}
		
		@Test
		public void shouldSayBuzzFor5() {
			String result = underTest.getResponse(5);
			assertEquals("Buzz", result);
		}
		@Test
		public void shouldSayFizzFor6() {
			String result = underTest.getResponse(6);
			assertEquals("Fizz", result);
		}
		@Test
		public void shouldSayFizzFor10() {
			String result = underTest.getResponse(10);
			assertEquals("Buzz", result);
		}
		@Test
		public void shouldSayFizzBuzzfor15() {
			String result = underTest.getResponse(15);
			assertEquals("FizzBuzz", result);
		}

	}

