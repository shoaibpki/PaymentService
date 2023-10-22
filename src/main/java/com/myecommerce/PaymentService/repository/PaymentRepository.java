package com.myecommerce.PaymentService.repository;

import com.myecommerce.PaymentService.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<TransactionDetails, Long> {
}
