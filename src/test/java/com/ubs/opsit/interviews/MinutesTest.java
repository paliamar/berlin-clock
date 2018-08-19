/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.Minutes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apali
 */
public class MinutesTest {

    Minutes minutes = new Minutes();

    public MinutesTest() {
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

    @Test
    public void testMinutes() {
        Assert.assertEquals(16, minutes.convertTime("34").length());

    }

    @Test
    public void testMinutes369() {

        String minutes32 = minutes.convertTime("32");
        Assert.assertEquals("R", minutes32.substring(2, 3));
        Assert.assertEquals("R", minutes32.substring(5, 6));
        Assert.assertEquals("O", minutes32.substring(8, 9));
    }

    @Test
    public void testTopMinutesShouldLightYellowLampForEvery5MinutesUnlessItIsFirstQuarterHalfOrLastQuarter() {
        Assert.assertEquals("OOOOOOOOOOO" + "\n" + "OOOO", minutes.convertTime("0"));
        Assert.assertEquals("YYROOOOOOOO" + "\n" + "YYOO", minutes.convertTime("17"));
        Assert.assertEquals("YYRYYRYYRYY" + "\n" + "YYYY", minutes.convertTime("59"));
    }
}
