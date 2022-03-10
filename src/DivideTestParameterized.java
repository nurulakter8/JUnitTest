import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class DivideTestParameterized {
	private int expected;
	private int valueOne;
	private int valueTwo;
	
	
@Parameters
public static Collection multipCollection() {
	return Arrays.asList(new Integer[][] {
		{2, 10, 5},
		{2, 4, 2},
		{3, 6, 2},
	});
	
}

public DivideTestParameterized (int expected, int valueOne, int  valueTwo) {
	this.expected = expected;
	this.valueOne = valueOne;
	this.valueTwo = valueTwo;
}
	
	@Test
public void sum() {
		Divide d = new Divide();
		assertEquals(expected, d.divide(valueOne, valueTwo));
	}

}
