package com.pnb;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

/**
 * Test suite 0173 — PNB Banking Tests
 */
class PnbTest0173 {

    @Test
    void test_000_scenario_0173() {
        BigDecimal amount = new BigDecimal("91213.72");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_001_scenario_0173() {
        BigDecimal amount = new BigDecimal("57004.43");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_002_scenario_0173() {
        BigDecimal amount = new BigDecimal("72091.18");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_003_scenario_0173() {
        BigDecimal amount = new BigDecimal("77499.97");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_004_scenario_0173() {
        BigDecimal amount = new BigDecimal("71468.86");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_005_scenario_0173() {
        BigDecimal amount = new BigDecimal("57004.84");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_006_scenario_0173() {
        BigDecimal amount = new BigDecimal("12354.70");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_007_scenario_0173() {
        BigDecimal amount = new BigDecimal("75192.48");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_008_scenario_0173() {
        BigDecimal amount = new BigDecimal("53436.80");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_009_scenario_0173() {
        BigDecimal amount = new BigDecimal("28494.01");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(5, amount.scale());
    }

    @Test
    void test_010_scenario_0173() {
        BigDecimal amount = new BigDecimal("63267.54");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_011_scenario_0173() {
        BigDecimal amount = new BigDecimal("88181.87");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_012_scenario_0173() {
        BigDecimal amount = new BigDecimal("25041.67");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_013_scenario_0173() {
        BigDecimal amount = new BigDecimal("75008.43");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_014_scenario_0173() {
        BigDecimal amount = new BigDecimal("33121.24");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_015_scenario_0173() {
        BigDecimal amount = new BigDecimal("52354.69");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(2, amount.scale());
    }

    @Test
    void test_016_scenario_0173() {
        BigDecimal amount = new BigDecimal("31636.75");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(3, amount.scale());
    }

    @Test
    void test_017_scenario_0173() {
        BigDecimal amount = new BigDecimal("66819.34");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

    @Test
    void test_018_scenario_0173() {
        BigDecimal amount = new BigDecimal("3960.21");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(4, amount.scale());
    }

    @Test
    void test_019_scenario_0173() {
        BigDecimal amount = new BigDecimal("98709.28");
        assertNotNull(amount);
        assertTrue(amount.compareTo(BigDecimal.ZERO) > 0);
        assertEquals(1, amount.scale());
    }

}
