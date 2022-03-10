import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

public class AddTest {

	@Test
	public void testAdd() {
		Add a = new Add();
		double result = a.add(10,20);
		assertEquals(30, result);
	}

}
