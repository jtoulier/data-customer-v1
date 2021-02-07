package com.reto2.datacustomerv1.dto.mapper.response;

import com.reto2.datacustomerv1.dto.response.CardResponse;
import com.reto2.datacustomerv1.repository.entity.CardEntity;

public class CardMapperResponse {
    public CardResponse convertEntityToResponse(CardEntity cardEntity) {
        CardResponse cardResponse = null;

        if (cardEntity != null) {
            cardResponse = new CardResponse();

            cardResponse.setCardNumber(cardEntity.getCardEntityKey().getCardNumber());
            cardResponse.setInternetPassword(cardEntity.getInternetPassword());
        }

        return cardResponse;
    }
}
