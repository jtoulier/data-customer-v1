package com.reto2.datacustomerv1.dto.mapper.response;

import com.reto2.datacustomerv1.dto.response.CustomerCardResponse;
import com.reto2.datacustomerv1.repository.entity.CustomerCardEntity;

public class CustomerCardMapperResponse {
    public CustomerCardResponse convertEntityToResponse(CustomerCardEntity customerCardEntity) {
        CustomerCardResponse customerCardResponse = null;

        if (customerCardEntity != null) {
            customerCardResponse = new CustomerCardResponse();

            customerCardResponse.setCardNumber(customerCardEntity.getCustomerCardEntityKey().getCardNumber());
            customerCardResponse.setCic(customerCardEntity.getCic());
        }

        return customerCardResponse;
    }
}
