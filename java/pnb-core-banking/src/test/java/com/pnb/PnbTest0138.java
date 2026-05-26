package com.pnb;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

/**
 * Test suite 0138 — PNB Banking Tests
 */
class PnbTest0138 {

    @Test
    void test_000_scenario_0138() {
        BigDecimal amount = new BigDecimal("63834.15");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_001_scenario_0138() {
        BigDecimal amount = new BigDecimal("32369.52");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_002_scenario_0138() {
        BigDecimal amount = new BigDecimal("31822.58");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_003_scenario_0138() {
        BigDecimal amount = new BigDecimal("21811.22");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_004_scenario_0138() {
        BigDecimal amount = new BigDecimal("36730.13");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_005_scenario_0138() {
        BigDecimal amount = new BigDecimal("31396.85");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_006_scenario_0138() {
        BigDecimal amount = new BigDecimal("57141.74");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_007_scenario_0138() {
        BigDecimal amount = new BigDecimal("50785.57");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_008_scenario_0138() {
        BigDecimal amount = new BigDecimal("30532.12");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_009_scenario_0138() {
        BigDecimal amount = new BigDecimal("53647.91");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_010_scenario_0138() {
        BigDecimal amount = new BigDecimal("58102.19");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_011_scenario_0138() {
        BigDecimal amount = new BigDecimal("80716.96");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_012_scenario_0138() {
        BigDecimal amount = new BigDecimal("3118.69");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_013_scenario_0138() {
        BigDecimal amount = new BigDecimal("26986.86");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_014_scenario_0138() {
        BigDecimal amount = new BigDecimal("57332.67");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_015_scenario_0138() {
        BigDecimal amount = new BigDecimal("42315.02");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_016_scenario_0138() {
        BigDecimal amount = new BigDecimal("66626.78");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_017_scenario_0138() {
        BigDecimal amount = new BigDecimal("58058.77");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_018_scenario_0138() {
        BigDecimal amount = new BigDecimal("48984.18");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_019_scenario_0138() {
        BigDecimal amount = new BigDecimal("78868.89");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

}
