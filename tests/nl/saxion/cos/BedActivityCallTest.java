package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
                        "moanLoud \"Hello sexy\"" +
                        "ejaculate" +
                        "}" +
                        "intercourse()", "void_no_args");
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
                        "moanLoud safeWord" +
                        "ejaculate" +
                        "}" +
                        "intercourse(\"shrek\")", "void_one_arg");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }
}
