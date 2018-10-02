package tuan3.bmi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.Math;

class evaluatedBMITest1 {

	@Test
	void test() {
		double i = evaluatedBMI.BMI(40.54, 1.60);
		double j = 40.54/Math.pow(1.60, 2);
		assertEquals(j, i);
	}

}
