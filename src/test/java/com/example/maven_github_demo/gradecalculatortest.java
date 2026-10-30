package com.example.maven_github_demo;




import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class gradecalculatortest {

    @Test
    void testTotal() {
        assertEquals(225,
            gradecalculator.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0,
            gradecalculator.calculateAverage(75, 68, 82));
    }

    @Test
    void testPass() {
        assertTrue(gradecalculator.isPass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(gradecalculator.isPass(35.0));
    }
}
