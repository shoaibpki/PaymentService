package com.myecommerce.PaymentService.service;

import com.myecommerce.PaymentService.entity.TransactionDetails;
import com.myecommerce.PaymentService.model.PaymentRequest;
import com.myecommerce.PaymentService.repository.PaymentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public Long doPayment(PaymentRequest paymentRequest) {

        log.info("Recording Payment details : {}", paymentRequest);

        TransactionDetails transactionDetails =
                TransactionDetails.builder()
                        .PaymentMode(paymentRequest.getPaymentMode().name())
                        .referenceNumber(paymentRequest.getReferenceNumber())
                        .PaymentStatus("Success")
                        .orderId(paymentRequest.getOrderId())
                        .paymentDate(Instant.now())
                        .Amount(paymentRequest.getAmount())
                        .build();
        paymentRepository.save(transactionDetails);
        log.info("Transaction Completed with id : {}", transactionDetails.getId());
        return transactionDetails.getId();
    }
}
