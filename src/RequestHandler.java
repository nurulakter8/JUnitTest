
import java.util.*;

/**
 * 
 */
public interface RequestHandler {

    /**
     * @param request 
     * @return
     * @throws Exception 
     */
    public Response process(Request request) throws Exception;

}