package com.radualmasan.codility.xtra.athlantean;

public class GramaticalException extends RuntimeException {

    public GramaticalException() {
    }

    public GramaticalException(String message) {
        super(message);
    }

    public GramaticalException(String message, Throwable cause) {
        super(message, cause);
    }

    public GramaticalException(Throwable cause) {
        super(cause);
    }

    public GramaticalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
