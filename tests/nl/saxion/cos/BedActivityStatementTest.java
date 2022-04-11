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
    @DisplayName("Good Weather: Simple bodyCount Function without args Declaration")
    void bodyCount_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount () {" +
                        "ejaculate 42" +
                        "}", "bodyCount_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCount Function with 1 arg Declaration")
    void bodyCount_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount (bulge isComplete) {" +
                        "ejaculate 42" +
                        "}", "bodyCount_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCount Function with multiple args Declaration")
    void bodyCount_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCount (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate 42" +
                        "}", "bodyCount_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple length Function without args Declaration")
    void length_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse length () {" +
                        "ejaculate 37.42" +
                        "}", "length_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple length Function with 1 arg Declaration")
    void length_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse length (bulge isComplete) {" +
                        "ejaculate 37.42" +
                        "}", "length_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple length Function with multiple args Declaration")
    void length_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse length (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate 37.42" +
                        "}", "length_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulge Function without args Declaration")
    void bulge_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge () {" +
                        "ejaculate hard" +
                        "}", "bulge_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulge Function with 1 arg Declaration")
    void bulge_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge (bulge isComplete) {" +
                        "ejaculate hard" +
                        "}", "bulge_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulge Function with multiple args Declaration")
    void bulge_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate hard" +
                        "}", "bulge_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWord Function without args Declaration")
    void SafeWord_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWord () {" +
                        "ejaculate \"shrek\"" +
                        "}", "SafeWord_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWord Function with 1 arg Declaration")
    void SafeWord_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWord (bulge isComplete) {" +
                        "ejaculate \"shrek\"" +
                        "}", "SafeWord_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWord Function with multiple args Declaration")
    void SafeWord_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWord (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate \"shrek\"" +
                        "}", "SafeWord_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCounts Function without args Declaration")
    void bodyCounts_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCounts () {" +
                        "ejaculate [42, 37]" +
                        "}", "bodyCounts_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCounts Function with 1 arg Declaration")
    void bodyCounts_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCounts (bulge isComplete) {" +
                        "ejaculate [42, 37]" +
                        "}", "bodyCounts_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCounts Function with multiple args Declaration")
    void bodyCounts_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCounts (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate [42, 37]" +
                        "}", "bodyCounts_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple lengths Function without args Declaration")
    void lengths_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse lengths () {" +
                        "ejaculate [42.37, 37.42]" +
                        "}", "lengths_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple lengths Function with 1 arg Declaration")
    void lengths_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse lengths (bulge isComplete) {" +
                        "ejaculate [42.37, 37.42]" +
                        "}", "lengths_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple lengths Function with multiple args Declaration")
    void lengths_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse lengths (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate [42.37, 37.42]" +
                        "}", "lengths_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulges Function without args Declaration")
    void bulges_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulges () {" +
                        "ejaculate [hard, soft]" +
                        "}", "bulges_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulges Function with 1 arg Declaration")
    void bulges_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulges (bulge isComplete) {" +
                        "ejaculate [hard, soft]" +
                        "}", "bulges_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulges Function with multiple args Declaration")
    void bulges_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulges (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate [hard, soft]" +
                        "}", "bulges_multiple_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWords Function without args Declaration")
    void SafeWords_no_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWords () {" +
                        "ejaculate [\"shrek\", \"fiona\"]" +
                        "}", "SafeWords_no_args");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWords Function with 1 arg Declaration")
    void SafeWords_one_arg() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWords (bulge isComplete) {" +
                        "ejaculate [\"shrek\", \"fiona\"]" +
                        "}", "SafeWords_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWords Function with multiple args Declaration")
    void SafeWords_multiple_args() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWords (bulge isComplete, bodyCount rounds) {" +
                        "ejaculate [\"shrek\", \"fiona\"]" +
                        "}", "SafeWords_multiple_args");
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
    @DisplayName("Bad Weather: Simple bodyCount Function Declaration -- Wrong ejaculate type")
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

    @Test
    @DisplayName("Bad Weather: Simple bulge Function Declaration -- Missing ejaculate")
    void badWeather_bulge_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge () {" +
                        "moan 42" +
                        "}", "bulge_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bulge Function Declaration -- Wrong ejaculate type")
    void badWeather_bulge_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulge () {" +
                        "ejaculate 42" +
                        "}", "bulge_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bodyCounts Function Declaration -- Wrong ejaculate type")
    void badWeather_bodyCounts_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCounts () {" +
                        "ejaculate 42" +
                        "}", "bodyCounts_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bodyCounts Function Declaration -- Missing ejaculate")
    void badWeather_bodyCounts_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bodyCounts () {" +
                        "moan 42" +
                        "}", "bodyCounts_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple lengths Function Declaration -- Missing ejaculate")
    void badWeather_lengths_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse lengths () {" +
                        "moan 42" +
                        "}", "lengths_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple lengths Function Declaration -- Wrong ejaculate type")
    void badWeather_lengths_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse lengths () {" +
                        "ejaculate hard" +
                        "}", "lengths_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple SafeWords Function Declaration -- Missing ejaculate")
    void badWeather_SafeWords_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWords () {" +
                        "moan 42" +
                        "}", "SafeWords_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple SafeWords Function Declaration -- Wrong ejaculate type")
    void badWeather_SafeWords_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse SafeWords () {" +
                        "ejaculate hard" +
                        "}", "SafeWords_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bulges Function Declaration -- Missing ejaculate")
    void badWeather_bulges_missing_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulges () {" +
                        "moan 42" +
                        "}", "bulges_missing_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bulges Function Declaration -- Wrong ejaculate type")
    void badWeather_bulges_wrong_ejaculate() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulges () {" +
                        "ejaculate hard" +
                        "}", "bulges_wrong_ejaculate");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Arg already defined in scope (same types)")
    void badWeather_arg_already_in_scope_same_types() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulges (bulge b1, bulge b1) {" +
                        "ejaculate hard" +
                        "}", "badWeather_arg_already_in_scope_same_types");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Arg already defined in scope (different types)")
    void badWeather_arg_already_in_scope_different_types() throws Exception {
        JasminBytecode code = this.c.compileString(
                "bedActivity intercourse bulges (bulge b1, bodyCount b1) {" +
                        "ejaculate hard" +
                        "}", "badWeather_arg_already_in_scope_different_types");
        assertNull(code);
    }
}
