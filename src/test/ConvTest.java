package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import logic.Conv;

class ConvTest {

	@Test
	void test() {
		double num1= 40;
		double num2;
		num2=convert(num1);
		assertEquals("0,4",String.valueOf(num2));
	}

}
