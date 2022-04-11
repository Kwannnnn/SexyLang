package nl.saxion.cos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class UserInputTest extends TestBase{
    // Language specifics
    public static final String MOAN_KEYWORD = "moan";
    public static final String WHAT_LENGTH_CALL = "whatLength()";

    private Compiler c = new Compiler();
    private final InputStream oldIn = System.in;

    @BeforeEach
    void setUp() {
        this.c = new Compiler();
    }

    @AfterEach
    void cleanup() {
        System.setIn(oldIn);
    }

    @Test
    @DisplayName("Good weather whatLength() call")
    void goodWeather_whatLengthCall() throws Exception {
        String input = String.valueOf(6.9F);

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // moan 6.9
        String srcCode =
                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
        JasminBytecode code = this.c.compileString(srcCode, "whatLength");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "6.9"
        }, output.toArray());
    }

    @Test
    @DisplayName("Bad weather whatLength() call - invalid type (bulge)")
    void badWeather_whatLengthCall_invalid_type_bulge() throws Exception {
        String input = "hard";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // moan hard
        String srcCode =
                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
        JasminBytecode code = this.c.compileString(srcCode, "whatLengthBulge");

        // Check that correct exception is thrown
        assertThrows(IllegalArgumentException.class, () -> runCode(code));
    }
    @Test
    @DisplayName("Bad weather whatLength() call - invalid type (SafeWord)")
    void badWeather_whatLengthCall_invalid_type_SafeWord() throws Exception {
        String input = "\"shrek\"";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // moan hard
        String srcCode =
                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
        JasminBytecode code = this.c.compileString(srcCode, "whatLengthSafeWord");

        // Check that correct exception is thrown
        assertThrows(IllegalArgumentException.class, () -> runCode(code));
    }

    @Test
    @DisplayName("Bad weather whatLength() call - invalid type (bodyCountArray)")
    void badWeather_whatLengthCall_invalid_type_bodyCountArray() throws Exception {
        String input = "[6, 9, 6]";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // moan hard
        String srcCode =
                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
        JasminBytecode code = this.c.compileString(srcCode, "whatLengthBodyCountArray");

        // Check that correct exception is thrown
        assertThrows(IllegalArgumentException.class, () -> runCode(code));
    }

    @Test
    @DisplayName("Bad weather whatLength() call - invalid type (lengthArray)")
    void badWeather_whatLengthCall_invalid_type_lengthArray() throws Exception {
        String input = "[6.9, 9.6, 6.9]";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // moan hard
        String srcCode =
                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
        JasminBytecode code = this.c.compileString(srcCode, "whatLengthLengthArray");

        // Check that correct exception is thrown
        assertThrows(IllegalArgumentException.class, () -> runCode(code));
    }

    @Test
    @DisplayName("Bad weather whatLength() call - invalid type (SafeWordArray)")
    void badWeather_whatLengthCall_invalid_type_SafeWordArray() throws Exception {
        String input = "[\"shrek\", \"fiona\"]";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // moan hard
        String srcCode =
                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
        JasminBytecode code = this.c.compileString(srcCode, "whatLengthSafeWordArray");

        // Check that correct exception is thrown
        assertThrows(IllegalArgumentException.class, () -> runCode(code));
    }

    @Test
    @DisplayName("Bad weather whatLength() call - invalid type (bulgeArray)")
    void badWeather_whatLengthCall_invalid_type_bulgeArray() throws Exception {
        String input = "[hard, soft, hard]";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // moan hard
        String srcCode =
                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
        JasminBytecode code = this.c.compileString(srcCode, "whatLengthBulgeArray");

        // Check that correct exception is thrown
        assertThrows(IllegalArgumentException.class, () -> runCode(code));
    }

}
