package org.ledrub.lecxeojop.databind.exceptions;

public abstract class LecxeojopException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public LecxeojopException(String message, Throwable cause) {
        super(message, cause);
    }
}
