package com.sydoruk1ua.util;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

import static com.sydoruk1ua.util.Utils.add;
import static com.sydoruk1ua.util.Utils.function;
import static org.junit.Assert.assertEquals;

public class UtilsTest {

    @Rule
    public final Timeout timeout = new Timeout(2000, TimeUnit.MILLISECONDS);
    //public Timeout timeout = new Timeout(1000, TimeUnit.MILLISECONDS);

    @Rule
    public ExpectedException throwException = ExpectedException.none();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeMethod class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void shouldReturnZero() {
        int actual = function(-10);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Ignore(value = "I don't know what to write here")
    @Test
    public void shouldReturnOne() {
        int actual = function(0);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFive() {
        int actual = function(1);
        int expected = 5;
        assertEquals(expected, actual);
    }

   /* @Test
    public void shouldReturnNumberMoreThanOne() {
        int actual = function(2);
        int expected = 2;
        assertEquals(expected, actual);
    }*/

    @Test //(expected = RuntimeException.class)
    public void shouldThrowRuntimeExcption() {
        throwException.expect(RuntimeException.class);
        throwException.expectMessage("Hi");
        function(100);
   /*     try {
            function(100);
        } catch (RuntimeException e) {
            assertEquals("Hi", e.getMessage());
            assertNotEquals("Hihi", e.getMessage());
            throw e;
        }*/
    }

    @Test
    public void shouldReturnSum() {
        //  timeout = new Timeout(2000, TimeUnit.MILLISECONDS);
        int actual = add(1, 2);
        int expected = 3;
        assertEquals(expected, actual);
    }
   /* @Test(timeout = 1015)
    public void shouldReturnSum() {
        int actual = add(1, 2);
        int expected = 3;
        assertEquals(expected, actual);
    }*/
}