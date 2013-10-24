package org.mysoftnet.t.dao.exception;

/**
 * The Class TooManyResultsException.
 */
public class TooManyResultsException extends DaoException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new too many results exception.
	 */
	public TooManyResultsException() {
		super();
	}

	/**
	 * Instantiates a new too many results exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public TooManyResultsException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new too many results exception.
	 *
	 * @param message the message
	 */
	public TooManyResultsException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new too many results exception.
	 *
	 * @param cause the cause
	 */
	public TooManyResultsException(Throwable cause) {
		super(cause);
	}
	
}
