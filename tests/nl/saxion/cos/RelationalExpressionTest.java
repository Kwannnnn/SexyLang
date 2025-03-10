package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RelationalExpressionTest extends TestBase {
    // Language specifics
    public static final String MOAN_KEYWORD = "moan";
    public static final String GT_SIGN = ">";
    public static final String NEG_SIGN = "!";
    public static final String LT_SIGN = "<";
    public static final String LE_SIGN = "<=";
    public static final String GE_SIGN = ">=";
    public static final String EQUALS_SIGN = "==";
    public static final String NOT_EQUALS_SIGN = "!=";
    // Test values
    public static final String BOOLEAN = "hard";
    public static final String BOOLEAN_FALSE = "soft";
    public static final String STRING = "shrek";
    public static final int INTEGER_1 = 37;
    public static final int INTEGER_2 = 42;
    public static final float FLOAT_1 = 42.37F;
    public static final float FLOAT_2 = 37.42F;

    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @Test
    @DisplayName("Bad Weather: !Int is not allowed")
    void badWeather_int_NEG() throws Exception {
        // moan !37
        String srcCode =
                MOAN_KEYWORD + " " + NEG_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "intNEG");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int > Boolean is not allowed")
    void badWeather_int_GT_boolean() throws Exception {
        // moan 37 > hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "intGTBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int < Boolean is not allowed")
    void badWeather_int_LT_boolean() throws Exception {
        // moan 37 < hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "intLTBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int >= Boolean is not allowed")
    void badWeather_int_GE_boolean() throws Exception {
        // moan 37 >= hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "intGEBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int <= Boolean is not allowed")
    void badWeather_int_LE_boolean() throws Exception {
        // moan 37 <= hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "intLEBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int == Boolean is not allowed")
    void badWeather_int_EQUALS_boolean() throws Exception {
        // moan 37 == hard
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "intEQUALSBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int > Float is not allowed")
    void badWeather_int_GT_float() throws Exception {
        // moan 37 > 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GT_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "intGTFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int < Float is not allowed")
    void badWeather_int_LT_float() throws Exception {
        // moan 37 < 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "intLTFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int >= Float is not allowed")
    void badWeather_int_GE_float() throws Exception {
        // moan 37 >= 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "intGEFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int == Float is not allowed")
    void badWeather_int_EQUALS_float() throws Exception {
        // moan 37 == 42.37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "intEQUALSFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int > String is not allowed")
    void badWeather_int_GT_string() throws Exception {
        // moan 37 > "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "intGTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int < String is not allowed")
    void badWeather_int_LT_string() throws Exception {
        // moan 37 < "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "intLTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int >= String is not allowed")
    void badWeather_int_GE_string() throws Exception {
        // moan 37 >= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + GE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "intGEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int <= String is not allowed")
    void badWeather_int_LE_string() throws Exception {
        // moan 37 <= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + LE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "intLEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Int == String is not allowed")
    void badWeather_int_EQUALS_String() throws Exception {
        // moan 37 == "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "intEQUALSString");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Int > Int")
    void int_GT_int() throws Exception {
        // moan 42 > 37
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_2 + GT_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "intGTint_true");
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
        JasminBytecode code = this.c.compileString(srcCode, "intGTint_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "intLTint_true");
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
        JasminBytecode code = this.c.compileString(srcCode, "intLTint_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "intLEint_true");
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
        JasminBytecode code = this.c.compileString(srcCode, "intLEint_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "intGEint_true");
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
        JasminBytecode code = this.c.compileString(srcCode, "intGEint_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "intEQUALSint_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 == INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int != Int is valid")
    void int_NOT_EQUALS_int() throws Exception {
        // moan 37 != 42
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + NOT_EQUALS_SIGN + INTEGER_2;
        JasminBytecode code = this.c.compileString(srcCode, "intNOT_EQUALSint_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 != INTEGER_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Int == Int")
    void badWeather_int_EQUALS_int() throws Exception {
        // moan 37 == 42
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + INTEGER_2;
        JasminBytecode code = this.c.compileString(srcCode, "intEQUALSint_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 == INTEGER_2)
        }, output.toArray());
    }

    // FLOATS
    @Test
    @DisplayName("Bad Weather: !Float is not allowed")
    void badWeather_float_NEG() throws Exception {
        // moan !42.37
        String srcCode =
                MOAN_KEYWORD + " " + NEG_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "floatNEG");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float > Int is not allowed")
    void badWeather_float_GT_int() throws Exception {
        // moan 42.37 > 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "floatGTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float < Int is not allowed")
    void badWeather_float_LT_int() throws Exception {
        // moan 42.37 < 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LT_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "floatLTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float >= Int is not allowed")
    void badWeather_float_GE_int() throws Exception {
        // moan 42.37 >= 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GE_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "floatGEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float <= Int is not allowed")
    void badWeather_float_LE_int() throws Exception {
        // moan 42.37 <= 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "floatLEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float == Int")
    void badWeather_float_EQUAL_int() throws Exception {
        // moan 42.37 == 37
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "floatEQUALint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float > Boolean is not allowed")
    void badWeather_float_GT_boolean() throws Exception {
        // moan 42.37 > hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "floatGTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float < Boolean is not allowed")
    void badWeather_float_LT_boolean() throws Exception {
        // moan 42.37 < hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "floatLTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float >= Boolean is not allowed")
    void badWeather_float_GE_boolean() throws Exception {
        // moan 42.37 >= hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "floatGEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float <= Boolean is not allowed")
    void badWeather_float_LE_boolean() throws Exception {
        // moan 42.37 <= hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "floatLEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float == Boolean")
    void badWeather_float_EQUAL_boolean() throws Exception {
        // moan 42.37 == hard
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "floatEQUALBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float > String is not allowed")
    void badWeather_float_GT_string() throws Exception {
        // moan 42.37 > "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "floatGTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float < String is not allowed")
    void badWeather_float_LT_string() throws Exception {
        // moan 42.37 < "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "floatLTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float >= String is not allowed")
    void badWeather_float_GE_string() throws Exception {
        // moan 42.37 >= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "floatGEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float <= String is not allowed")
    void badWeather_float_LE_string() throws Exception {
        // moan 42.37 <= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + LE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "floatLEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Float == String")
    void badWeather_float_EQUAL_string() throws Exception {
        // moan 42.37 == "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + EQUALS_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "floatEQUALstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Float > Float")
    void float_GT_float() throws Exception {
        // moan 42.37 > 37.42
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + GT_SIGN + FLOAT_2;
        JasminBytecode code = this.c.compileString(srcCode, "floatGTfloat_true");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatGTfloat_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatLTfloat_true");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatLTfloat_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatLEfloat_true");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatLEfloat_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatGEfloat_ture");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatGEfloat_false");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatEQUALSfloat_ture");
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
        JasminBytecode code = this.c.compileString(srcCode, "floatEQUALSfloat_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT_1 == FLOAT_2)
        }, output.toArray());
    }

    // STRINGS
    @Test
    @DisplayName("Bad Weather: !String is not allowed")
    void badWeather_string_NEG() throws Exception {
        // moan !"shrek"
        String srcCode =
                MOAN_KEYWORD + " " + NEG_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "stringNEG");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String > Float is not allowed")
    void badWeather_string_GT_float() throws Exception {
        // moan "shrek" > 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringGTfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < Float is not allowed")
    void badWeather_string_LT_float() throws Exception {
        // moan "shrek" < 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringLTfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= Float is not allowed")
    void badWeather_string_GE_float() throws Exception {
        // moan "shrek" >= 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringGEfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= Float is not allowed")
    void badWeather_string_LE_float() throws Exception {
        // moan "shrek" <= 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringLEfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String == Float is not allowed")
    void badWeather_string_EQUALS_float() throws Exception {
        // moan "shrek" == 42.37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringEQUALSfloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String > Int is not allowed")
    void badWeather_string_GT_int() throws Exception {
        // moan "shrek" > 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringGTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < Int is not allowed")
    void badWeather_string_LT_int() throws Exception {
        // moan "shrek" < 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringLTint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= Int is not allowed")
    void badWeather_string_GE_int() throws Exception {
        // moan "shrek" >= 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringGEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= Int is not allowed")
    void badWeather_string_LE_int() throws Exception {
        // moan "shrek" <= 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringLEint");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String == Int is not allowed")
    void badWeather_string_EQUALS_int() throws Exception {
        // moan "shrek" == 37
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "stringEQUALSInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String > Boolean is not allowed")
    void badWeather_string_GT_boolean() throws Exception {
        // moan "shrek" > hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "stringGTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < Boolean is not allowed")
    void badWeather_string_LT_boolean() throws Exception {
        // moan "shrek" < hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "stringLTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= Boolean is not allowed")
    void badWeather_string_GE_boolean() throws Exception {
        // moan "shrek" >= hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "stringGEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= Boolean is not allowed")
    void badWeather_string_LE_boolean() throws Exception {
        // moan "shrek" <= hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "stringLEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String == Boolean is not allowed")
    void badWeather_string_EQUALS_boolean() throws Exception {
        // moan "shrek" == hard
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "stringEQUALSBoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String > String is not allowed")
    void badWeather_string_GT_string() throws Exception {
        // moan "shrek" > "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GT_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "stringGTstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String < String is not allowed")
    void badWeather_string_LT_string() throws Exception {
        // moan "shrek" < "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LT_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "stringLTstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String >= String is not allowed")
    void badWeather_string_GE_string() throws Exception {
        // moan "shrek" >= "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + GE_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "stringGEstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String <= String is not allowed")
    void badWeather_string_LE_string() throws Exception {
        // moan "shrek" <= "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + LE_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "stringLEstring");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: String == String is not allowed")
    void string_EQUALS_string() throws Exception {
        // moan "shrek" == "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + EQUALS_SIGN + " \"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "stringEQUALSString");
        assertNull(code);

//        // Check that output matches what we expect
//        List<String> output = runCode(code);
//        assertArrayEquals(new String[] {
//                String.valueOf(STRING.equals(STRING))
//        }, output.toArray());
    }

    // BOOLEANS
    @Test
    @DisplayName("Good Weather: !Boolean")
    void boolean_NEG() throws Exception {
        // moan !hard
        String srcCode =
                MOAN_KEYWORD + " " + NEG_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanNEG");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(false)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Boolean > Boolean is not allowed")
    void badWeather_boolean_GT_Boolean() throws Exception {
        // moan hard > hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanGTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean < Boolean is not allowed")
    void badWeather_boolean_LT_Boolean() throws Exception {
        // moan hard < hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LT_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanLTboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean >= Boolean is not allowed")
    void badWeather_boolean_GE_Boolean() throws Exception {
        // moan hard >= hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanGEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean <= Boolean is not allowed")
    void badWeather_boolean_LE_Boolean() throws Exception {
        // moan hard <= hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LE_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanLEboolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Boolean == Boolean (true == true)")
    void boolean_EQUALS_boolean_true() throws Exception {
        // moan hard == hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + EQUALS_SIGN + BOOLEAN;
        JasminBytecode code = this.c.compileString(srcCode, "booleanEQUALSboolean_true");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(true)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Boolean == Boolean (true == false)")
    void boolean_EQUALS_boolean_false() throws Exception {
        // moan hard == soft
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + EQUALS_SIGN + BOOLEAN_FALSE;
        JasminBytecode code = this.c.compileString(srcCode, "booleanEQUALSboolean_false");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(false)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Boolean > Int is not allowed")
    void badWeather_boolean_GT_Int() throws Exception {
        // moan hard > 37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GT_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanGTInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean < Int is not allowed")
    void badWeather_boolean_LT_Int() throws Exception {
        // moan hard < 37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LT_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanLTInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean >= Int is not allowed")
    void badWeather_boolean_GE_Int() throws Exception {
        // moan hard >= 37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GE_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanGEInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean <= Int is not allowed")
    void badWeather_boolean_LE_Int() throws Exception {
        // moan hard <= 37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LE_SIGN + INTEGER_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanLEInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean > Float is not allowed")
    void badWeather_boolean_GT_Float() throws Exception {
        // moan hard > 42.37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GT_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanGTFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean < Float is not allowed")
    void badWeather_boolean_LT_Float() throws Exception {
        // moan hard < 42.37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LT_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanLTFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean >= Float is not allowed")
    void badWeather_boolean_GE_Float() throws Exception {
        // moan hard >= 42.37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GE_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanGEFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean <= Float is not allowed")
    void badWeather_boolean_LE_Float() throws Exception {
        // moan hard <= 42.37
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LE_SIGN + FLOAT_1;
        JasminBytecode code = this.c.compileString(srcCode, "booleanLEFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean > String is not allowed")
    void badWeather_boolean_GT_String() throws Exception {
        // moan hard > "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "booleanGTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean < String is not allowed")
    void badWeather_boolean_LT_String() throws Exception {
        // moan hard < "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LT_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "booleanLTString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean >= String is not allowed")
    void badWeather_boolean_GE_String() throws Exception {
        // moan hard >= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + GE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "booleanGEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean <= String is not allowed")
    void badWeather_boolean_LE_String() throws Exception {
        // moan hard <= "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + LE_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "booleanLEString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Boolean == String is not allowed")
    void badWeather_boolean_EQUALS_string() throws Exception {
        // moan hard == "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + EQUALS_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "booleanEQUALSString");
        assertNull(code);
    }
}
