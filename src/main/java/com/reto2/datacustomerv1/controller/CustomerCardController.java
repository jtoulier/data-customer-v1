package com.reto2.datacustomerv1.controller;

import com.reto2.datacustomerv1.dto.response.CustomerCardResponse;
import com.reto2.datacustomerv1.service.CustomerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-customer-v1")
public class CustomerCardController {
    @Autowired
    private CustomerCardService customerCardService;

    @GetMapping("/customer-card/{card-number}")
    public ResponseEntity<CustomerCardResponse> findByCardNumber(
        @PathVariable("card-number") String cardNumber
    ) {
        return new ResponseEntity(customerCardService.findByCardNumber(cardNumber), HttpStatus.OK);
    }
}
