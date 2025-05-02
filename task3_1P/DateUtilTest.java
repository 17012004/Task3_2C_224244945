package sit707_tasks;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "S224244945";
        System.out.println("Testing Student ID: " + studentId);
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Vansh Kumar";
        System.out.println("Testing Student Name: " + studentName);
        Assert.assertNotNull("Student name is null", studentName);
    }

    // Test Cases for Decrement (Previous Date)
    @Test
    public void testPrevious_1A() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.decrement();
        System.out.println("Test 1A: " + date.toString());
        Assert.assertEquals("31 May 1994", date.toString());
    }
    
    @Test
    public void testPrevious_2A() {
        DateUtil date = new DateUtil(2, 6, 1994);
        date.decrement();
        System.out.println("Test 2A: " + date.toString());
        Assert.assertEquals("1 June 1994", date.toString());
    }
    
    @Test
    public void testPrevious_3A() {
        DateUtil date = new DateUtil(15, 6, 1994);
        date.decrement();
        System.out.println("Test 3A: " + date.toString());
        Assert.assertEquals("14 June 1994", date.toString());
    }
    
    @Test
    public void testPrevious_4A() {
        DateUtil date = new DateUtil(30, 6, 1994);
        date.decrement();
        System.out.println("Test 4A: " + date.toString());
        Assert.assertEquals("29 June 1994", date.toString());
    }
    
    @Test(expected = RuntimeException.class)
    public void testPrevious_5A() {
        System.out.println("Test 5A: Invalid Date");
        new DateUtil(31, 6, 1994);
    }
    
    @Test
    public void testPrevious_6A() {
        DateUtil date = new DateUtil(15, 1, 1994);
        date.decrement();
        System.out.println("Test 6A: " + date.toString());
        Assert.assertEquals("14 January 1994", date.toString());
    }
    
    @Test
    public void testPrevious_7A() {
        DateUtil date = new DateUtil(15, 2, 1994);
        date.decrement();
        System.out.println("Test 7A: " + date.toString());
        Assert.assertEquals("14 February 1994", date.toString());
    }
    
    @Test
    public void testPrevious_8A() {
        DateUtil date = new DateUtil(15, 11, 1994);
        date.decrement();
        System.out.println("Test 8A: " + date.toString());
        Assert.assertEquals("14 November 1994", date.toString());
    }
    
    @Test
    public void testPrevious_9A() {
        DateUtil date = new DateUtil(15, 12, 1994);
        date.decrement();
        System.out.println("Test 9A: " + date.toString());
        Assert.assertEquals("14 December 1994", date.toString());
    }
    
    @Test
    public void testPrevious_10A() {
        DateUtil date = new DateUtil(15, 6, 1700);
        date.decrement();
        System.out.println("Test 10A: " + date.toString());
        Assert.assertEquals("14 June 1700", date.toString());
    }
    
    @Test
    public void testPrevious_11A() {
        DateUtil date = new DateUtil(15, 6, 1701);
        date.decrement();
        System.out.println("Test 11A: " + date.toString());
        Assert.assertEquals("14 June 1701", date.toString());
    }
    
    @Test
    public void testPrevious_12A() {
        DateUtil date = new DateUtil(15, 6, 2023);
        date.decrement();
        System.out.println("Test 12A: " + date.toString());
        Assert.assertEquals("14 June 2023", date.toString());
    }
    
    @Test
    public void testPrevious_13A() {
        DateUtil date = new DateUtil(15, 6, 2024);
        date.decrement();
        System.out.println("Test 13A: " + date.toString());
        Assert.assertEquals("14 June 2024", date.toString());
    }
    
    // Test Cases for Increment (Next Date)
    @Test
    public void testNext_1B() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.increment();
        System.out.println("Test 1B: " + date.toString());
        Assert.assertEquals("2 June 1994", date.toString());
    }

    @Test
    public void testNext_2B() {
        DateUtil date = new DateUtil(2, 6, 1994);
        date.increment();
        System.out.println("Test 2B: " + date.toString());
        Assert.assertEquals("3 June 1994", date.toString());
    }

    @Test
    public void testNext_3B() {
        DateUtil date = new DateUtil(15, 6, 1994);
        date.increment();
        System.out.println("Test 3B: " + date.toString());
        Assert.assertEquals("16 June 1994", date.toString());
    }

    @Test
    public void testNext_4B() {
        DateUtil date = new DateUtil(30, 6, 1994);
        date.increment();
        System.out.println("Test 4B: " + date.toString());
        Assert.assertEquals("1 July 1994", date.toString());
    }

    @Test(expected = RuntimeException.class)
    public void testNext_5B() {
        System.out.println("Test 5B: Invalid Date");
        new DateUtil(31, 6, 1994);
    }

    @Test
    public void testNext_6B() {
        DateUtil date = new DateUtil(15, 1, 1994);
        date.increment();
        System.out.println("Test 6B: " + date.toString());
        Assert.assertEquals("16 January 1994", date.toString());
    }

    @Test
    public void testNext_7B() {
        DateUtil date = new DateUtil(15, 2, 1994);
        date.increment();
        System.out.println("Test 7B: " + date.toString());
        Assert.assertEquals("16 February 1994", date.toString());
    }

    @Test
    public void testNext_8B() {
        DateUtil date = new DateUtil(15, 11, 1994);
        date.increment();
        System.out.println("Test 8B: " + date.toString());
        Assert.assertEquals("16 November 1994", date.toString());
    }

    @Test
    public void testNext_9B() {
        DateUtil date = new DateUtil(15, 12, 1994);
        date.increment();
        System.out.println("Test 9B: " + date.toString());
        Assert.assertEquals("16 December 1994", date.toString());
    }

    @Test
    public void testNext_10B() {
        DateUtil date = new DateUtil(15, 6, 1700);
        date.increment();
        System.out.println("Test 10B: " + date.toString());
        Assert.assertEquals("16 June 1700", date.toString());
    }

    @Test
    public void testNext_11B() {
        DateUtil date = new DateUtil(15, 6, 1701);
        date.increment();
        System.out.println("Test 11B: " + date.toString());
        Assert.assertEquals("16 June 1701", date.toString());
    }

    @Test
    public void testNext_12B() {
        DateUtil date = new DateUtil(15, 6, 2023);
        date.increment();
        System.out.println("Test 12B: " + date.toString());
        Assert.assertEquals("16 June 2023", date.toString());
    }

    @Test
    public void testNext_13B() {
        DateUtil date = new DateUtil(15, 6, 2024);
        date.increment();
        System.out.println("Test 13B: " + date.toString());
        Assert.assertEquals("16 June 2024", date.toString());
    }
    
 // --- Equivalence Class Tests ---

    @Test
    public void testD1_M1_Y3() {
        DateUtil date = new DateUtil(15, 6, 2023);
        date.increment();
        System.out.println("testD1_M1_Y3: " + date.toString());
        Assert.assertEquals("16 June 2023", date.toString());
        System.out.println("testD1_M1_Y3: Test Passed\n");
    }

    @Test
    public void testD2_M3_Y2() {
        DateUtil date = new DateUtil(29, 2, 2024);
        date.increment();
        System.out.println("testD2_M3_Y2: " + date.toString());
        Assert.assertEquals("1 March 2024", date.toString());
        System.out.println("testD2_M3_Y2: Test Passed\n");
    }

    @Test(expected = RuntimeException.class)
    public void testD2_M3_Y3_Invalid() {
        System.out.println("testD2_M3_Y3_Invalid: Invalid Date");
        new DateUtil(29, 2, 2023);
    }

    @Test
    public void testD3_M1_Y1() {
        DateUtil date = new DateUtil(30, 4, 2000);
        date.increment();
        System.out.println("testD3_M1_Y1: " + date.toString());
        Assert.assertEquals("1 May 2000", date.toString());
        System.out.println("testD3_M1_Y1: Test Passed\n");
    }

    @Test
    public void testD4_M2_Y2() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        System.out.println("testD4_M2_Y2: " + date.toString());
        Assert.assertEquals("1 February 2024", date.toString());
        System.out.println("testD4_M2_Y2: Test Passed\n");
    }

    @Test(expected = RuntimeException.class)
    public void testD4_M1_Invalid() {
        System.out.println("testD4_M1_Invalid: Invalid Date");
        new DateUtil(31, 6, 2024);
    }

    @Test(expected = RuntimeException.class)
    public void testD3_M3_Invalid() {
        System.out.println("testD3_M3_Invalid: Invalid Date");
        new DateUtil(30, 2, 2020);
    }

    @Test
    public void testD1_M2_Y2() {
        DateUtil date = new DateUtil(15, 3, 2024);
        date.increment();
        System.out.println("testD1_M2_Y2: " + date.toString());
        Assert.assertEquals("16 March 2024", date.toString());
        System.out.println("testD1_M2_Y2: Test Passed\n");
    }
}
