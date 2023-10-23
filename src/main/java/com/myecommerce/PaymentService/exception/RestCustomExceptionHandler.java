package com.myecommerce.PaymentService.exception;

import com.myecommerce.PaymentService.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestCustomExceptionHandler {

    @ExceptionHandler(PaymentCustomException.class)
    ResponseEntity<ErrorResponse> restCustomError(PaymentCustomException exception ){
        return new ResponseEntity<>(
                ErrorResponse.builder()
                        .errorCode(exception.getErrorCode())
                        .message(exception.getMessage())
                        .build(),
                HttpStatus.NOT_FOUND
        );
    }
}
