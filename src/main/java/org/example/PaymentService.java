package org.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService {

    @Transactional
    public boolean processPayment(String customerId, double amount) {
        // Обработка оплаты
        System.out.println("Payment processed for customer " + customerId + " amount " + amount);
        return true;
    }
}
