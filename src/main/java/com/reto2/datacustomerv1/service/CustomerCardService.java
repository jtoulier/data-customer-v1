package com.reto2.datacustomerv1.service;

import com.reto2.datacustomerv1.dto.response.CustomerCardResponse;

public interface CustomerCardService {
    CustomerCardResponse findByCardNumber(String cardNumber);
}
