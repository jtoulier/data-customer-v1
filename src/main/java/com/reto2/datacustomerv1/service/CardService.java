package com.reto2.datacustomerv1.service;

import com.reto2.datacustomerv1.dto.response.CardResponse;

public interface CardService {
    CardResponse findByCardNumber(String cardNumber);
}
