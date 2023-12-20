package unitTest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MultiDivideTest {

	@Test
	void TestMul() {
		MultiDivide objMul = new MultiDivide();
		int expected = 8;
		int actual = objMul.Mult(2, 2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void TestDiv() {
		MultiDivide objDiv = new MultiDivide();
		int expected = 5;
		int actual = objDiv.Div(10, 2);
		assertEquals(expected, actual);
	}

}
