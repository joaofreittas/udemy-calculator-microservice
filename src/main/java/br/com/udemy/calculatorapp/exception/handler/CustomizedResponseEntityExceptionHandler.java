package br.com.udemy.calculatorapp.exception.handler;

import br.com.udemy.calculatorapp.exception.ExceptionResponse;
import br.com.udemy.calculatorapp.exception.UnsupportedMathOperationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception exception, WebRequest webRequest) {
        var exceptionResponse = new ExceptionResponse(
            LocalDateTime.now(),
            exception.getMessage(),
            webRequest.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestsExceptions(Exception exception, WebRequest webRequest) {
        var exceptionResponse = new ExceptionResponse(
            LocalDateTime.now(),
            exception.getMessage(),
            webRequest.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, BAD_REQUEST);
    }

}
