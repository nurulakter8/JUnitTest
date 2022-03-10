
import java.util.*;

import javax.management.RuntimeErrorException;

/**
 * 
 */
public class CalculatorController implements Controller {
	
	private Map requestHandlers = new HashMap();

    /**
     * Default constructor
     */
    public CalculatorController() {
    }


    /**
     * @param request 
     * @return
     */
    public Response processRequest(Request request) {
        Response response;
        try {
        	response = getHandler(request).process(request);
        }catch (Exception exception) {
			// TODO: handle exception
        	response = new ErrorResponse(request, exception); 
		}
        return response;
    }

    public RequestHandler getHandler(Request request) {
		if (!this.requestHandlers.containsKey(request.getName())) {
			String message = "Cannont find Handler" + request.getName();
			throw new RuntimeException(message);
		}
		return (RequestHandler) 
					this.requestHandlers.get(request.getClass());
	}


	/**
     * @param request 
     * @param requestHandler
     */
    public void addHandler(Request request, RequestHandler requestHandler) {
        // TODO implement here
    	if(this.requestHandlers.containsKey(request.getName())) {
    		throw new RuntimeException("A request controller already registered " + request.getName());
    	}else {
			this.requestHandlers.put(request.getName(), requestHandler);
		}
    }

}