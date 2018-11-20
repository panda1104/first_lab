package mycode;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

class Test {

	@org.junit.jupiter.api.Test
	void test() throws IOException {
		String s = File_work.readFiles("C:\\Lina\\test_text1.txt","C:\\Lina\\test_text_2.txt");
		System.out.println(s);
		assertEquals("abcd",s);
		//fail("Not yet implemented");
	}

}
