package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinArrayTest5 {

	@Test
	public void test() {
		int[] arr = {8,2,6,2,1,-2,6,-1,57,100,42,-14,0,1,0,-35,-3,69,22,1,13,6,123,8};
		assertEquals(-35, MyProcess.getMinOfArray(arr));
	}

}
