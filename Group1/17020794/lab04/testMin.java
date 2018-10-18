
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import minarray.MinArray;
import static minarray.MinArray.Min;
public class testMin extends TestCase{
    
    public void test1(){
        int[] m={1,2,3,4,5};
        int x=Min(m);
        assertEquals(1,x);
    }
    public void test2(){
        int[] m={10,12,3,4,5};
        int x=Min(m);
        assertEquals(3,x);
    }public void test3(){
        int[] m={6,2,3,4,5};
        int x=Min(m);
        assertEquals(2,x);
    }public void test4(){
        int[] m={13,23,31,46,52};
        int x=Min(m);
        assertEquals(13,x);
    }public void test5(){
        int[] m={10,21,34,34,51};
        int x=Min(m);
        assertEquals(10,x);
    }
}

