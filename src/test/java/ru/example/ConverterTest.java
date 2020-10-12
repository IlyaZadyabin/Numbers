package ru.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        assertEquals("5", Converter.Conversion("101", 2, 10));
        assertEquals("1010", Converter.Conversion("A", 16, 2));
        assertEquals("8", Converter.Conversion("10", 8, 10));
        assertEquals("0", Converter.Conversion("0", 8, 10));

    }
}
