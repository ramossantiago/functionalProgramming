package excepciones;

public class CadenaVaciaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private final String message;

	public CadenaVaciaException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
