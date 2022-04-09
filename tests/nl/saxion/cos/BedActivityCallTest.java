package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BedActivityCallTest extends TestBase {
    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @Test
    @DisplayName("Good Weather: Simple Void Function without args Call")
    void void_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty () {" +
                        " moanLoud \"Hello sexy\"" +
                        " ejaculate" +
                        " }" +
                        " intercourse()", "void_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "Hello sexy"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple Void Function with one arg Call")
    void void_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty (SafeWord safeWord) {" +
                        " moanLoud safeWord" +
                        " ejaculate" +
                        " }" +
                        " intercourse(\"shrek\")", "void_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple Void Function with multiple arg Call")
    void void_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty (SafeWord safeWord, bodyCount number) {" +
                        " moanLoud safeWord" +
                        " moanLoud number" +
                        " ejaculate" +
                        " }" +
                        " intercourse(\"shrek\", 37)", "void_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek", "37"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCount Function without args Call")
    void bodyCount_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount () {" +
                        " ejaculate 42" +
                        " }" +
                        " moanLoud intercourse()", "bodyCount_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "42"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCount Function with one arg Call")
    void bodyCount_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount (bodyCount number) {" +
                        " ejaculate number" +
                        " }" +
                        " moanLoud intercourse(42)", "bodyCount_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "42"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCount Function with multiple arg Call")
    void bodyCount_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount (bodyCount number1, bodyCount number2) {" +
                        " moanLoud number1" +
                        " ejaculate number2" +
                        " }" +
                        " moanLoud intercourse(37, 42)", "bodyCount_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "37", "42"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Ejaculate Sum expression")
    void ejaculate_sum_expression() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity sum bodyCount (bodyCount number1, bodyCount number2) {" +
                        " ejaculate number1 + number2" +
                        " }" +
                        " moanLoud sum(37, 42)", "ejaculate_sum_expression");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(37 + 42)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Ejaculate Mul expression")
    void ejaculate_mul_expression() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity mul bodyCount (bodyCount number1, bodyCount number2) {" +
                        " ejaculate number1 * number2" +
                        " }" +
                        " moanLoud mul(37, 42)", "ejaculate_mul_expression");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(37 * 42)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Ejaculate simple boolean expression")
    void ejaculate_simple_boolean_expression() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge (bodyCount number1, bodyCount number2) {" +
                        " ejaculate number1 == number2" +
                        " }" +
                        " moanLoud intercourse(37, 42)", "ejaculate_simple_boolean_expression");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(false)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Ejaculate chained boolean expression")
    void ejaculate_chained_boolean_expression() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge (bodyCount number1, bodyCount number2) {" +
                        " ejaculate number1 > 0 and number2 < 0" +
                        " }" +
                        " moanLoud intercourse(37, 42)", "ejaculate_chained_boolean_expression");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(false)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: bedActivityCall with wrong arg types")
    void badWeather_wrong_arg_types_expression() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge (bodyCount number1, bodyCount number2) {" +
                        " ejaculate number1 > 0 and number2 < 0" +
                        " }" +
                        " moanLoud intercourse(37.42, 42.37)", "badWeather_wrong_arg_types_expression");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: bedActivityCall with wrong arg count")
    void badWeather_wrong_arg_count_expression() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge (bodyCount number1, bodyCount number2) {" +
                        " ejaculate number1 > 0 and number2 < 0" +
                        " }" +
                        " moanLoud intercourse(37)", "badWeather_wrong_arg_count_expression");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: bedActivityCall with wrong arg count")
    void badWeather_unknown_method() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty () {" +
                        " moanLoud \"Hello sexy\"" +
                        " ejaculate" +
                        " }" +
                        " moanLoud unknown(37)", "badWeather_unknown_method");
        assertNull(code);
    }
}
