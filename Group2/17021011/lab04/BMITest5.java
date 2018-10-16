package lab04;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class BMITest5 {

	@Test
	public void test() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		MyProcess.calculateBMI(62,1.52);
		assertEquals("Overweight", outContent.toString());
	}

}
