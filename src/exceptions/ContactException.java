package exceptions;

@SuppressWarnings("serial")
public class ContactException extends Exception{

	public final static int name = 101;
	public final static int number = 202;
	
	private int error;
	
	public ContactException (int error) {
		super();
		this.error = error;		
	}

	@Override
	public String getMessage() {
		//m = message
		String m = "";
		
		switch (error) {
		case name:
			
			m = "Please insert a name for your new contact";
			
			break;

		case number:
			
			m = "Please insert a phine number for your new contact";
			
			break;
		}
		return m;
	}
	
	
}
