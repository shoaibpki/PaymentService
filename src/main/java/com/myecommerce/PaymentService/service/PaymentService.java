package com.myecommerce.PaymentService.service;

import com.myecommerce.PaymentService.model.PaymentRequest;
import com.myecommerce.PaymentService.model.PaymentResponse;

public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentByOrderId(long orderId);
}
