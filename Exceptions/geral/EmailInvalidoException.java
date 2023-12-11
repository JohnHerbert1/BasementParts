package geral;

public class EmailInvalidoException extends Exception {

	public EmailInvalidoException() {
		super("Email invalido verificar {@} ou {.com}");
	}

}
