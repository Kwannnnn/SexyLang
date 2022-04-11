package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringConcatenationTest extends TestBase {
    // Language specifics
    public static final String MOAN_KEYWORD = "moan";
    public static final String ADD_SIGN = "+";
    // Test values
    private static final String BOOLEAN = "hard";
    private static final String STRING = "shrek";
    private static final String SPECIAL_CHARS = "!@#$%^&*():;<>?/{}[]|`~±§";
    private static final int INTEGER = 37;
    private static final float FLOAT = 42.37F;

    private Compiler c = new Compiler();

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @Test
    @DisplayName("String + String concatenation")
    void stringConcatenation() throws Exception {
        // moan "shrek" + "shrek"
        String srcCode =
                MOAN_KEYWORD + " \"" + STRING + "\"" + ADD_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "stringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                STRING + STRING
        }, output.toArray());
    }

    @Test
    @DisplayName("Float + String concatenation")
    void float_stringConcatenation() throws Exception {
        // moan 42.37 + "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + FLOAT + ADD_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "floatStringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                FLOAT + STRING
        }, output.toArray());

        // moan "shrek" + 42.37
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + ADD_SIGN + FLOAT;
        code = this.c.compileString(srcCode, "stringFloatConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                STRING + FLOAT
        }, output.toArray());
    }

    @Test
    @DisplayName("Boolean + String concatenation")
    void boolean_stringConcatenation() throws Exception {
        // moan hard + "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + BOOLEAN + ADD_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "booleanStringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                true + STRING
        }, output.toArray());

        // moan "shrek" + hard
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + ADD_SIGN + BOOLEAN;
        code = this.c.compileString(srcCode, "stringBooleanConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                STRING + true
        }, output.toArray());
    }

    @Test
    @DisplayName("Int + String concatenation")
    void integer_stringConcatenation() throws Exception {
        // moan 37 + "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + INTEGER + ADD_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "intStringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                INTEGER + STRING
        }, output.toArray());

        // moan "shrek" + 37
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + ADD_SIGN + INTEGER;
        code = this.c.compileString(srcCode, "stringIntConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                STRING + INTEGER
        }, output.toArray());
    }

    @Test
    @DisplayName("specialChars + String concatenation")
    void specialChars_stringConcatenation() throws Exception {
        // moan 37 + "shrek"
        String srcCode =
                MOAN_KEYWORD + " " + "\"" + SPECIAL_CHARS + "\"" + ADD_SIGN + "\"" + STRING + "\"";
        JasminBytecode code = this.c.compileString(srcCode, "specialCharsStringConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                SPECIAL_CHARS + STRING
        }, output.toArray());

        // moan "shrek" + 37
        srcCode = MOAN_KEYWORD + " \"" + STRING + "\"" + ADD_SIGN + "\"" + SPECIAL_CHARS + "\"";
        code = this.c.compileString(srcCode, "specialCharsIntConcat");
        assertNotNull(code);

        // Check that output matches what we expect
        output = runCode(code);
        assertArrayEquals(new String[] {
                STRING + SPECIAL_CHARS
        }, output.toArray());
    }
}
