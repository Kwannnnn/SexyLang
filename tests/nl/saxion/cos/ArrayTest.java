package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest extends TestBase{
    private Compiler c;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    // region bodyCounts tests
    @Test
    @DisplayName("Good Weather: Simple bodyCounts declaration")
    void goodWeather_bodyCounts_decl() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass", "bodyCountsDecl");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCounts assignment")
    void goodWeather_bodyCounts_assign() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                + "insert [9, 6, 9] in ass", "bodyCountsAss");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCounts value access")
    void goodWeather_bodyCounts_valueAccess() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "moan ass[0]", "bodyCountsValAcc");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "6"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bodyCounts value change")
    void goodWeather_bodyCounts_valueChange() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "insert 69 in ass[0]"
                        + "moan ass[0]", "bodyCountsValChange");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "69"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: bodyCounts declaration with invalid types")
    void badWeather_bodyCounts_decl() throws Exception {
        // length elements
        JasminBytecode code = this.c.compileString(
                "insert bodyCounts [6.9, 9.6, 6.9] in ass "
                , "bodyCountsValAcc");
        assertNull(code);

        // bulge elements
        code = this.c.compileString(
                "insert bodyCounts [hard, soft] in ass "
                , "bodyCountsValAcc");
        assertNull(code);

        // SafeWord elements
        code = this.c.compileString(
                "insert bodyCounts [\"shrek\", \"fiona\"] in ass "
                , "bodyCountsValAcc");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bodyCounts assignment with invalid types")
    void badWeather_bodyCounts_assign() throws Exception {
        // length element
        JasminBytecode code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "insert [9.6, 6.9] in ass", "bodyCountsAssInvalid");
        assertNull(code);

        // bulge elements
        code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "insert [hard, soft] in ass", "bodyCountsAssInvalid");
        assertNull(code);

        // SafeWord elements
        code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "insert [\"shrek\", \"fiona\"] in ass", "bodyCountsAssInvalid");
        assertNull(code);

    }

    @Test
    @DisplayName("Bad Weather: Simple bodyCounts value change with invalid type")
    void badWeather_bodyCounts_valueChange() throws Exception {
        // length value
        JasminBytecode code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "insert 6.9 in ass[0]"
                , "bodyCountsValChange");
        assertNull(code);

        // bulge value
        code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "insert hard in ass[0]"
                , "bodyCountsValChange");
        assertNull(code);

        // SafeWord value
        code = this.c.compileString(
                "insert bodyCounts [6, 9, 6] in ass "
                        + "insert \"shrek\" in ass"
                , "bodyCountsValChange");
        assertNull(code);
    }
    // endregion

    // region lengths tests
    @Test
    @DisplayName("Good Weather: Simple lengths declaration")
    void goodWeather_lengths_decl() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert lengths [6.9, 9.6, 6.9] in ass", "lengthsDecl");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple lengths assignment")
    void goodWeather_lengths_assign() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert lengths [6.9, 9.6, 6.9] in ass "
                        + "insert [1.1, 6.6, 123.123] in ass", "lengthsAss");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple lengths value access")
    void goodWeather_lengths_valueAccess() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert lengths [6.9, 9.6, 6.9] in ass "
                        + "moan ass[0]", "lengthsValAcc");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "6.9"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple lengths value change")
    void goodWeather_lengths_valueChange() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert lengths [6.9, 9.6, 6.9] in ass "
                        + "insert 69.96 in ass[0]"
                        + "moan ass[0]", "lengthsValChange");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "69.96"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: lengths declaration with invalid types")
    void badWeather_lengths_decl() throws Exception {
        // bodyCount elements
        JasminBytecode code = this.c.compileString(
                "insert lengths [6, 9, 6] in ass "
                , "lengthsValAcc");
        assertNull(code);

        // bulge elements
        code = this.c.compileString(
                "insert lengths [hard, soft] in ass "
                , "lengthsValAcc");
        assertNull(code);

        // SafeWord elements
        code = this.c.compileString(
                "insert lengths [\"shrek\", \"fiona\"] in ass "
                , "lengthsValAcc");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple lengths assignment with invalid types")
    void badWeather_lengths_assign() throws Exception {
        // bodyCount element
        JasminBytecode code = this.c.compileString(
                "insert lengths [6.9, 9.6, 6.9] in ass "
                        + "insert [9, 6] in ass", "lengthsAssInvalid");
        assertNull(code);

        // bulge elements
        code = this.c.compileString(
                "insert lengths [6, 9, 6] in ass "
                        + "insert [hard, soft] in ass", "lengthsAssInvalid");
        assertNull(code);

        // SafeWord elements
        code = this.c.compileString(
                "insert lengths [6, 9, 6] in ass "
                        + "insert [\"shrek\", \"fiona\"] in ass", "lengthsAssInvalid");
        assertNull(code);

    }

    @Test
    @DisplayName("Bad Weather: Simple lengths value change with invalid type")
    void badWeather_lengths_valueChange() throws Exception {
        // bulge value
        JasminBytecode code = this.c.compileString(
                "insert lengths [6, 9, 6] in ass "
                        + "insert hard in ass[0]"
                , "lengthsValChange");
        assertNull(code);

        // SafeWord value
        code = this.c.compileString(
                "insert lengths [6.9, 9.6, 6.9] in ass "
                        + "insert \"shrek\" in ass[0]"
                , "lengthsValChange");
        assertNull(code);
    }
    // endregion


    // region bulges tests
    @Test
    @DisplayName("Good Weather: Simple bulges declaration")
    void goodWeather_bulges_decl() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass", "bulgesDecl");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulges assignment")
    void goodWeather_bulges_assign() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "insert [soft, hard, soft] in ass", "bulgesAss");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulges value access")
    void goodWeather_bulges_valueAccess() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "moan ass[0]", "bulgesValAcc");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "true"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple bulges value change")
    void goodWeather_bulges_valueChange() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "insert soft in ass[0]"
                        + "moan ass[0]", "bulgesValChange");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "false"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: bulges declaration with invalid types")
    void badWeather_bulges_decl() throws Exception {
        // length elements
        JasminBytecode code = this.c.compileString(
                "insert bulges [6.9, 9.6] in ass "
                , "bulgesValAcc");
        assertNull(code);

        // bodyCount elements
        code = this.c.compileString(
                "insert bulges [6, 9, 6] in ass "
                , "bulgesValAcc");
        assertNull(code);

        // SafeWord elements
        code = this.c.compileString(
                "insert lengths [\"shrek\", \"fiona\"] in ass "
                , "bulgesValAcc");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple bulges assignment with invalid types")
    void badWeather_bulges_assign() throws Exception {
        // bodyCount element
        JasminBytecode code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "insert [9, 6] in ass", "bulgesAssInvalid");
        assertNull(code);

        // length elements
        code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "insert [6.9, 9.6] in ass", "bulgesAssInvalid");
        assertNull(code);

        // SafeWord elements
        code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "insert [\"shrek\", \"fiona\"] in ass", "bulgesAssInvalid");
        assertNull(code);

    }

    @Test
    @DisplayName("Bad Weather: Simple bulges value change with invalid type")
    void badWeather_bulges_valueChange() throws Exception {
        // bodyCount value
        JasminBytecode code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "insert 1 in ass[0]"
                , "bulgesValChange");
        assertNull(code);

        // SafeWord value
        code = this.c.compileString(
                "insert bulges [hard, soft, hard] in ass "
                        + "insert \"shrek\" in ass[0]"
                , "bulgesValChange");
        assertNull(code);
    }
    // endregion

    // region SafeWord tests
    @Test
    @DisplayName("Good Weather: Simple SafeWords declaration")
    void goodWeather_SafeWords_decl() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass"
                , "SafeWordDecl");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWords assignment")
    void goodWeather_SafeWords_assign() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert [\"donkey\"] in ass", "SafeWordsAss");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                ""
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWords value access")
    void goodWeather_SafeWords_valueAccess() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "moan ass[0]", "SafeWordsValAcc");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "shrek"
        }, output.toArray());
    }

    @Test
    @DisplayName("Good Weather: Simple SafeWords value change")
    void goodWeather_SafeWords_valueChange() throws Exception {
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert \"donkey\" in ass[0] "
                        + "moan ass[0]", "SafeWordsValChange");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[]{
                "donkey"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad Weather: SafeWords declaration with invalid types")
    void badWeather_SafeWords_decl() throws Exception {
        // length elements
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [6.9, 9.6] in ass"
                , "SafeWordsValAcc");
        assertNull(code);

        // bodyCount elements
        code = this.c.compileString(
                "insert SafeWords [69, 96] in ass"
                , "SafeWordsValAcc");
        assertNull(code);

        // bulge elements
        code = this.c.compileString(
                "insert SafeWords [hard, soft] in ass "
                , "SafeWordsValAcc");
        assertNull(code);
    }

    @Test
    @DisplayName("Bad Weather: Simple SafeWords assignment with invalid types")
    void badWeather_SafeWords_assign() throws Exception {
        // bodyCount element
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert [69, 96] in ass", "SafeWordsAssInvalid");
        assertNull(code);

        // length elements
        code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert [6.9, 9.6] in ass", "SafeWordsAssInvalid");
        assertNull(code);

        // bulge elements
        code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert [hard, soft] in ass", "SafeWordsAssInvalid");
        assertNull(code);

    }

    @Test
    @DisplayName("Bad Weather: Simple SafeWords value change with invalid type")
    void badWeather_SafeWords_valueChange() throws Exception {
        // bodyCount value
        JasminBytecode code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert 1 in ass[0]"
                , "SafeWordsValChange");
        assertNull(code);

        // length value
        code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert 6.9 in ass[0]"
                , "SafeWordsValChange");
        assertNull(code);

        // bulge value
        code = this.c.compileString(
                "insert SafeWords [\"shrek\", \"fiona\"] in ass "
                        + "insert hard in ass[0]"
                , "SafeWordsValChange");
        assertNull(code);
    }
    // endregion
}
