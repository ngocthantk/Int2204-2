package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab4Test {

	  @Test
	    public void testmax(){
	        assertEquals(6,Lab4.max(1,6));
	    }
	  @Test
	    public void testmax1(){
	        assertEquals(7,Lab4.max(-9,7));
	    }
	  @Test
	    public void testmax2(){
	        assertEquals(99,Lab4.max(78,99));
	    }
	    @Test
	    public void testmax3(){
	        assertEquals(134,Lab4.max(8,134));
	    }
	    @Test
	    public void testmax4(){
	        assertEquals(77,Lab4.max(23,77));
	    }
	    @Test
	    public void testmin(){
	        int a[]= {3,5,6,7};
	        assertEquals(3,Lab4.min(a));
	    }
	    @Test
	     public void testmin1(){
	        int a[]= {78,67,76,3};
	        assertEquals(3,Lab4.min(a));
	    }
	     @Test
	      public void testmin2(){
	        int a[]= {709,9,697,890};
	        assertEquals(9,Lab4.min(a));
	    }
	      @Test
	       public void testmin3(){
	        int a[]= {8,697,7,890};
	        assertEquals(7,Lab4.min(a));
	    }
	       @Test
	       public void testmin4(){
	        int a[]= {89,8,697,89780};
	        assertEquals(8,Lab4.min(a));
	    }
	       @Test
	    public void testBMI(){
	        assertEquals("Binh thuong", Lab4.BMI(45,1.55));
	    }
	    @Test
	    public void testBMI1(){
	        assertEquals("Binh thuong", Lab4.BMI(46,1.55));
	    }
	    @Test
	     public void testBMI2(){
	        assertEquals("Thua can", Lab4.BMI(50,1.45));
	    }
	     @Test
	     public void testBMI3(){
	        assertEquals("Thieu can", Lab4.BMI(30,1.75));
	    }
	     @Test
	      public void testBMI4(){
	        assertEquals("Beo phi", Lab4.BMI(100,1.15));
	    }
	     
}
