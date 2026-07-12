package com.pnb;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

/**
 * Test suite 0158 — PNB Banking Tests
 */
class PnbTest0158 {

    @Test
    void test_000_scenario_0158() {
        BigDecimal amount = new BigDecimal("59701.38");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_001_scenario_0158() {
        BigDecimal amount = new BigDecimal("32742.93");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_002_scenario_0158() {
        BigDecimal amount = new BigDecimal("80689.48");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_003_scenario_0158() {
        BigDecimal amount = new BigDecimal("41642.93");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_004_scenario_0158() {
        BigDecimal amount = new BigDecimal("77865.72");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_005_scenario_0158() {
        BigDecimal amount = new BigDecimal("57865.70");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_006_scenario_0158() {
        BigDecimal amount = new BigDecimal("85733.91");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_007_scenario_0158() {
        BigDecimal amount = new BigDecimal("63127.12");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_008_scenario_0158() {
        BigDecimal amount = new BigDecimal("24480.17");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_009_scenario_0158() {
        BigDecimal amount = new BigDecimal("30867.61");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_010_scenario_0158() {
        BigDecimal amount = new BigDecimal("95847.17");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_011_scenario_0158() {
        BigDecimal amount = new BigDecimal("26259.97");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_012_scenario_0158() {
        BigDecimal amount = new BigDecimal("55435.14");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_013_scenario_0158() {
        BigDecimal amount = new BigDecimal("14547.48");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_014_scenario_0158() {
        BigDecimal amount = new BigDecimal("8393.24");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_015_scenario_0158() {
        BigDecimal amount = new BigDecimal("24935.43");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_016_scenario_0158() {
        BigDecimal amount = new BigDecimal("13694.63");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_017_scenario_0158() {
        BigDecimal amount = new BigDecimal("12517.03");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_018_scenario_0158() {
        BigDecimal amount = new BigDecimal("20203.38");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_019_scenario_0158() {
        BigDecimal amount = new BigDecimal("1730.24");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

}
