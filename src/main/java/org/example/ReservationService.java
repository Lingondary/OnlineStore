package org.example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservationService {

    @Transactional
    public boolean reserveItem(long itemId, int quantity) {
        System.out.println("Item " + itemId + " reserved, quantity: " + quantity);
        return true;
    }
}
