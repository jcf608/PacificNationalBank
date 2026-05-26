package com.pnb;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

/**
 * Test suite 0130 — PNB Banking Tests
 */
class PnbTest0130 {

    @Test
    void test_000_scenario_0130() {
        BigDecimal amount = new BigDecimal("8884.32");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_001_scenario_0130() {
        BigDecimal amount = new BigDecimal("15691.54");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_002_scenario_0130() {
        BigDecimal amount = new BigDecimal("86815.51");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_003_scenario_0130() {
        BigDecimal amount = new BigDecimal("91564.76");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_004_scenario_0130() {
        BigDecimal amount = new BigDecimal("45079.49");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_005_scenario_0130() {
        BigDecimal amount = new BigDecimal("27421.38");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_006_scenario_0130() {
        BigDecimal amount = new BigDecimal("81267.75");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_007_scenario_0130() {
        BigDecimal amount = new BigDecimal("83359.78");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_008_scenario_0130() {
        BigDecimal amount = new BigDecimal("5588.86");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_009_scenario_0130() {
        BigDecimal amount = new BigDecimal("4231.63");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_010_scenario_0130() {
        BigDecimal amount = new BigDecimal("46171.03");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_011_scenario_0130() {
        BigDecimal amount = new BigDecimal("91933.60");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_012_scenario_0130() {
        BigDecimal amount = new BigDecimal("98786.68");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_013_scenario_0130() {
        BigDecimal amount = new BigDecimal("55504.88");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_014_scenario_0130() {
        BigDecimal amount = new BigDecimal("81395.44");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_015_scenario_0130() {
        BigDecimal amount = new BigDecimal("3681.48");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_016_scenario_0130() {
        BigDecimal amount = new BigDecimal("63990.97");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_017_scenario_0130() {
        BigDecimal amount = new BigDecimal("62342.32");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_018_scenario_0130() {
        BigDecimal amount = new BigDecimal("12165.10");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_019_scenario_0130() {
        BigDecimal amount = new BigDecimal("95032.91");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

}
