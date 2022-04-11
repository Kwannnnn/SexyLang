package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VariableTest extends TestBase {
    // Language specifics
    public static final String MOAN_KEYWORD = "moan";
    public static final String INSERT_KEYWORD = "insert";
    public static final String IN_KEYWORD = "in";
    public static final String BULGE_KEYWORD = "bulge";
    public static final String BODYCOUNT_KEYWORD = "bodyCount";
    public static final String LENGTH_KEYWORD = "length";
    public static final String SAFEWORD_KEYWORD = "SafeWord";
    public static final String HARD_KEYWORD = "hard";
    public static final String ADD_SIGN = "+";
    // Test values
    private static final String VAR_IDENT1 = "var1";
    private static final String VAR_IDENT2 = "var2";
    private static final String STRING = "shrek";
    private static final int INTEGER_1 = 37;
    private static final int INTEGER_2 = 42;
    private static final int INTEGER_3 = 256;
    private static final float FLOAT = 37.42F;

    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @Test
    @DisplayName("Good Weather: Boolean Variable Declaration")
    void boolean_variable_declaration() throws Exception {
        // insert bulge hard in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + BULGE_KEYWORD + " " + HARD_KEYWORD + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "bulgeVarDeclaration");
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
        // insert bodyCount 37 in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_3 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "integerVarDeclaration");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                String.valueOf(INTEGER_3)
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Float Variable Declaration")
    void float_variable_declaration() throws Exception {
        // insert length 42.37 in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + LENGTH_KEYWORD + " " + FLOAT + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode,"floatVarDeclaration");
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
        // insert SafeWord "shrek" in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + SAFEWORD_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode,"stringVarDeclaration");
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
        // insert bodyCount 37 in var1
        // insert bodyCount 37 in var2
        // moan var1 + var2
        String srcCode =
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT2 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1 + ADD_SIGN + VAR_IDENT2;
        JasminBytecode code = this.c.compileString(srcCode, "varArithmetics");
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
        // Assigning a String in a Boolean variable is not allowed
        // insert bulge "shrek" in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + BULGE_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "bulgeVarMismatch");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Variable with same name declaration in ame scope")
    void badWeather_variable_declaration_same_scope() throws Exception {
        // insert bodyCount 37 in var1
        // insert bodyCount 37 in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "tokenExistsInScope");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: Variable Assignment")
    void simple_variable_assignment() throws Exception {
        // insert bodyCount 37 in var1
        // insert 42 in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + BODYCOUNT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                INSERT_KEYWORD + " " + INTEGER_2 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "varArithmetics");
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
        // insert SafeWord "shrek" in var1
        // insert 37 in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + SAFEWORD_KEYWORD + " \"" + STRING + "\" " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                INSERT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "varAssignmentMismatch");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Variable Assignment ID not found")
    void badWeather_variable_assignment_not_found() throws Exception {
        // Assigning values in undeclared variables is not allowed
        // insert 37 in var1
        // moan var1
        String srcCode =
                INSERT_KEYWORD + " " + INTEGER_1 + " " + IN_KEYWORD + " " + VAR_IDENT1 + " " +
                MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "varIdNotFound");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Token not found")
    void badWeather_token_not_found() throws Exception {
        // moan var1
        String srcCode = MOAN_KEYWORD + " " + VAR_IDENT1;
        JasminBytecode code = this.c.compileString(srcCode, "varIdNotFound");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: method identifier used as variable")
    void badWeather_method_identifier_as_variable() throws Exception {
        String srcCode = "bedActivity intercourse empty() {" +
                "ejaculate" +
                "} " +
                "intercourse";
        JasminBytecode code = this.c.compileString(srcCode, "methodIdAsVar");
        assertNull(code);
    }

    @Test
    @DisplayName("Good Weather: storing array value in a variable")
    void goodWeather_SafeWords_valueChange() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert SafeWord ass[0] in b "
                        + "moan b", "SafeWordsValChange");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "shrek"
        }, output.toArray());
    }
}
