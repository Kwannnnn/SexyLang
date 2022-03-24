package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LogicExpressionTest extends TestBase {
    // Language specifics
    public static final String MOAN_KEYWORD = "moan";
    public static final String GT_SIGN = ">";
    public static final String LT_SIGN = "<";
    public static final String LE_SIGN = "<=";
    public static final String GE_SIGN = ">=";
    public static final String EQUALS_SIGN = "==";
    // Test values
    public static final String BOOLEAN = "hard";
    public static final String STRING = "shrek";
    public static final int INTEGER_1 = 37;
    public static final int INTEGER_2 = 42;
    public static final float FLOAT_1 = 42.37F;
    public static final float FLOAT_2 = 37.42F;

    private static final Compiler COMPILER = new Compiler();

    @Test
    @DisplayName("Bad Weather: Int > Boolean is not allowed")
    void badWeather_int_GT_boolean() throws Exception {
        // moan 37 > hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GT_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGTBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int < Boolean is not allowed")
    void badWeather_int_LT_boolean() throws Exception {
        // moan 37 < hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "intLTBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int >= Boolean is not allowed")
    void badWeather_int_GE_boolean() throws Exception {
        // moan 37 >= hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGEBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int <= Boolean is not allowed")
    void badWeather_int_LE_boolean() throws Exception {
        // moan 37 <= hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LE_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "intLEBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int == Boolean is not allowed")
    void badWeather_int_EQUALS_boolean() throws Exception {
        // moan 37 == hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "intEQUALSBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int > Float is not allowed")
    void badWeather_int_GT_float() throws Exception {
        // moan 37 > 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GT_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGTFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int < Float is not allowed")
    void badWeather_int_LT_float() throws Exception {
        // moan 37 < 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intLTFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int >= Float is not allowed")
    void badWeather_int_GE_float() throws Exception {
        // moan 37 >= 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGEFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int == Float is not allowed")
    void badWeather_int_EQUALS_float() throws Exception {
        // moan 37 == 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intEQUALSFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int > String is not allowed")
    void badWeather_int_GT_string() throws Exception {
        // moan 37 > "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "intGTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int < String is not allowed")
    void badWeather_int_LT_string() throws Exception {
        // moan 37 < "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "intLTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int >= String is not allowed")
    void badWeather_int_GE_string() throws Exception {
        // moan 37 >= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "intGEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int <= String is not allowed")
    void badWeather_int_LE_string() throws Exception {
        // moan 37 <= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "intLEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int == String is not allowed")
    void badWeather_int_EQUALS_String() throws Exception {
        // moan 37 == "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "intEQUALSString");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Int > Int")
    void int_GT_int() throws Exception {
        // moan 42 > 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_2 + GT_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGTint_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_2 > INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int > Int")
    void badWeather_int_GT_int() throws Exception {
        // moan 37 > 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GT_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGTint_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 > INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int < Int")
    void int_LT_int() throws Exception {
        // moan 37 < 42
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intLTint_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 < INTEGER_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int < Int")
    void badWeather_int_LT_int() throws Exception {
        // moan 37 < 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intLTint_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 < INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int <= Int is valid")
    void int_LE_int() throws Exception {
        // moan 37 <= 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LE_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intLEint_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 <= INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int <= Int")
    void badWeather_int_LE_int() throws Exception {
        // moan 42 <= 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_2 + LE_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intLEint_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_2 <= INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int >= Int")
    void int_GE_int() throws Exception {
        // moan 37 >= 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGEint_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 >= INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int >= Int")
    void badWeather_int_GE_int() throws Exception {
        // moan 37 >= 42
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intGEint_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 >= INTEGER_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int == Int is valid")
    void int_EQUALS_int() throws Exception {
        // moan 37 == 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "intEQUALSint_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 == INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int == Int")
    void badWeather_int_EQUALS_int() throws Exception {
        // moan 37 == 42
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intEQUALSint_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 == INTEGER_2)
        }, output.toArray());
    }

    // FLOATS
    @Test
    @DisplayName("Bad Weather: Float > Int is not allowed")
    void badWeather_float_GT_int() throws Exception {
        // moan 42.37 > 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float < Int is not allowed")
    void badWeather_float_LT_int() throws Exception {
        // moan 42.37 < 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LT_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float >= Int is not allowed")
    void badWeather_float_GE_int() throws Exception {
        // moan 42.37 >= 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GE_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float <= Int is not allowed")
    void badWeather_float_LE_int() throws Exception {
        // moan 42.37 <= 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float == Int")
    void badWeather_float_EQUAL_int() throws Exception {
        // moan 42.37 == 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatEQUALint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float > Boolean is not allowed")
    void badWeather_float_GT_boolean() throws Exception {
        // moan 42.37 > hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float < Boolean is not allowed")
    void badWeather_float_LT_boolean() throws Exception {
        // moan 42.37 < hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LT_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float >= Boolean is not allowed")
    void badWeather_float_GE_boolean() throws Exception {
        // moan 42.37 >= hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GE_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float <= Boolean is not allowed")
    void badWeather_float_LE_boolean() throws Exception {
        // moan 42.37 <= hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float == Boolean")
    void badWeather_float_EQUAL_boolean() throws Exception {
        // moan 42.37 == hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatEQUALBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float > String is not allowed")
    void badWeather_float_GT_string() throws Exception {
        // moan 42.37 > "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float < String is not allowed")
    void badWeather_float_LT_string() throws Exception {
        // moan 42.37 < "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float >= String is not allowed")
    void badWeather_float_GE_string() throws Exception {
        // moan 42.37 >= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float <= String is not allowed")
    void badWeather_float_LE_string() throws Exception {
        // moan 42.37 <= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float == String")
    void badWeather_float_EQUAL_string() throws Exception {
        // moan 42.37 == "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "floatEQUALstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Float > Float")
    void float_GT_float() throws Exception {
        // moan 42.37 > 37.42
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGTfloat_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 > FLOAT_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Float > Float")
    void badWeather_float_GT_float() throws Exception {
        // moan 37.42 > 42.37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + GT_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGTfloat_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_2 > FLOAT_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float < Float")
    void float_LT_float() throws Exception {
        // moan 37.42 < 42.37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + LT_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLTfloat_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_2 < FLOAT_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Float < Float")
    void badWeather_float_LT_float() throws Exception {
        // moan 42.37 < 37.42
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LT_SIGN + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLTfloat_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 < FLOAT_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float <= Float")
    void float_LE_float() throws Exception {
        // moan 42.37 <= 42.37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLEfloat_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 <= FLOAT_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Float <= Float")
    void badWeather_float_LE_float() throws Exception {
        // moan 42.37 <= 37.42
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatLEfloat_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 <= FLOAT_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float >= Float")
    void float_GE_float() throws Exception {
        // moan 42.37 >= 42.37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GE_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGEfloat_ture");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 >= FLOAT_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Float >= Float")
    void badWeather_float_GE_float() throws Exception {
        // moan 37.42 >= 42.37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + GE_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatGEfloat_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_2 >= FLOAT_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float == Float")
    void float_EQUALS_float() throws Exception {
        // moan 42.37 == 42.37
        String srcCode = MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatEQUALSfloat_ture");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 == FLOAT_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Float == Float")
    void badWeather_float_EQUALS_float() throws Exception {
        // moan 42.37 == 37.42
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatEQUALSfloat_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 == FLOAT_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: String > Float is not allowed")
    void badWeather_string_GT_float() throws Exception {
        // moan "shrek" > 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGTfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < Float is not allowed")
    void badWeather_string_LT_float() throws Exception {
        // moan "shrek" < 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLTfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= Float is not allowed")
    void badWeather_string_GE_float() throws Exception {
        // moan "shrek" >= 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGEfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= Float is not allowed")
    void badWeather_string_LE_float() throws Exception {
        // moan "shrek" <= 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLEfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String == Float is not allowed")
    void badWeather_string_EQUALS_float() throws Exception {
        // moan "shrek" == 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + FLOAT_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringEQUALSfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String > Int is not allowed")
    void badWeather_string_GT_int() throws Exception {
        // moan "shrek" > 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < Int is not allowed")
    void badWeather_string_LT_int() throws Exception {
        // moan "shrek" < 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= Int is not allowed")
    void badWeather_string_GE_int() throws Exception {
        // moan "shrek" >= 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= Int is not allowed")
    void badWeather_string_LE_int() throws Exception {
        // moan "shrek" <= 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String == Int is not allowed")
    void badWeather_string_EQUALS_int() throws Exception {
        // moan "shrek" == 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringEQUALSInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String > Boolean is not allowed")
    void badWeather_string_GT_boolean() throws Exception {
        // moan "shrek" > hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < Boolean is not allowed")
    void badWeather_string_LT_boolean() throws Exception {
        // moan "shrek" < hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= Boolean is not allowed")
    void badWeather_string_GE_boolean() throws Exception {
        // moan "shrek" >= hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= Boolean is not allowed")
    void badWeather_string_LE_boolean() throws Exception {
        // moan "shrek" <= hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String == Boolean is not allowed")
    void badWeather_string_EQUALS_boolean() throws Exception {
        // moan "shrek" == hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "stringEQUALSBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String > String is not allowed")
    void badWeather_string_GT_string() throws Exception {
        // moan "shrek" > "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGTstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < String is not allowed")
    void badWeather_string_LT_string() throws Exception {
        // moan "shrek" < "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLTstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= String is not allowed")
    void badWeather_string_GE_string() throws Exception {
        // moan "shrek" >= "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "stringGEstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= String is not allowed")
    void badWeather_string_LE_string() throws Exception {
        // moan "shrek" <= "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "stringLEstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: String == String")
    void string_EQUALS_string() throws Exception {
        // moan "shrek" == "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "stringEQUALSString");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(STRING.equals(STRING))
        }, output.toArray());
    }
}
