package org.mysoftnet.t.dao.exception;

public class ConstraintViolationException extends DaoException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public ConstraintViolationException() {
		super();
	}

	public ConstraintViolationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConstraintViolationException(String message) {
		super(message);
	}

	public ConstraintViolationException(Throwable cause) {
		super(cause);
	}
	
}
