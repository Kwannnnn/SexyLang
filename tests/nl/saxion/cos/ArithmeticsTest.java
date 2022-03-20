package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static nl.saxion.cos.SexyLangUtils.*;

public class ArithmeticsTest extends TestBase {
    // STRINGS
    @Test
    @DisplayName("Bad Weather: String subtraction not allowed")
    void badWeather_checkStringSubtraction() throws Exception {
        Compiler c = new Compiler();
        // String - Int should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " \"shrek\" - 2", "stringMinInt");
        assertNull(code, "Subtraction of strings and integers should not be allowed");

        // String - Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" - hard", "stringMinBoolean");
        assertNull(code, "Subtraction of strings and booleans should not be allowed");

        // String - String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" - \"shrek\"", "stringMinString");
        assertNull(code, "Subtraction of strings should not be allowed");

        // String - Float should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" - 42.37", "stringMinFloat");
        assertNull(code, "Subtraction of strings and floats should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: String multiplication not allowed")
    void badWeather_string_MUL() throws Exception {
        Compiler c = new Compiler();
        // String * Int should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " \"shrek\" * 2", "stringMinInt");
        assertNull(code, "Multiplication of strings and integers should not be allowed");

        // String * Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" * hard", "stringMinBoolean");
        assertNull(code, "Multiplication of strings and booleans should not be allowed");

        // String * String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" * \"shrek\"", "stringMinString");
        assertNull(code, "Multiplication of strings should not be allowed");

        // String * Float should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" * 42.37", "stringMinFloat");
        assertNull(code, "Multiplication of strings and floats should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: String division not allowed")
    void badWeather_string_DIV() throws Exception {
        Compiler c = new Compiler();
        // String / Int should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " \"shrek\" / 2", "stringMinInt");
        assertNull(code, "Division of strings and integers should not be allowed");

        // String / Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" / hard", "stringMinBoolean");
        assertNull(code, "Division of strings and booleans should not be allowed");

        // String / String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" / \"shrek\"", "stringMinString");
        assertNull(code, "Division of strings should not be allowed");

        // String / Float should not be allowed
        code = c.compileString(MOAN_KEYWORD + " \"shrek\" / 42.37", "stringMinFloat");
        assertNull(code, "Division of strings and floats should not be allowed");
    }

    // BOOLEANS
    @Test
    @DisplayName("Bad Weather: Boolean + Boolean not allowed")
    void checkBooleanAddition() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " hard + soft", "floatPlusFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean - Boolean not allowed")
    void checkBooleanSubtraction() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " hard - soft", "floatPlusFloat");
        assertNull(code);
    }

    // FLOATS
    @Test
    @DisplayName("Good Weather: Float + Float")
    void float_ADD() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 37.42 + 42.37", "floatPlusFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(37.42f + 42.37f)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float - Float")
    void float_MIN() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 37.42 - 42.37", "floatMinFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(37.42f - 42.37f)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float * Float")
    void float_MUL() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 37.42 * 2.0", "floatMulFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(37.42f * 2f)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float / Float")
    void float_DIV() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 37.42 / 2.0", "floatMulFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(37.42f / 2f)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Float + Different Type not allowed")
    void badWeather_float_ADD() throws Exception {
        Compiler c = new Compiler();
        // Float + Int should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42.0 + 1", "floatPlusInt");
        assertNull(code, "Addition of floats and integers should not be allowed");

        // Float + Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 42.37 + hard", "floatPlusBoolean");
        assertNull(code, "Addition of floats and booleans should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Float - Different Type not allowed")
    void badWeather_float_SUB() throws Exception {
        Compiler c = new Compiler();
        // Float - Int should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42.0 - 1", "floatMinInt");
        assertNull(code, "Subtraction of floats and integers should not be allowed");

        // Float - Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 42.37 - hard", "floatMinBoolean");
        assertNull(code, "Subtraction of floats and booleans should not be allowed");

        // Float - String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 42.37 - \"shrek\"", "floatMinString");
        assertNull(code, "Subtraction of floats and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Float * Different Type not allowed")
    void badWeather_float_MUL() throws Exception {
        Compiler c = new Compiler();
        // Float * Int should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42.0 * 1", "floatMulInt");
        assertNull(code, "Multiplication of floats and integers should not be allowed");

        // Float * Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 42.37 * hard", "floatMulBoolean");
        assertNull(code, "Multiplication of floats and booleans should not be allowed");

        // Float * String should not be allowed
        code = c.compileString("moan 42.37 * \"shrek\"", "floatMulString");
        assertNull(code, "Multiplication of floats and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Float / Different Type not allowed")
    void badWeather_float_DIV() throws Exception {
        Compiler c = new Compiler();
        // Float / Int should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42.0 / 1", "floatMulInt");
        assertNull(code, "Division of floats and integers should not be allowed");

        // Float / Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 42.37 / hard", "floatDivBoolean");
        assertNull(code, "Division of floats and booleans should not be allowed");

        // Float / String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 42.37 / \"shrek\"", "floatDivString");
        assertNull(code, "Division of floats and strings should not be allowed");
    }

    // INTEGERS
    @Test
    @DisplayName("Good Weather: Int + Int")
    void int_ADD() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42 + 37", "intPlusInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(42 + 37)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int - Int")
    void int_SUB() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42 - 37", "intMinInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(42 - 37)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int * Int")
    void int_MUL() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42 * 37", "intMulInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(42 * 37)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int / Int")
    void int_DIV() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 42 / 37", "intDivInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(42 / 37)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int + Different Type not allowed")
    void badWeather_checkIntegerAddition() throws Exception {
        // Compile and assemble the string 'hello; hi;'
        Compiler c = new Compiler();
        // Int - Float should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 1 + 42.37", "integerPlusFloat");
        assertNull(code, "Addition of integers and floats should not be allowed");

        // Float - Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 1 + hard", "integerPlusBoolean");
        assertNull(code, "Addition of integers and booleans should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Int - Different Type not allowed")
    void badWeather_checkIntegerSubtraction() throws Exception {
        // Compile and assemble the string 'hello; hi;'
        Compiler c = new Compiler();
        // Int - Float should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 1 - 42.37", "integerMinFloat");
        assertNull(code, "Subtraction of integers and floats should not be allowed");

        // Float - Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 1 - hard", "integerMinBoolean");
        assertNull(code, "Subtraction of integers and booleans should not be allowed");

        // Float - String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 1 - \"shrek\"", "integerMinString");
        assertNull(code, "Subtraction of integers and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Int * Different Type not allowed")
    void badWeather_int_MUL() throws Exception {
        Compiler c = new Compiler();
        // Int * Float should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 37 * 42.0", "intMulFloat");
        assertNull(code, "Multiplication of integers and floats should not be allowed");

        // Int * Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 37 * hard", "intMulBoolean");
        assertNull(code, "Multiplication of integers and booleans should not be allowed");

        // Int * String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 37 * \"shrek\"", "intMulString");
        assertNull(code, "Multiplication of integers and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Int / Different Type not allowed")
    void badWeather_int_DIV() throws Exception {
        Compiler c = new Compiler();
        // Int / Float should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " 37 / 42.37", "intDivFloat");
        assertNull(code, "Division of integers and floats should not be allowed");

        // Int / Boolean should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 37 / hard", "intDivBoolean");
        assertNull(code, "Division of integers and booleans should not be allowed");

        // Int / String should not be allowed
        code = c.compileString(MOAN_KEYWORD + " 37 / \"shrek\"", "intDivString");
        assertNull(code, "Division of integers and strings should not be allowed");
    }

    @Test
    @DisplayName("Operand precedence: PAREN -> MUL / DIV -> ADD / SUB")
    void operandPrecedence() throws Exception {
        Compiler c = new Compiler();
        // Int / Float should not be allowed
        JasminBytecode code = c.compileString(MOAN_KEYWORD + " ((37 + 37) + 3 * 7 - 1) + 1", "operatorPrecedence");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(((37 + 37) + 3 * 7 - 1) + 1)
        }, output.toArray());
    }
}
