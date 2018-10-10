package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinArrayTest3 {

	@Test
	public void test() {
		int[] arr = {1,1,1};
		assertEquals(1, MyProcess.getMinOfArray(arr));
	}

}
