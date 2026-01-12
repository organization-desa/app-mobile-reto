package com.example.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilsTest {
    
    @Test
    public void testIsEmailValid() {
        assertTrue(Utils.isEmailValid("test@example.com"));
        assertTrue(Utils.isEmailValid("user.name@domain.co.uk"));
        assertFalse(Utils.isEmailValid("invalid-email"));
        assertFalse(Utils.isEmailValid(""));
        assertFalse(Utils.isEmailValid(null));
    }
    
    @Test
    public void testReverseString() {
        assertEquals("olleh", Utils.reverseString("hello"));
        assertEquals("", Utils.reverseString(""));
        assertEquals("", Utils.reverseString(null));
        assertEquals("racecar", Utils.reverseString("racecar"));
    }
}