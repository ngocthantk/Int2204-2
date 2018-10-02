package tuan3.bmi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class evaluatedBMITest2 {

	@Test
	void test() {
		double i = evaluatedBMI.BMI(60, 1.75);
		double j = 60/Math.pow(1.75, 2);
		assertEquals(j, i);
	}

}
