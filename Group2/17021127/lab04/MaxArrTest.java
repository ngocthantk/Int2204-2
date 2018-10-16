<<<<<<< HEAD
package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxArrTest {

    @Test
    void test1() {
        int a[] = {1, 2, 3, 4};
        assertEquals(1, Method.minarr(a, 4));
    }

    @Test
    void test2() {
        int a[] = {4, 5, 6, 7};
        assertEquals(1, Method.minarr(a, 4));
    }

    @Test
    void test3() {
        int a[] = {5, 5, 8, 8};
        assertEquals(8, Method.minarr(a, 4));
    }

    @Test
    void test4() {
        int a[] = {200, 100, 20, 10};
        assertEquals(200, Method.minarr(a, 4));
    }

    @Test
    void test5() {
        int a[] = {100, 10, 1, 1000};
        assertEquals(1, Method.minarr(a, 4));
    }
}
=======
package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxArrTest {

    @Test
    void test1() {
        int a[] = {1, 2, 3, 4};
        assertEquals(1, Method.minarr(a, 4));
    }

    @Test
    void test2() {
        int a[] = {4, 5, 6, 7};
        assertEquals(1, Method.minarr(a, 4));
    }

    @Test
    void test3() {
        int a[] = {5, 5, 8, 8};
        assertEquals(8, Method.minarr(a, 4));
    }

    @Test
    void test4() {
        int a[] = {200, 100, 20, 10};
        assertEquals(200, Method.minarr(a, 4));
    }

    @Test
    void test5() {
        int a[] = {100, 10, 1, 1000};
        assertEquals(1, Method.minarr(a, 4));
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
