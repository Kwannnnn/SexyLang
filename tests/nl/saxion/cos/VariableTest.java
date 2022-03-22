package nl.saxion.cos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static nl.saxion.cos.SexyLangUtils.*;
import static org.junit.jupiter.api.Assertions.*;

public class VariableTest extends TestBase {

    private static final String VAR_IDENT1 = "var1";
    private static final String VAR_IDENT2 = "var2";
    private static final String STRING = "shrek";
    private static final int INTEGER_1 = 37;
    private static final int INTEGER_2 = 42;
    private static final float FLOAT = 37.42F;
    private final Compiler c = new Compiler();

    @Test
    @DisplayName("Good Weather: Boolean Variable Declaration")
    void boolean_variable_declaration() throws Exception {
        JasminBytecode code = this.c.compileString(
                INSERT_KEYWORD + " " + BULGE_KEYWORD + " " + HARD_KEYWORD + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1,
                "bulgeVarDeclaration");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(true)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Integer Variable Declaration")
    void int_variable_declaration() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "integerVarDeclaration");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float Variable Declaration")
    void float_variable_declaration() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + LENGTH_KEYWORD + " " + FLOAT + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "floatVarDeclaration");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(FLOAT)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: String Variable Declaration")
    void string_variable_declaration() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + SAFEWORD_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "stringVarDeclaration");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                STRING
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Variable Arithmetics")
    void variable_arithmetics() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT2 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1 + " + " + VAR_IDENT2,
                "varArithmetics");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_1 + INTEGER_1)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Variable Declaration Type Mismatch")
    void badWeather_variable_declaration_type_mismatch() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + BULGE_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "bulgeVarMismatch");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Variable with same name declaration in ame scope")
    void badWeather_variable_declaration_same_scope() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + SAFEWORD_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        INSERT_KEYWORD + " " + SAFEWORD_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "bulgeVarMismatch");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Variable Assignment")
    void simple_variable_assignment() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        INSERT_KEYWORD + " " + " " + INTEGER_2 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "varArithmetics");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_2)
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: Variable Assignment Type Mismatch")
    void badWeather_variable_assignment_type_mismatch() throws Exception {
        JasminBytecode code = c.compileString(
                INSERT_KEYWORD + " " + SAFEWORD_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        INSERT_KEYWORD + " " + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "varAssignmentMismatch");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Variable Assignment ID not found")
    void badWeather_variable_assignment_not_found() throws Exception {
        JasminBytecode code = c.compileString(
                        INSERT_KEYWORD + " " + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "varIdNotFound");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Token not found")
    void badWeather_token_not_found() throws Exception {
        JasminBytecode code = c.compileString(
                        MOAN_KEYWORD + " " + VAR_IDENT1,
                "varIdNotFound");
        assertNull(code);
    }
}
