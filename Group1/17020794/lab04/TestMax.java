/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import findmax.Maxum;
import static findmax.Maxum.Max;
public class TestMax extends TestCase {

	public void test1() {
		Maxum m=new Maxum(7,8);
		int x=Max(m);
		assertEquals(8,x);
	}
	public void test2() {
		Maxum m=new Maxum(9,8);
		int x=Max(m);
		assertEquals(9,x);
	}

	public void test3() {
		Maxum m=new Maxum(10,8);
		int x=Max(m);
		assertEquals(10,x);
	}

	public void test4() {
		Maxum m=new Maxum(-7,8);
		int x=Max(m);
		assertEquals(8,x);
	}

	public void test5() {
		Maxum m=new Maxum(100,7);
		int x=Max(m);
		assertEquals(100,x);
	}


}