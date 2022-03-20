package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MoanStatementTest extends TestBase {
    @Test
    @DisplayName("moan String")
    void moan_string() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("moan \"shrek\"", "moanString");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("moan Int")
    void moan_int() throws Exception {
        Compiler c = new Compiler();
        // Int + Float should not be allowed
        JasminBytecode code = c.compileString("moan 1", "moanInt");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(1)
        }, output.toArray());
    }

    @Test
    @DisplayName("moan Boolean")
    void moan_boolean() throws Exception {
        Compiler c = new Compiler();
        // Int + Float should not be allowed
        JasminBytecode code = c.compileString("moan hard", "moanBoolean");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(true)
        }, output.toArray());
    }

    @Test
    @DisplayName("moan Float")
    void moan_float() throws Exception {
        Compiler c = new Compiler();
        // Int + Float should not be allowed
        JasminBytecode code = c.compileString("moan 37.42", "moanFloat");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(37.42F)
        }, output.toArray());
    }
}
