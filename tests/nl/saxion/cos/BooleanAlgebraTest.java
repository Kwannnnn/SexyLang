package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static nl.saxion.cos.SexyLangUtils.*;

public class BooleanAlgebraTest extends TestBase {
    private static final int INTEGER = 4;
    private static final float FLOAT = 2.0F;

    @Test
    @DisplayName("Good Weather: Int > Int is valid")
    void int_GT_int() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString(
                MOAN_KEYWORD + " " + INTEGER + ">" + INTEGER,
                ""
        );
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER > INTEGER)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Int > Float is valid")
    void int_GT_Float() throws Exception {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("moan " + INTEGER + ">" + INTEGER, "");
        assertNotNull(code);

        System.out.println(FLOAT);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(true)
        }, output.toArray());
    }
}
