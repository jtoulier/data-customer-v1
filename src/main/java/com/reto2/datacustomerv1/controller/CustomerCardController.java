package com.reto2.datacustomerv1.controller;

import com.reto2.datacustomerv1.repository.CustomerCardRepository;
import com.reto2.datacustomerv1.repository.entity.CustomerCardEntity;
import com.reto2.datacustomerv1.repository.entity.key.CustomerCardEntityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-customer-v1")
public class CustomerCardController {
    @Autowired
    private CustomerCardRepository customerCardRepository;

    @GetMapping("/customer-card/{card-number}")
    public CustomerCardEntity findByCardNumber(
        @PathVariable("card-number") String cardNumber
    ) {
        CustomerCardEntityKey customerCardEntityKey = new CustomerCardEntityKey();
        customerCardEntityKey.setCardNumber(cardNumber);

        return customerCardRepository.findById(customerCardEntityKey).get();
    }
}
