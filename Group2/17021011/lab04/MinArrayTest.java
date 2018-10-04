package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinArrayTest {

	@Test
	public void test() {
		int[] arr = {1,2,3,4,5};
		assertEquals(1, MyProcess.getMinOfArray(arr));
	}

}
