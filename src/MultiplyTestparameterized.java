import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class MultiplyTestparameterized {
	private int expected;
	private int valueOne;
	private int valueTwo;
	
	
@Parameters
public static Collection multipCollection() {
	return Arrays.asList(new Integer[][] {
		{6, 3, 2},
		{8, 4, 2},
		{10, 5, 2},
	});
	
}

public MultiplyTestparameterized (int expected, int valueOne, int  valueTwo) {
	this.expected = expected;
	this.valueOne = valueOne;
	this.valueTwo = valueTwo;
}
	
	@Test
public void sum() {
		Multiply m = new Multiply();
		assertEquals(expected, m.multiply(valueOne, valueTwo));
	}

}
