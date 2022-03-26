package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChainedLogicExpressionTest extends TestBase{
    // Language specifics
    public static final String MOAN_KEYWORD = "moan";
    public static final String GT_SIGN = ">";
    public static final String LT_SIGN = "<";
    public static final String LE_SIGN = "<=";
    public static final String EQUALS_SIGN = "==";
    // Test values
    public static final String BOOLEAN = "hard";
    public static final String BOOLEAN_FALSE = "soft";
    public static final String STRING_1 = "shrek";
    public static final String STRING_2 = "fiona";
    public static final int INTEGER_1 = 69;
    public static final int INTEGER_2 = 96;
    public static final float FLOAT_1 = 69.96f;
    public static final float FLOAT_2 = 96.69f;

    private static final Compiler COMPILER = new Compiler();

    @Test
    @DisplayName("Good weather: Boolean AND Boolean")
    void goodWeather_bool_AND_bool() throws Exception {
        // moan soft and hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + " and " + BOOLEAN_FALSE;
        JasminBytecode code = COMPILER.compileString(srcCode, "trueAndFalse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());

        // moan hard and soft
        srcCode =
                MOAN_KEYWORD + " " + BOOLEAN_FALSE + " and " + BOOLEAN;
        code = COMPILER.compileString(srcCode, "falseAndTrue");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: Boolean OR Boolean")
    void goodWeather_bool_OR_bool() throws Exception {
        // moan soft or hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + " or " + BOOLEAN_FALSE;
        JasminBytecode code = COMPILER.compileString(srcCode, "trueOrFalse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());

        // moan hard or soft
        srcCode =
                MOAN_KEYWORD + " " + BOOLEAN_FALSE + " or " + BOOLEAN;
        code = COMPILER.compileString(srcCode, "falseOrTrue");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: Boolean AND Boolean OR Boolean")
    void goodWeather_AND_OR_chained() throws Exception {
        // moan hard and soft or hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + " and " + BOOLEAN_FALSE + " or " + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "trueAndFalseOrTrue");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan hard and soft or soft
        srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + " and " + BOOLEAN_FALSE + " or " + BOOLEAN_FALSE;
        code = COMPILER.compileString(srcCode, "trueAndFalseOrFalse");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: Boolean OR Boolean AND Boolean")
    void goodWeather_OR_AND_chained() throws Exception {
        // moan hard or soft and hard
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + " or " + BOOLEAN_FALSE + " and " + BOOLEAN;
        JasminBytecode code = COMPILER.compileString(srcCode, "trueOrFalseAndTrue");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan hard and soft or soft
        srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + " or " + BOOLEAN_FALSE + " and " + BOOLEAN_FALSE;
        code = COMPILER.compileString(srcCode, "trueOrFalseAndFalse");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: AND with Int comparisons")
    void goodWeather_AND_Int() throws Exception {
        // moan 96 > 69 and 69 < 96
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_2 + GT_SIGN + INTEGER_1 + " and " + INTEGER_1 + LT_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "ANDWithInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan 96 < 69 and 69 < 96
        srcCode =
                MOAN_KEYWORD + " " + INTEGER_2 + LT_SIGN + INTEGER_1 + " and " + INTEGER_1 + LT_SIGN + INTEGER_2;
        code = COMPILER.compileString(srcCode, "ANDWithInt");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: OR with Float comparisons")
    void goodWeather_AND_Float() throws Exception {
        // moan 96.69 > 69.96 and 69.96 < 96.69
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + GT_SIGN + FLOAT_1 + " and " + FLOAT_1 + LT_SIGN + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "ANDWithFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan 96.69 < 69.96 and 69.96 < 96.69
        srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + LT_SIGN + FLOAT_1 + " and " + FLOAT_1 + LT_SIGN + FLOAT_2;
        code = COMPILER.compileString(srcCode, "ANDWithFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: AND with Float and Int comparisons")
    void goodWeather_AND_Float_Int() throws Exception {
        // moan 96.69 > 69.96 and 69 < 96
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + GT_SIGN + FLOAT_1 + " and " + INTEGER_1 + LT_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "ANDWithFloatInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan 96.69 < 69.96 and 69 < 96
        srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + LT_SIGN + FLOAT_1 + " and " + INTEGER_1 + LT_SIGN + INTEGER_2;
        code = COMPILER.compileString(srcCode, "ANDWithFloatInt");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }


    @Test
    @DisplayName("Good weather: OR with Int comparisons")
    void goodWeather_OR_Int() throws Exception {
        // moan 96 > 69 or 69 > 96
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_2 + GT_SIGN + INTEGER_1 + " or " + INTEGER_1 + GT_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "ORWithInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan 96 < 69 or 69 > 96
        srcCode =
                MOAN_KEYWORD + " " + INTEGER_2 + LT_SIGN + INTEGER_1 + " and " + INTEGER_1 + GT_SIGN + INTEGER_2;
        code = COMPILER.compileString(srcCode, "ORWithInt");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: OR with Float comparisons")
    void goodWeather_OR_Float() throws Exception {
        // moan 96.69 > 69.96 or 69.96 < 96.69
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + GT_SIGN + FLOAT_1 + " or " + FLOAT_1 + GT_SIGN + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "ANDWithFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan 96.69 < 69.96 or 69.96 > 96.69
        srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + LT_SIGN + FLOAT_1 + " or " + FLOAT_1 + GT_SIGN + FLOAT_2;
        code = COMPILER.compileString(srcCode, "ANDWithFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: OR with Float and Int comparisons")
    void goodWeather_OR_Float_Int() throws Exception {
        // moan 96.69 > 69.96 or 69 > 96
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + GT_SIGN + FLOAT_1 + " or " + INTEGER_1 + GT_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "ORWithFloatInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan 96.69 < 69.96 or 69 < 96
        srcCode =
                MOAN_KEYWORD + " " + FLOAT_2 + LT_SIGN + FLOAT_1 + " or " + INTEGER_1 + GT_SIGN + INTEGER_2;
        code = COMPILER.compileString(srcCode, "ORWithFloatInt");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good weather: AND OR with Float and Int comparisons")
    void goodWeather_AND_OR_Float_Int() throws Exception {
        // moan 69 == 69 and 96.69 > 69.96 or 69 > 96
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + INTEGER_1 + " " +
                        FLOAT_2 + GT_SIGN + FLOAT_1 + " or " +
                        INTEGER_1 + GT_SIGN + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "ANDORWithFloatInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "true"
        }, output.toArray());

        // moan 69 == 69 and 96.69 <= 69.96 or 69 > 96
        srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + EQUALS_SIGN + INTEGER_1 + " and " +
                        FLOAT_2 + LE_SIGN + FLOAT_1 + " or " +
                        INTEGER_1 + GT_SIGN + INTEGER_2;
        code = COMPILER.compileString(srcCode, "ANDORWithFloatInt");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[]{
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad weather: String and String")
    void badWeather_String_AND_String() throws Exception {
        // moan "shrek" and "fiona"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING_1 + "\" and \"" + STRING_2 + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "stringANDString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: String or String")
    void badWeather_String_OR_String() throws Exception {
        // moan "shrek" or "fiona"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING_1 + "\" or \"" + STRING_2 + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "stringORString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Float and Float")
    void badWeather_Float_AND_Float() throws Exception {
        // moan 69.96 and 96.69
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + " and " + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatANDFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Float or Float")
    void badWeather_Float_OR_Float() throws Exception {
        // moan 69.96 or 96.69
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT_1 + " or " + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "floatORFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Int or Int")
    void badWeather_Int_OR_Int() throws Exception {
        // moan 69 or 96
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + " or " + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intORInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Int and Int")
    void badWeather_Int_AND_Int() throws Exception {
        // moan 69 and 96
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + " and " + INTEGER_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intAndInt");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Int and Float")
    void badWeather_Int_AND_Float() throws Exception {
        // moan 69 and 96.69
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + " and " + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intAndFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Int and String")
    void badWeather_Int_AND_String() throws Exception {
        // moan 69 and "fiona"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + " and \"" + STRING_2 + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "intAndString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: String and Float")
    void badWeather_String_AND_Float() throws Exception {
        // moan "fiona" and 96.69
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING_2 + "\" and " + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intAndFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Int or Float")
    void badWeather_Int_OR_Float() throws Exception {
        // moan 69 or 96.69
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + " or " + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intOrFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: Int or String")
    void badWeather_Int_OR_String() throws Exception {
        // moan 69 or "fiona"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER_1 + " or \"" + STRING_2 + "\"";
        JasminBytecode code = COMPILER.compileString(srcCode, "intOrString");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: String or Float")
    void badWeather_String_OR_Float() throws Exception {
        // moan "fiona" or 96.69
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING_2 + "\" or " + FLOAT_2;
        JasminBytecode code = COMPILER.compileString(srcCode, "intOrFloat");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad weather: AND OR with String Float Int")
    void badWeather_AND_OR_String_Float_Int() throws Exception {
        // moan "fiona" or 96.69 and 69
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING_2 + "\" or " + FLOAT_2 + " and " + INTEGER_1;
        JasminBytecode code = COMPILER.compileString(srcCode, "ANDORStringFloatInt");
        assertNull(code);
    }
}
