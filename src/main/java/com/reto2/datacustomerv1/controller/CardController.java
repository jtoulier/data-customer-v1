package com.reto2.datacustomerv1.controller;

import com.reto2.datacustomerv1.repository.entity.CardEntity;
import com.reto2.datacustomerv1.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-customer-v1")
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping("/card/{card-number}")
    public ResponseEntity<CardEntity> findByCardNumber(
        @PathVariable("card-number") String cardNumber
    ) {
        return new ResponseEntity(cardService.findByCardNumber(cardNumber), HttpStatus.OK);
    }
}
