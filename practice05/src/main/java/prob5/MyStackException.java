package prob5;

public class MyStackException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public MyStackException() {
		super("");
	}
	
	public MyStackException(String msg) {
		super(msg);
	}
}
