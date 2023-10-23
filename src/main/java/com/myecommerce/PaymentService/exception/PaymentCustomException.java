package com.myecommerce.PaymentService.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class PaymentCustomException extends RuntimeException {
    private String errorCode;

    public PaymentCustomException(String message, String errorCode){
        super(message);
        this.errorCode = errorCode;
    }
}
