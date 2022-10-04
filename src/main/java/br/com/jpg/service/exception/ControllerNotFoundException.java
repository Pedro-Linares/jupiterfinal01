package br.com.jpg.service.exception;

public class ControllerNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ControllerNotFoundException(Integer message) {
		super("Not found id " + message);
	}

}