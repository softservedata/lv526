package com.softserve.edu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass(");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterClass tearDownAfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\t@Before setUp()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\t@After tearDown()");
    }

    @Test
    public void testAdd() {
        System.out.println("\t\t@Test testAdd()");
        /*-
        //int i = 0;
        double i = 0;
        i = 10 / i;
        System.out.println("\t\t\ti = " + i);
        */
        // throw new RuntimeException("Ha-ha-ha");
        // Assert.assertEquals(4, 2 + 2);
        // fail("Not yet implemented");
        //
        Calc sut = new Calc();
        double actual;
        double expected;
        //
        expected = 4;
        actual = sut.add(2, 2);
        Assert.assertEquals("error message", expected, actual, 0.001);
    }

    @Test
    public void testAdd2() {
        System.out.println("\t\t@Test testAdd2()");
        Calc sut = new Calc();
        double actual;
        double expected;
        //
        expected = 4;
        actual = sut.add(1, 3);
        Assert.assertEquals("error message", expected, actual, 0.001);
    }

    @Test
    public void testDiv() {
        System.out.println("\t\t@Test testDiv()");
        Calc sut = new Calc();
        double actual;
        double expected;
        //
        expected = 4;
        actual = sut.div(20, 5);
        Assert.assertEquals("error message", expected, actual, 0.001);
    }

    @Test
    public void testDiv2() {
        System.out.println("\t\t@Test testDiv2()");
        Calc sut = new Calc();
        double actual;
        double expected;
        //
        expected = 2.5;
        actual = sut.div(20, 8);
        Assert.assertEquals("error message", expected, actual, 0.001);
    }
}
