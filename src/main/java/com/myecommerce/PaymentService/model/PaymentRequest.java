package com.myecommerce.PaymentService.model;

import lombok.*;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PaymentRequest {

    private long orderId;
    private String referenceNumber;
    private PaymentMode paymentMode;
    private Instant paymentDate;
    private long amount;
}
