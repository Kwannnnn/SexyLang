package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BedActivityStatementTest extends TestBase {
    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @Test
    @DisplayName("Good Weather: Simple Void Function without args Declaration")
    void void_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty () {" +
                        "ejaculate" +
                        "}", "void_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple Void Function with 1 arg Declaration")
    void void_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty (bulge isComplete) {" +
                        "ejaculate" +
                        "}", "void_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple Void Function with multiple args Declaration")
    void void_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate" +
                        "}", "void_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Simple Void Function Declaration -- Missing ejaculate")
    void badWeather_void_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty () {" +
                        "moan 42" +
                        "}", "void_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple Void Function Declaration -- Wrong ejaculate type")
    void badWeather_void_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse empty () {" +
                        "ejaculate 42" +
                        "}", "void_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bodyCount Function Declaration -- Missing ejaculate")
    void badWeather_bodyCount_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount () {" +
                        "moan 42" +
                        "}", "bodyCount_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple BodyCount Function Declaration -- Wrong ejaculate type")
    void badWeather_bodyCount_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount () {" +
                        "ejaculate hard" +
                        "}", "bodyCount_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple length Function Declaration -- Missing ejaculate")
    void badWeather_length_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse length () {" +
                        "moan 42" +
                        "}", "length_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple length Function Declaration -- Wrong ejaculate type")
    void badWeather_length_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse length () {" +
                        "ejaculate hard" +
                        "}", "length_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple SafeWord Function Declaration -- Missing ejaculate")
    void badWeather_SafeWord_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWord () {" +
                        "moan 42" +
                        "}", "SafeWord_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple SafeWord Function Declaration -- Wrong ejaculate type")
    void badWeather_SafeWord_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWord () {" +
                        "ejaculate 42" +
                        "}", "SafeWord_wrong_ejaculate");
        assertNull(code);
    }

}
