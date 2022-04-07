package nl.saxion.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This file shows a few different ways you can do automated tests:
 *
 *  - checkByteCode():        Shows how to compile a file and check that the bytecode that was
 *                            generated matches your expectations.
 *  - checkByteCode2():       Same as above, but now the output is stored in a file.
 *  - syntaxErrorsAreFound(): Checks that a file with syntax errors stops compilation.
 *  - checkOutputFile():      This test shows how to compile a file, run it and check if the output
 *                            matches your expectations.
 *  - checkOutputString():    Same as above, but now the source code is coming from a string within
 *                            the test.
 *
 * Not shown is a test where the file contains no syntax errors, but the checker should find some
 * error. You can of course add that yourself.
 */
class CompilerTest extends TestBase {
	private Compiler c;

	@BeforeEach
	void setUp() {
		c = new Compiler();
	}

	@Test
	void checkByteCode() throws Exception {
		// Compile the file testFiles/hello.exlang
		JasminBytecode code = this.c.compileFile("testFiles/helloSexy.sexy", "HelloWorld");
		assertNotNull(code);

		// Check that the bytecode matches what we expect
		assertArrayEquals(new String[] {
				".bytecode 49.0",
				".class public HelloWorld",
				".super java/lang/Object",
				"",
				".method public static main([Ljava/lang/String;)V",
				".limit stack 99",
				".limit locals 99",
				"",
				"getstatic java/lang/System/out Ljava/io/PrintStream;",
				"ldc \"Hello Sexy\"",
				"invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V",
				"return",
				".end method"
		}, code.getLines().toArray());
	}

	@Test
	void checkByteCode2() throws Exception {
		// Compile the file testFiles/helloSexy.sexy
		JasminBytecode code = this.c.compileFile("testFiles/helloSexy.sexy", "HelloWorld");
		assertNotNull(code);

		// Check that the bytecode matches what we expect
		List<String> expectedOutput = Files.readAllLines(Paths.get("testFiles/helloSexy.expected_j"));
		assertArrayEquals(expectedOutput.toArray(), code.getLines().toArray());
	}

	@Test
	void syntaxErrorsAreFound() throws Exception {
		// Try to compile a file with syntax errors. The compiler should detect this and should
		// return null.
		JasminBytecode code = this.c.compileString("dfsgkjs;", "HelloWorld");
		assertNull(code);
	}

	@Test
	void checkOutputFile() throws Exception {
		// Compile and assemble testFiles/helloSexy.sexy
		JasminBytecode code = this.c.compileFile("testFiles/helloSexy.sexy", "HelloWorld");
		assertNotNull(code);

		// Check that output matches what we expect
		List<String> output = runCode(code);
		assertArrayEquals(new String[] {
				"Hello Sexy"
		}, output.toArray());
	}

	@Test
	void checkOutputString() throws Exception {
		// Compile and assemble the string 'hello; hi;'
		JasminBytecode code = this.c.compileString("moanLoud \"Hello Sexy\"", "HelloWorld");
		assertNotNull(code);

		// Check that output matches what we expect
		List<String> output = runCode(code);
		assertArrayEquals(new String[] {
				"Hello Sexy"
		}, output.toArray());
	}
}
