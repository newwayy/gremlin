package com.tinkerpop.gremlin.lang;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @version 0.1
 */
public class EvaluationErrorException extends RuntimeException {
    public EvaluationErrorException(String message) {
        super(message);
    }
}
