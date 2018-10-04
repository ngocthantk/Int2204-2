package lab04;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class BMITest2 {

	@Test
	public void test() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		MyProcess.calculateBMI(50,1.70);
		assertEquals("Underweight", outContent.toString());
	}

}
