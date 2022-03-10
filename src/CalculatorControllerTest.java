import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {
	
	private CalculatorController controller;
	
	@Before
	public void instantiate() throws Exception{
		controller = new CalculatorController();
	}
	
	private class SampleRequest implements Request{
		public String getName() {
			return "test";
		}

		@Override
		public int getParam1() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getParam2() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	private class SampleHandler implements RequestHandler{
		public String getName() {
			return "test";
		}

		@Override
		public Response process(Request request) throws Exception {
			// TODO Auto-generated method stub
			return new SampleResponse();
		}
		
	}
	private class SampleResponse implements Response{
	//empty
	}


	@Test
	public void testProcessRequest() {
		Request request = new SampleRequest();
		RequestHandler handler = new SampleHandler();
		controller.addHandler(request, handler);
		Response response = controller.processRequest(request);
		assertNotNull("must not return a null",response);
		assertEquals(SampleResponse.class, response.getClass());

	}

	@Test
	public void testAddHandler() {
		Request request = new SampleRequest();
		RequestHandler requestHandler = new SampleHandler();
		controller.addHandler(request, requestHandler);
		RequestHandler handler2 = controller.getHandler(request);
		assertSame("Handler we sent in controller should be the same ", handler2, requestHandler);
		
	}

}
