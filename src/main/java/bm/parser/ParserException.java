package bm.parser;

import java.io.IOException;

public class ParserException extends RuntimeException {

    public ParserException(String message) { super(message); }

    public ParserException(Throwable cause) { super(cause); }

    public ParserException(String message, Throwable cause) { super(message, cause); }

    public ParserException(IOException e) {
        super(e);
    }

}
