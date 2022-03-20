package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static nl.saxion.cos.SexyLangUtils.HARD_KEYWORD;
import static nl.saxion.cos.SexyLangUtils.MOAN_KEYWORD;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringConcatenationTest extends TestBase {
    @Test
    @DisplayName("String + String concatenation")
    void stringConcatenation() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " \"shrek\" + \"fiona\"", "stringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek" + "fiona"
        }, output.toArray());
    }

    @Test
    @DisplayName("Float + String concatenation")
    void float_stringConcatenation() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 37.42 + \"shrek\"", "floatStringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                37.42F + "shrek"
        }, output.toArray());

        code = c.compileString(MOAN_KEYWORD + " \"shrek\" + 37.42", "stringFloatConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek" + 37.42F
        }, output.toArray());
    }

    @Test
    @DisplayName("Boolean + String concatenation")
    void boolean_stringConcatenation() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " " + HARD_KEYWORD + " + \"shrek\"", "booleanStringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                HARD_KEYWORD + "shrek"
        }, output.toArray());

        code = c.compileString(MOAN_KEYWORD + " \"shrek\" + " + HARD_KEYWORD, "stringBooleanConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek" + HARD_KEYWORD
        }, output.toArray());
    }

    @Test
    @DisplayName("Int + String concatenation")
    void integer_stringConcatenation() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 2 + \"shrek\"", "intStringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                2 + "shrek"
        }, output.toArray());

        code = c.compileString(MOAN_KEYWORD + " \"shrek\" + 2", "stringIntConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek" + 2
        }, output.toArray());
    }

}
