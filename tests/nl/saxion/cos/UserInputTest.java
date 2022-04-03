package nl.saxion.cos;

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
    public static final String ADD_SIGN = "+";
    public static final String SUB_SIGN = "-";
    public static final String MUL_SIGN = "*";
    public static final String DIV_SIGN = "/";
    public static final String WHAT_LENGTH_CALL = "whatLength()";
    // Test values
    public static final String STRING = "shrek";
    public static final int INTEGER = 37;
    public static final float FLOAT = 42.37F;
    public static final String BOOLEAN = "hard";

    private static final Compiler COMPILER = new Compiler();

    // not working
//    @Test
//    @DisplayName("Good weather whatLength() call")
//    void goodWeather_whatLengthCall() throws Exception {
//        ByteArrayInputStream in = new ByteArrayInputStream(floatToByteArray(FLOAT));
//        System.setIn(in);
//
//        // moan "shrek" - 37
//        String srcCode =
//                MOAN_KEYWORD + " " + WHAT_LENGTH_CALL;
//        // String - Int should not be allowed
//        JasminBytecode code = COMPILER.compileString(srcCode, "stringMinInt");
//        code.writeJasminToFile("dasdadasd");
//        assertNotNull(code, "Subtraction of strings and integers should not be allowed");
//
//        // Check that output matches what we expect
//        List<String> output = runCode(code);
//        assertArrayEquals(new String[] {
//                String.valueOf(FLOAT)
//        }, output.toArray());
//    }

    public static byte[] floatToByteArray(float value) {
        int intBits =  Float.floatToIntBits(value);
        return new byte[] {
                (byte) (intBits >> 24), (byte) (intBits >> 16), (byte) (intBits >> 8), (byte) (intBits) };
    }
}
