package com.development.centerAt.errorHandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

import static com.development.centerAt.constants.Constants.TIME_PATTERN;

@RestControllerAdvice
@Slf4j
public class ErrorHandler {

    @ExceptionHandler
    public ErrorResponse handle(MethodArgumentNotValidException exception) {
        log.error("exception ={}", exception.getMessage());
        return new ErrorResponse(exception.getStatusCode().toString(), "Incorrectly made request.", exception.getMessage(), LocalDateTime.now().format(TIME_PATTERN));
    }


}
