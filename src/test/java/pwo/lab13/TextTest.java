package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {
    
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void cont5DigTest1(String str) {
        System.out.println("Test 1 pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test 1 negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void numOfDigitsTest(String str) {
        System.out.println("Test 2 pozytywny dla: " + str);
        assertEquals(Text.numOfDigits(str), 5);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb343sd", "1 2 3 4 5", "xx12x12x1x"})
    void numOfDigitsTest2(String str) {
        System.out.println("Test 2 negatywny dla: " + str);
        assertNotEquals(Text.numOfDigits(str), 4);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aabbsd", "qwerty", "xxxxx"})
    void notContDigitsTest(String str) {
        System.out.println("Test 3 pozytywny dla: " + str);
        assertTrue(Text.notContDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aab121bsd", "qwerty1", "1x1x2x2x3x3"})
    void notContDigitsTest2(String str) {
        System.out.println("Test 3 negatywny dla: " + str);
        assertFalse(Text.notContDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"553433", "887766", "112233"})
    void contOnlyDigitsTest(String str) {
        System.out.println("Test 4 pozytywny dla: " + str);
        assertTrue(Text.contOnlyDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"5a5b3433", "88a77a66", "1a12233d"})
    void contOnlyDigitsTest2(String str) {
        System.out.println("Test 4 negatywny dla: " + str);
        assertFalse(Text.contOnlyDigits(str));
    }
    
}
