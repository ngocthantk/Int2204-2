package tuan3.bmi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class evaluatedBMITest5 {

	@Test
	void test() {
		double i = evaluatedBMI.BMI(80, 1.8);
		double j = 80/Math.pow(1.8, 2);
		assertEquals(j, i);
	}

}
