package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LubeStatementTest extends TestBase {
    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @Test
    @DisplayName("Good Weather: Simple Loop Statement")
    void simple_loop_statement() throws Exception {
        String srcCode =
                "insert bodyCount 3 in rounds" +
                " lube (rounds > 0) {" +
                    " moanLoud \"Another round baby!\"" +
                    " insert rounds - 1 in rounds" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "simpleLoopStatement");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "Another round baby!",
                "Another round baby!",
                "Another round baby!"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple Loop FALSE should skip block")
    void simple_loop_false_condition_statement() throws Exception {
        String srcCode =
                " lube (soft) {" +
                    " moanLoud \"Another round baby!\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "falseConditionLoop");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Nested Loop Statement")
    void nested_loop_statement() throws Exception {
        String srcCode =
                " insert bodyCount 3 in rounds1" +
                " lube (rounds1 > 0) {" +
                    " moanLoud \"1: Another round baby!\"" +
                    " lube (rounds1 > 0) {" +
                        " moanLoud \"2: Another round baby!\"" +
                        " insert rounds1 - 1 in rounds1" +
                    " }" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "simpleLoopStatement");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "1: Another round baby!",
                "2: Another round baby!",
                "2: Another round baby!",
                "2: Another round baby!"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Missing loop condition is not allowed")
    void badWeather_missing_condition_statement() throws Exception {
        String srcCode =
                " lube () {" +
                        " moanLoud \"Another round baby!\"" +
                        " }";
        JasminBytecode code = this.c.compileString(srcCode, "missingLoopCondition");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Loop condition not a boolean is not allowed")
    void badWeather_condition_not_a_boolean_statement() throws Exception {
        String srcCode =
                " lube (42) {" +
                    " moanLoud \"Another round baby!\"" +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "conditionNotABoolean");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Ejaculate in loop is not allowed")
    void badWeather_ejaculate_in_loop_statement() throws Exception {
        String srcCode =
                "insert bodyCount 3 in rounds" +
                " lube (rounds > 0) {" +
                    " ejaculate " +
                " }";
        JasminBytecode code = this.c.compileString(srcCode, "ejaculateInLoop");
        assertNull(code);
    }
}
