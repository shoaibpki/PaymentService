package com.myecommerce.PaymentService.service;

import com.myecommerce.PaymentService.model.PaymentRequest;

public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);
}
