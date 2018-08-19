package com.ubs.opsit.interviews;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amarpali
 */
public class HoursTest {
    
    public HoursTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertTime method, of class Hours.
     */
    @Test
    public void testConvertTime() {
        System.out.println("convertTime");
        String hrs = "11";
        Hours instance = new Hours();
        String expResult = "RROO"+"\n"+ "ROOO";
        String result = instance.convertTime(hrs);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLampForHoursMultipleOfFive method, of class Hours.
     */
    @Test
    public void testGetLampForHoursMultipleOfFive() {
        System.out.println("getLampForHoursMultipleOfFive");
        int hr = 12;
        Hours instance = new Hours();
        String expResult = "RROO";
        String result = instance.getLampForHoursMultipleOfFive(hr);
        assertEquals(expResult, result);
    }

    /**
     * Test of getLampForSingleHours method, of class Hours.
     */
    @Test
    public void testGetLampForSingleHours() {
        System.out.println("getLampForSingleHours");
        int hr = 6;
        Hours instance = new Hours();
        String expResult = "ROOO";
        String result = instance.getLampForSingleHours(hr);
        assertEquals(expResult, result);
    }
    
}
