package nl.saxion.cos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExamplePrograms extends TestBase {
    private Compiler c;
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
    void goodWeather_1_intercourse() throws Exception {
        String srcCode = "bedActivity intercourse empty () {"
                + "moanLoud \"Hello Sexy!\" "
                + "ejaculate"
                + "} "
                + "intercourse()";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "Hello Sexy!"
        }, output.toArray());
    }

    @Test
    void goodWeather_2_moreComplicated() throws Exception {
        String srcCode = "bedActivity moreComplicated empty () {"
                + "insert bodyCount 8 in rounds "
                + "insert bulge soft in isTired "
                + "if (!isTired) {"
                + "insert rounds + 1 in rounds "
                + "moanLoud \"Another round, baby!\"} "
                + "ejaculate} "
                + "moreComplicated()";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "Another round, baby!"
        }, output.toArray());
    }

    @Test
    void goodWeather_3_wayMoreComplicated() throws Exception {
        String srcCode = "bedActivity wayMoreComplicated empty () {"
                + "insert bodyCount 16 in p1Age "
                + "insert bodyCount 21 in p2Age "
                + "insert bulge hard in isConsensual "
                + "insert SafeWord \"\" in message "
                + "if (isConsensual) {"
                + "if (p1Age < 16 or p2Age < 16) {"
                + "insert \"Hey, that's illegal!\" in message"
                + "} else {"
                + "insert \"Here we go!\" in message"
                + "} } else {"
                + "insert \"I respect your boring decision\" in message} "
                + "moanLoud message "
                + "ejaculate} "
                + "wayMoreComplicated()";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "Here we go!"
        }, output.toArray());
    }

    @Test
    void goodWeather_4_SafeWords() throws Exception {
        String srcCode = "bedActivity getSafewords SafeWords () {"
                + "ejaculate [\"Juice it\", \"or Lose it\"]} "
                + "insert SafeWords getSafewords() in safeWordArray "
                + "insert SafeWord \"\" in safePhrase "
                + "insert bodyCount 0 in i "
                + "lube (i < 2) {"
                + "insert safePhrase + \" \" + safeWordArray[i] in safePhrase "
                + "insert i + 1 in i"
                + "} "
                + "moanLoud safePhrase";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                " Juice it or Lose it"
        }, output.toArray());
    }

    @Test
    void goodWeather_5_playToy() throws Exception {
        ByteArrayInputStream in = new ByteArrayInputStream("21".getBytes());
        System.setIn(in);

        String srcCode = "bedActivity playToy empty (length toyLength) {"
                + "insert length 20.0 in toyBattery "
                + "lube (toyBattery > 0.0) {"
                + "if (toyLength > 20.0) {"
                + "moanLoud \"It is hitting my deepest spot!\"} "
                + "moanLoud \"It's Better than the real thing!\""
                + "insert toyBattery - 10.0 in toyBattery} "
                + "moanLoud \"The fun is over. No more battery!\" "
                + "ejaculate} "
                + "insert length whatLength() in toyLength "
                + "playToy(toyLength)";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNotNull(code);

        // Check that output matches what we expect
        List<String> output = runCode(code);
        assertArrayEquals(new String[] {
                "It is hitting my deepest spot!",
                "It's Better than the real thing!",
                "It is hitting my deepest spot!",
                "It's Better than the real thing!",
                "The fun is over. No more battery!"
        }, output.toArray());
    }

    @Test
    void badWeather_1_wrong_length() throws Exception {
        String srcCode = "bedActivity wrongLength empty () {"
                + "insert length \"long\" in dLength "
                + "moanLoud dLength"
                + "ejaculate"
                + "} "
                + "intercourse()";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNull(code);
    }

    @Test
    void badWeather_2_failedEjaculation() throws Exception {
        String srcCode = "bedActivity failedEjaculation empty () {"
                + "ejaculate \"I am arriving baby!\""
                + "} "
                + "failedEjaculation()";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNull(code);
    }

    @Test
    void badWeather_3_emptiness() throws Exception {
        String srcCode = "bedActivity emptiness empty () {"
                + "insert bulge soft in isTired "
                + "if () {"
                + "moanLoud \"Another round, baby!\"} "
                + "emptiness()";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNull(code);
    }

    @Test
    void badWeather_4_wrongToy() throws Exception {
        String srcCode = "bedActivity wrongToy empty () {"
                + "insert length 69.6 in toyBattery "
                + "lube (toyBattery >= 0) {"
                + "moanLoud \"It's better than the real thing!\"} "
                + "moanLoud \"The fun is over. No more battery!\" "
                + "ejaculate}";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNull(code);
    }

    @Test
    void badWeather_5_checkSafeWord() throws Exception {
        String srcCode = "bedActivity checkSafeword bulge (SafeWord safeword) {"
                + "ejaculate hard} "
                + "insert bulge soft in safeWord "
                + "insert bulge checkSafeword(safeWord) in safeWordIsCorrect";
        JasminBytecode code = this.c.compileString(srcCode, "goodIntercourse");
        assertNull(code);
    }
}
