package org.mysoftnet.t.dao.exception;

/**
 * The Class EntityNotFoundException.
 */
public class EntityNotFoundException extends DaoException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new entity not found exception.
	 */
	public EntityNotFoundException() {
		super();
	}

	/**
	 * Instantiates a new entity not found exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public EntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new entity not found exception.
	 *
	 * @param message the message
	 */
	public EntityNotFoundException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new entity not found exception.
	 *
	 * @param cause the cause
	 */
	public EntityNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
