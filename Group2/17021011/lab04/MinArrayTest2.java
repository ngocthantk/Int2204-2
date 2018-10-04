package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinArrayTest2 {

	@Test
	public void test() {
		int[] arr = {5,6,-1,0,5};
		assertEquals(-1, MyProcess.getMinOfArray(arr));
	}

}
