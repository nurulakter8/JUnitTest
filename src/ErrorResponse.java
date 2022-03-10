
public class ErrorResponse implements Response {
	private Request originalRequest;
	private Exception originalException;
	
	public ErrorResponse(Request request, Exception exception ) {
		this.originalException = originalException;
		this.originalRequest = originalRequest;
	}

	public Request getOriginalRequest() {
		return getOriginalRequest();
	}
	public Exception getOriException() {
		return this.originalException;
	}
}
