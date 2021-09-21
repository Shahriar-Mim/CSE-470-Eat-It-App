package com.androideatit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import android.test.AndroidTestCase;

public class TestingDummy extends AndroidTestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }
    @Test
    public void testThatDemonstratesAssertions() throws Throwable {
        int a = 5;
        int b = 3;
        int c = 5;
        int d = 10;

        assertEquals("X should be equal", a, c);
        assertTrue("Y should be true", d > a);
        assertFalse("Z should be false", a == b);

        if (b > d) {
            fail("XX should never happen");
        }
    }

    @After
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}