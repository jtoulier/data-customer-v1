package com.reto2.datacustomerv1.controller;

import com.reto2.datacustomerv1.repository.CardRepository;
import com.reto2.datacustomerv1.repository.entity.CardEntity;
import com.reto2.datacustomerv1.repository.entity.key.CardEntityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-customer-v1")
public class CardController {
    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/card/{card-number}")
    public CardEntity findByCardNumber(
        @PathVariable("card-number") String cardNumber
    ) {
        CardEntityKey cardEntityKey = new CardEntityKey();
        cardEntityKey.setCardNumber(cardNumber);

        return cardRepository.findById(cardEntityKey).get();
    }
}
