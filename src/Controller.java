
import java.util.*;

/**
 * 
 */
public interface Controller {

    /**
     * @param request 
     * @return
     */
    public Response processRequest(Request request);

    /**
     * @param request 
     * @param requestHandler
     */
    public void addHandler(Request request, RequestHandler requestHandler);

}