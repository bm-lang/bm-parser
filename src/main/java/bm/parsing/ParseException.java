package bm.parsing;

import java.io.IOException;

public class ParseException extends Exception {

    public ParseException(IOException e) {
        super(e);
    }

}
