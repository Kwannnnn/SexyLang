package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticsTest extends TestBase {
    // Language specifics
    public static final String MOAN_KEYWORD = "moan";
    public static final String ADD_SIGN = "+";
    public static final String SUB_SIGN = "-";
    public static final String MUL_SIGN = "*";
    public static final String DIV_SIGN = "/";
    // Test values
    public static final String STRING = "shrek";
    public static final int INTEGER = 37;
    public static final float FLOAT = 42.37F;
    public static final String BOOLEAN = "hard";

    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    // STRINGS
    @Test
    @DisplayName("Bad Weather: String subtraction not allowed")
    void badWeather_checkStringSubtraction() throws Exception {
        // moan "shrek" - 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + SUB_SIGN + INTEGER;
        // String - Int should not be allowed
        JasminBytecode code = this.c.compileString(srcCode, "stringMinInt");
        assertNull(code, "Subtraction of strings and integers should not be allowed");

        // moan "shrek" - hard
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + SUB_SIGN + BOOLEAN;
        // String - Boolean should not be allowed
        code = this.c.compileString(srcCode, "stringMinBoolean");
        assertNull(code, "Subtraction of strings and booleans should not be allowed");

        // moan "shrek" - "shrek"
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + SUB_SIGN + "\"" + STRING + "\"";
        // String - String should not be allowed
        code = this.c.compileString(srcCode, "stringMinString");
        assertNull(code, "Subtraction of strings should not be allowed");

        // moan "shrek" - 42.37
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + SUB_SIGN + FLOAT;
        // String - Float should not be allowed
        code = this.c.compileString(srcCode, "stringMinFloat");
        assertNull(code, "Subtraction of strings and floats should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: String multiplication not allowed")
    void badWeather_string_MUL() throws Exception {
        // String * Int should not be allowed
        // moan "shrek" * 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + MUL_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "stringMinInt");
        assertNull(code, "Multiplication of strings and integers should not be allowed");

        // String * Boolean should not be allowed
        // moan "shrek" * hard
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + MUL_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "stringMinBoolean");
        assertNull(code, "Multiplication of strings and booleans should not be allowed");

        // String * String should not be allowed
        // moan "shrek" * "shrek"
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + MUL_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "stringMinString");
        assertNull(code, "Multiplication of strings should not be allowed");

        // String * Float should not be allowed
        // moan "shrek" * 42.37
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + MUL_SIGN + FLOAT;
        code = this.c.compileString(srcCode, "stringMinFloat");
        assertNull(code, "Multiplication of strings and floats should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: String division not allowed")
    void badWeather_string_DIV() throws Exception {
        // String / Int should not be allowed
        // moan "shrek" / 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + DIV_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "stringDivInt");
        assertNull(code, "Division of strings and integers should not be allowed");

        // String / Boolean should not be allowed
        // moan "shrek" / hard
        srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + DIV_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "stringDivBoolean");
        assertNull(code, "Division of strings and booleans should not be allowed");

        // String / String should not be allowed
        // moan "shrek" / "shrek"
        srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + DIV_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "stringDivString");
        assertNull(code, "Division of strings should not be allowed");

        // String / Float should not be allowed
        // moan "shrek" / 42.37
        srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + DIV_SIGN + FLOAT;
        code = this.c.compileString(srcCode, "stringDivFloat");
        assertNull(code, "Division of strings and floats should not be allowed");
    }

    // BOOLEANS
    @Test
    @DisplayName("Bad Weather: Boolean addition not allowed")
    void badWeather_boolean_ADD() throws Exception {
        // Boolean + Boolean should not be allowed
        // moan hard + hard
        String srcCode = MOAN_KEYWORD + " " + BOOLEAN + ADD_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanPlusBoolean");
        assertNull(code);

        // Boolean + Integer should not be allowed
        // moan hard + 37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + ADD_SIGN + INTEGER;
        code = this.c.compileString(srcCode, "booleanPlusInteger");
        assertNull(code);

        // Boolean + Float should not be allowed
        // moan hard + 42.37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + ADD_SIGN + FLOAT;
        code = this.c.compileString(srcCode, "booleanPlusFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean subtraction not allowed")
    void badWeather_boolean_SUB() throws Exception {
        // Boolean - Boolean should not be allowed
        // moan hard - hard
        String srcCode = MOAN_KEYWORD + " " + BOOLEAN + SUB_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanMinBoolean");
        assertNull(code);

        // Boolean - Integer should not be allowed
        // moan hard - 37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + SUB_SIGN + INTEGER;
        code = this.c.compileString(srcCode, "booleanMinInteger");
        assertNull(code);

        // Boolean - Float should not be allowed
        // moan hard - 42.37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + SUB_SIGN + FLOAT;
        code = this.c.compileString(srcCode, "booleanMinFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean multiplication not allowed")
    void badWeather_boolean_MUL() throws Exception {
        // Boolean * Boolean should not be allowed
        // moan hard * hard
        String srcCode = MOAN_KEYWORD + " " + BOOLEAN + MUL_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanMulBoolean");
        assertNull(code);

        // Boolean * Integer should not be allowed
        // moan hard * 37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + MUL_SIGN + INTEGER;
        code = this.c.compileString(srcCode, "booleanMulInteger");
        assertNull(code);

        // Boolean * Float should not be allowed
        // moan hard * 42.37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + MUL_SIGN + FLOAT;
        code = this.c.compileString(srcCode, "booleanMulFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean division not allowed")
    void badWeather_boolean_DIV() throws Exception {
        // Boolean / Boolean should not be allowed
        // moan hard / hard
        String srcCode = MOAN_KEYWORD + " " + BOOLEAN + DIV_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanDivBoolean");
        assertNull(code);

        // Boolean / Integer should not be allowed
        // moan hard / 37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + DIV_SIGN + INTEGER;
        code = this.c.compileString(srcCode, "booleanDivInteger");
        assertNull(code);

        // Boolean / Float should not be allowed
        // moan hard / 42.37
        srcCode = MOAN_KEYWORD + " " + BOOLEAN + DIV_SIGN + FLOAT;
        code = this.c.compileString(srcCode, "booleanDivFloat");
        assertNull(code);
    }

    // FLOATS
    @Test
    @DisplayName("Good Weather: Float + Float")
    void float_ADD() throws Exception {
        // moan 42.37 + 42.37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + ADD_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "floatPlusFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT + FLOAT)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float - Float")
    void float_MIN() throws Exception {
        // moan 42.37 + 42.37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + SUB_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "floatMinFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT - FLOAT)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float * Float")
    void float_MUL() throws Exception {
        // moan 42.37 * 42.37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + MUL_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "floatMulFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT * FLOAT)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float / Float")
    void float_DIV() throws Exception {
        // moan 42.37 / 42.37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + DIV_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "floatDivFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT / FLOAT)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Float + Different Type not allowed")
    void badWeather_float_ADD() throws Exception {
        // Float + Int should not be allowed
        // moan 42.37 + 37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + ADD_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "floatPlusInt");
        assertNull(code, "Addition of floats and integers should not be allowed");

        // Float + Boolean should not be allowed
        // moan 42.37 + hard
        srcCode = MOAN_KEYWORD + " " + FLOAT + ADD_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "floatPlusBoolean");
        assertNull(code, "Addition of floats and booleans should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Float - Different Type not allowed")
    void badWeather_float_SUB() throws Exception {
        // Float - Int should not be allowed
        // moan 42.37 - 37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + SUB_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "floatMinInt");
        assertNull(code, "Subtraction of floats and integers should not be allowed");

        // Float - Boolean should not be allowed
        // moan 42.37 - hard
        srcCode = MOAN_KEYWORD + " " + FLOAT + SUB_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "floatMinBoolean");
        assertNull(code, "Subtraction of floats and booleans should not be allowed");

        // Float - String should not be allowed
        // moan 42.37 - "shrek"
        srcCode = MOAN_KEYWORD + " " + FLOAT + SUB_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "floatMinString");
        assertNull(code, "Subtraction of floats and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Float * Different Type not allowed")
    void badWeather_float_MUL() throws Exception {
        // Float * Int should not be allowed
        // moan 42.37 * 37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + MUL_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "floatMulInt");
        assertNull(code, "Multiplication of floats and integers should not be allowed");

        // Float * Boolean should not be allowed
        // moan 42.37 * hard
        srcCode = MOAN_KEYWORD + " " + FLOAT + MUL_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "floatMulBoolean");
        assertNull(code, "Multiplication of floats and booleans should not be allowed");

        // Float * String should not be allowed
        // moan 42.37 * "shrek"
        srcCode = MOAN_KEYWORD + " " + FLOAT + MUL_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "floatMulString");
        assertNull(code, "Multiplication of floats and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Float / Different Type not allowed")
    void badWeather_float_DIV() throws Exception {
        // Float / Int should not be allowed
        // moan 42.37 / 37
        String srcCode = MOAN_KEYWORD + " " + FLOAT + DIV_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "floatDivInt");
        assertNull(code, "Division of floats and integers should not be allowed");

        // Float / Boolean should not be allowed
        // moan 42.37 / hard
        srcCode = MOAN_KEYWORD + " " + FLOAT + DIV_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "floatDivBoolean");
        assertNull(code, "Division of floats and booleans should not be allowed");

        // Float / String should not be allowed
        // moan 42.37 / "shrek"
        srcCode = MOAN_KEYWORD + " " + FLOAT + DIV_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "floatDivString");
        assertNull(code, "Division of floats and strings should not be allowed");
    }

    // INTEGERS
    @Test
    @DisplayName("Good Weather: Int + Int")
    void int_ADD() throws Exception {
        // moan 37 + 37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + ADD_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "intPlusInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER + INTEGER)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int - Int")
    void int_SUB() throws Exception {
        // moan 37 - 37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + SUB_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "intMinInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER - INTEGER)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int * Int")
    void int_MUL() throws Exception {
        // moan 37 * 37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + MUL_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "intMulInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER * INTEGER)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int / Int")
    void int_DIV() throws Exception {
        // moan 37 / 37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + DIV_SIGN + INTEGER;
        JasminBytecode code = this.c.compileString(srcCode, "intDivInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER / INTEGER)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int + Different Type not allowed")
    void badWeather_int_ADD() throws Exception {
        // Int + Float should not be allowed
        // moan 37 + 42.37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + ADD_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "integerPlusFloat");
        assertNull(code, "Addition of integers and floats should not be allowed");

        // Float + Boolean should not be allowed
        // moan 37 + hard
        srcCode = MOAN_KEYWORD + " " + INTEGER + ADD_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "integerPlusBoolean");
        assertNull(code, "Addition of integers and booleans should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Int - Different Type not allowed")
    void badWeather_int_SUB() throws Exception {
        // Int - Float should not be allowed
        // moan 37 - 42.37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + SUB_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "integerMinFloat");
        assertNull(code, "Subtraction of integers and floats should not be allowed");

        // Int - Boolean should not be allowed
        // moan 37 - hard
        srcCode = MOAN_KEYWORD + " " + INTEGER + SUB_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "integerMinBoolean");
        assertNull(code, "Subtraction of integers and booleans should not be allowed");

        // Int - String should not be allowed
        // moan 37 - "shrek"
        srcCode = MOAN_KEYWORD + " " + INTEGER + SUB_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "integerMinString");
        assertNull(code, "Subtraction of integers and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Int * Different Type not allowed")
    void badWeather_int_MUL() throws Exception {
        // Int * Float should not be allowed
        // moan 37 * 42.37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + MUL_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "intMulFloat");
        assertNull(code, "Multiplication of integers and floats should not be allowed");

        // Int * Boolean should not be allowed
        // moan 37 * hard
        srcCode = MOAN_KEYWORD + " " + INTEGER + MUL_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "intMulBoolean");
        assertNull(code, "Multiplication of integers and booleans should not be allowed");

        // Int * String should not be allowed
        // moan 37 * "shrek"
        srcCode = MOAN_KEYWORD + " " + INTEGER + MUL_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "intMulString");
        assertNull(code, "Multiplication of integers and strings should not be allowed");
    }

    @Test
    @DisplayName("Bad Weather: Int / Different Type not allowed")
    void badWeather_int_DIV() throws Exception {
        // Int / Float should not be allowed
        // moan 37 / 42.37
        String srcCode = MOAN_KEYWORD + " " + INTEGER + DIV_SIGN + FLOAT;
        JasminBytecode code = this.c.compileString(srcCode, "intDivFloat");
        assertNull(code, "Division of integers and floats should not be allowed");

        // Int / Boolean should not be allowed
        // moan 37 / hard
        srcCode = MOAN_KEYWORD + " " + INTEGER + DIV_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "intDivBoolean");
        assertNull(code, "Division of integers and booleans should not be allowed");

        // Int / String should not be allowed
        // moan 37 / "shrek"
        srcCode = MOAN_KEYWORD + " " + INTEGER + DIV_SIGN + "\"" + STRING + "\"";
        code = this.c.compileString(srcCode, "intDivString");
        assertNull(code, "Division of integers and strings should not be allowed");
    }

    @Test
    @DisplayName("Operand precedence: PAREN -> MUL / DIV -> ADD / SUB")
    void operandPrecedence() throws Exception {
        // Int / Float should not be allowed
        JasminBytecode code = this.c.compileString(MOAN_KEYWORD + " ((37 + 37) + 3 * 7 - 1) + 1", "operatorPrecedence");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(((37 + 37) + 3 * 7 - 1) + 1)
        }, output.toArray());
    }
}
