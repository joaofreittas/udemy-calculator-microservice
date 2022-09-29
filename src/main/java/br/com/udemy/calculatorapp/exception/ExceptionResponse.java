package br.com.udemy.calculatorapp.exception;

import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
public class ExceptionResponse implements Serializable {

    private static final Long serialVersionUID = 1L;
    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ExceptionResponse(final LocalDateTime timestamp, final String message, final String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

}
