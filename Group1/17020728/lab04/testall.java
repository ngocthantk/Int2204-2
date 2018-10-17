<<<<<<< HEAD
package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testall {

	

		@Test
		void test1() {

			lab04 tes=new lab04();
			 double cannang = 100;
		        double chieucao=1;
		       
		        String expResult = "beo phi";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test2() {

			lab04 tes=new lab04();
			 double cannang = 200;
		        double chieucao=1.2;
		       
		        String expResult = "beo phi";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test3() {

			lab04 tes=new lab04();
			 double cannang = 500;
		        double chieucao=2;
		       
		        String expResult = "beo phi";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test4() {

			lab04 tes=new lab04();
			 double cannang = 40;
		        double chieucao=3;
		       
		        String expResult = "thieu can";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test5() {

			lab04 tes=new lab04();
			 double cannang = 49;
		        double chieucao=2;
		       
		        String expResult = "thieu can";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}

	
	

		@Test
		void test6() {
			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=3;
		         arr[2]=3;
		         arr[3]=56;
		         arr[4]=23;
		       
		        int expResult = 3;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
	void test7() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=4;
		        arr[1]=34;
		         arr[2]=33;
		         arr[3]=56;
		         arr[4]=23;
		       
		        int expResult = 4;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
		void test8() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=32;
		         arr[2]=31;
		         arr[3]=56;
		         arr[4]=23;
		       
		        int expResult = 23;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
		void test9() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=35;
		         arr[2]=39;
		         arr[3]=56;
		         arr[4]=213;
		       
		        int expResult = 35;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
		void test10() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=34;
		         arr[2]=31;
		         arr[3]=56;
		         arr[4]=123;
		       
		        int expResult = 31;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
	
	//class testma {

		@Test
		void test11() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =34;
			a=45;
			expResult =45;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}

		@Test
		void test12() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =34;
			a=49;
			expResult =49;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}

		@Test
		void test13() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =314;
			a=459;
			expResult =459;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}

		@Test
		void test14() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =134;
			a=45;
			expResult =134;
			result = tes.max(a, b);
			assertEquals(result,result);
		}

		@Test
		void test15() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =3224;
			a=43425;
			expResult =43425;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}
	}

=======
package lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testall {

	

		@Test
		void test1() {

			lab04 tes=new lab04();
			 double cannang = 100;
		        double chieucao=1;
		       
		        String expResult = "beo phi";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test2() {

			lab04 tes=new lab04();
			 double cannang = 200;
		        double chieucao=1.2;
		       
		        String expResult = "beo phi";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test3() {

			lab04 tes=new lab04();
			 double cannang = 500;
		        double chieucao=2;
		       
		        String expResult = "beo phi";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test4() {

			lab04 tes=new lab04();
			 double cannang = 40;
		        double chieucao=3;
		       
		        String expResult = "thieu can";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}
		@Test
		void test5() {

			lab04 tes=new lab04();
			 double cannang = 49;
		        double chieucao=2;
		       
		        String expResult = "thieu can";
		        String result = tes.bmi(cannang, chieucao);
		        assertEquals(expResult, result);
		
		}

	
	

		@Test
		void test6() {
			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=3;
		         arr[2]=3;
		         arr[3]=56;
		         arr[4]=23;
		       
		        int expResult = 3;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
	void test7() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=4;
		        arr[1]=34;
		         arr[2]=33;
		         arr[3]=56;
		         arr[4]=23;
		       
		        int expResult = 4;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
		void test8() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=32;
		         arr[2]=31;
		         arr[3]=56;
		         arr[4]=23;
		       
		        int expResult = 23;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
		void test9() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=35;
		         arr[2]=39;
		         arr[3]=56;
		         arr[4]=213;
		       
		        int expResult = 35;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
		@Test
		void test10() {

			lab04 tes=new lab04();
			 int n = 5;
		        int arr[] = new int[n] ;
		        arr[0]=45;
		        arr[1]=34;
		         arr[2]=31;
		         arr[3]=56;
		         arr[4]=123;
		       
		        int expResult = 31;
		        int result = tes.minArr(arr, n);
		        assertEquals(expResult, result);
		}
	
	//class testma {

		@Test
		void test11() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =34;
			a=45;
			expResult =45;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}

		@Test
		void test12() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =34;
			a=49;
			expResult =49;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}

		@Test
		void test13() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =314;
			a=459;
			expResult =459;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}

		@Test
		void test14() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =134;
			a=45;
			expResult =134;
			result = tes.max(a, b);
			assertEquals(result,result);
		}

		@Test
		void test15() {
			lab04 tes = new lab04();
			int a,b,result,expResult;
			b =3224;
			a=43425;
			expResult =43425;
			result = tes.max(a, b);
			assertEquals(expResult,result);
		}
	}

>>>>>>> 8698251a186993be093e172d03823408519eb608
