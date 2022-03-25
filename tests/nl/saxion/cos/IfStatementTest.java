package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IfStatementTest extends TestBase {
    // Language specifics
    public static final String IF_KEYWORD = "if";
    public static final String ELSE_KEYWORD = "else";
    public static final String MOAN_KEYWORD = "moan";
    // Test values
    public static final String BOOLEAN_TRUE = "hard";
    public static final String BOOLEAN_FALSE = "soft";
    public static final String STRING_1 = "shrek";
    public static final String STRING_2 = "fiona";

    private static final Compiler COMPILER = new Compiler();

    @Test
    @DisplayName("Good Weather: if TRUE should execute block")
    void badWeather_if_TRUE() throws Exception {
        // if (true) {
        //    moan "shrek"
        // }
        String srcCode =
                IF_KEYWORD + "(" + BOOLEAN_TRUE + ")" + "{" +
                MOAN_KEYWORD + " \"" + STRING_1 + "\"" +
                "}";
        JasminBytecode code = COMPILER.compileString(srcCode, "ifTrue");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                STRING_1
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if FALSE should skip block")
    void badWeather_if_FALSE() throws Exception {
        // if (true) {
        //    moan "shrek"
        // }
        String srcCode =
                IF_KEYWORD + "(" + BOOLEAN_FALSE + ")" + "{" +
                        MOAN_KEYWORD + " \"" + STRING_1 + "\"" +
                        "}";
        JasminBytecode code = COMPILER.compileString(srcCode, "ifFalse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if FALSE should trigger ELSE block")
    void badWeather_if_FALSE_should_trigger_else() throws Exception {
        // if (false) {
        //    moan "shrek"
        // } else {
        //    moan "fiona"
        // }
        String srcCode =
                IF_KEYWORD + "(" + BOOLEAN_FALSE + ")" + "{" +
                        MOAN_KEYWORD + " \"" + STRING_1 + "\"" +
                        "}" + ELSE_KEYWORD + "{" +
                        MOAN_KEYWORD + " \"" + STRING_2 + "\"" +
                        "}";
        JasminBytecode code = COMPILER.compileString(srcCode, "ifFalseTriggersElse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                STRING_2
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if TRUE should skip ELSE block")
    void badWeather_if_TRUE_should_skip_else() throws Exception {
        // if (true) {
        //    moan "shrek"
        // } else {
        //    moan "fiona"
        // }
        String srcCode =
                IF_KEYWORD + "(" + BOOLEAN_TRUE + ")" + "{" +
                        MOAN_KEYWORD + " \"" + STRING_1 + "\"" +
                        "}" + ELSE_KEYWORD + "{" +
                        MOAN_KEYWORD + " \"" + STRING_2 + "\"" +
                        "}";
        JasminBytecode code = COMPILER.compileString(srcCode, "ifTrueSkipsElse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                STRING_1
        }, output.toArray());
    }
}
