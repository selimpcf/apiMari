package day01;

import org.junit.jupiter.api.*;

public class BeforeAfterInJunit5 {

    // this method will run only once before the entire test
    // same idea as @beforeClass you learned previously
    // these are JUNIT5 Specific annotations
    @BeforeAll
    public static void setUp(){
        System.out.println("This run before All");
    }
    //same idea as @beforeMethod you learned previously
    // this is Junit5 specific annotation for same idea
    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Running before the test ");
    }

    @Test
    public void test1(){
        System.out.println("Test1 is running");
    }

    //@Disabled // same idea as @ignore you learned before
    @Test
    public void test2(){
        System.out.println("Test2 is running");
    }

    // same idea as @afterMethod you learned previously
    @AfterEach
    public void afterEachTest(){
        System.out.println("Running after each test");
    }

    // This method will run only once after all the test
    // same idea as @afterClass annotation you learned previously
    @AfterAll
    public static void tearDown(){
        System.out.println("This run all the way at the end");
    }



}
