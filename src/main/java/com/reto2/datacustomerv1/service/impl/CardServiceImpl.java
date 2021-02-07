package com.reto2.datacustomerv1.service.impl;

import com.reto2.datacustomerv1.dto.mapper.response.CardMapperResponse;
import com.reto2.datacustomerv1.dto.response.CardResponse;
import com.reto2.datacustomerv1.repository.CardRepository;
import com.reto2.datacustomerv1.repository.entity.CardEntity;
import com.reto2.datacustomerv1.repository.entity.key.CardEntityKey;
import com.reto2.datacustomerv1.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepository cardRepository;

    @Override
    public CardResponse findByCardNumber(String cardNumber) {
        CardResponse cardResponse = null;

        CardEntityKey cardEntityKey = new CardEntityKey();
        cardEntityKey.setCardNumber(cardNumber);

        Optional<CardEntity> cardEntityOptional = cardRepository.findById(cardEntityKey);

        if (cardEntityOptional.isPresent()) {
            CardMapperResponse cardMapperResponse = new CardMapperResponse();
            cardResponse = cardMapperResponse.convertEntityToResponse(cardEntityOptional.get());
        }

        return cardResponse;
    }
}
