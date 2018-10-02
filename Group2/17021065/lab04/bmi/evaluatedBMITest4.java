package tuan3.bmi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class evaluatedBMITest4 {

	@Test
	void test() {
		double i = evaluatedBMI.BMI(90, 1.8);
		double j = 90/Math.pow(1.8, 2);
		assertEquals(j, i);
	}

}
