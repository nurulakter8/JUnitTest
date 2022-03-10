import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractTest {

	@Test
	public void testSubtract() {
		Subtract s = new Subtract();
		double result = s.sub(20,10);
		assertEquals(10, result);
	}

}
