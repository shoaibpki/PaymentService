package com.myecommerce.PaymentService.controller;

import com.myecommerce.PaymentService.model.PaymentRequest;
import com.myecommerce.PaymentService.model.PaymentResponse;
import com.myecommerce.PaymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping
    ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest){
        Long id = paymentService.doPayment(paymentRequest);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping("{orderId}")
    ResponseEntity<PaymentResponse> getPaymentByOrderId(@PathVariable long orderId){
        PaymentResponse paymentResponse = paymentService.getPaymentByOrderId(orderId);
        return new ResponseEntity(paymentResponse, HttpStatus.OK);
    }
}
