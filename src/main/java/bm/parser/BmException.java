package bm.parser;

public class BmException extends RuntimeException {

    public BmException(String message) { super(message); }

    public BmException(Throwable cause) { super(cause); }

    public BmException(String message, Throwable cause) { super(message, cause); }

}
