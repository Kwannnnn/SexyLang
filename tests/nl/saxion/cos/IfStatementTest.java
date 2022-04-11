package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IfStatementTest extends TestBase {
    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @Test
    @DisplayName("Good Weather: if TRUE should execute IF block")
    void simple_if_TRUE() throws Exception {
        String srcCode =
                "if (hard) {" +
                    " moan \"shrek\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "simpleIfTrue");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if TRUE should skip ELSE block")
    void if_TRUE_should_skip_else() throws Exception {
        String srcCode =
                "if (hard) {" +
                    " moan \"shrek\"" +
                " } else {" +
                    " moan \"fiona\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "ifTrueSkipsElse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if TRUE should skip ELSE IF block")
    void if_TRUE_should_skip_else_if() throws Exception {
        String srcCode =
                "if (hard) {" +
                    " moan \"shrek\"" +
                " } else if (hard) {" +
                    " moan \"fiona\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "ifTrueSkipsElseIf");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if FALSE should skip IF block")
    void simple_if_FALSE() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "simpleIfFalse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if FALSE should trigger ELSE block")
    void if_FALSE_should_trigger_else() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else {" +
                    " moan \"fiona\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "ifFalseTriggersElse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "fiona"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: if FALSE should trigger ELSE IF block")
    void if_FALSE_should_trigger_else_if() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else if (hard) {" +
                    " moan \"fiona\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "ifFalseTriggersElseIf");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "fiona"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: IF condition not a boolean")
    void badWeather_if_condition_not_a_boolean() throws Exception {
        String srcCode =
                "if (\"shrek\") {" +
                    " moan \"shrek\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "ifConditionNotABoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: two ELSE statements is not allowed")
    void badWeather_two_else_statements() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else {" +
                    " moan \"fiona\"" +
                " } else {" +
                    " moan \"donkey\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "twoElseStatements");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: ELSE IF after ELSE statement is not allowed")
    void badWeather_else_if_after_else() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else {" +
                    " moan \"fiona\"" +
                " } else if (hard) {" +
                    " moan \"donkey\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "elseIfAfterElseStatement");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: ELSE IF without IF statement is not allowed")
    void badWeather_else_if_without_if_statement() throws Exception {
        String srcCode =
                "else if (hard) {" +
                    " moan \"shrek\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "elseWithoutIfStatements");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: ELSE IF condition not a boolean")
    void badWeather_else_if_condition_not_a_boolean() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else if (42) {" +
                    " moan \"fiona\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "elseIfConditionNotABoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: ELSE without IF statement")
    void badWeather_else_without_if_statement() throws Exception {
        String srcCode =
                "else {" +
                    " moan \"shrek\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "elseWithoutIfStatement");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: EJACULATE in IF statement is not allowed")
    void badWeather_ejaculate_in_if_statement() throws Exception {
        String srcCode =
                "if (hard) {" +
                        " ejaculate \"shrek\"" +
                        " }";
        JasminBytecode code = this.c.compileString(srcCode, "ejaculateInIfStatement");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: EJACULATE in ELSE IF statement is not allowed")
    void badWeather_ejaculate_in_else_if_statement() throws Exception {
        String srcCode =
                "if (soft) {" +
                        " moan \"shrek\"" +
                        " } else if (hard) {" +
                        " ejaculate \"fiona\"" +
                        " }";
        JasminBytecode code = this.c.compileString(srcCode, "ejaculateInElseIfStatement");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: EJACULATE in ELSE statement is not allowed")
    void badWeather_ejaculate_in_else_statement() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else {" +
                    " ejaculate \"fiona\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "ejaculateInElseStatement");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Simple nested IF")
    void simple_nested_if() throws Exception {
        String srcCode =
                "if (hard) {" +
                        " moan \"shrek\"" +
                        " if (hard) {" +
                        "moan \"fiona\"" +
                        " }" +
                        " }";
        JasminBytecode code = this.c.compileString(srcCode, "simpleIfTrue");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrekfiona"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Chained AND IF condition")
    void chained_and_if_condition() throws Exception {
        String srcCode =
                "if (5 > 1 and 1 < 4) {" +
                        " moan \"shrek\"" +
                        " }";
        JasminBytecode code = this.c.compileString(srcCode, "chainedAndIfCondition");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Group IF condition")
    void group_if_condition() throws Exception {
        String srcCode =
                "if ((5 > 1 and 1 < 4) and hard) {" +
                        " moan \"shrek\"" +
                        " }";
        JasminBytecode code = this.c.compileString(srcCode, "groupIfCondition");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Nested IF in an ELSE statement")
    void nested_if_in_else_condition() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else {" +
                    " if (hard) {" +
                        " moan \"fiona\"" +
                    "}" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "nestedIfInElse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "fiona"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Nested IF in an ELSE IF statement")
    void nested_if_in_else_if_condition() throws Exception {
        String srcCode =
                "if (soft) {" +
                    " moan \"shrek\"" +
                " } else if (hard) {" +
                    " if (hard) {" +
                        " moan \"fiona\"" +
                    "}" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "nestedIfInElse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "fiona"
        }, output.toArray());
    }
}
