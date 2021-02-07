package com.reto2.datacustomerv1.service.impl;

import com.reto2.datacustomerv1.dto.mapper.response.CardMapperResponse;
import com.reto2.datacustomerv1.dto.mapper.response.CustomerCardMapperResponse;
import com.reto2.datacustomerv1.dto.response.CardResponse;
import com.reto2.datacustomerv1.dto.response.CustomerCardResponse;
import com.reto2.datacustomerv1.repository.CustomerCardRepository;
import com.reto2.datacustomerv1.repository.entity.CardEntity;
import com.reto2.datacustomerv1.repository.entity.CustomerCardEntity;
import com.reto2.datacustomerv1.repository.entity.key.CardEntityKey;
import com.reto2.datacustomerv1.repository.entity.key.CustomerCardEntityKey;
import com.reto2.datacustomerv1.service.CustomerCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerCardServiceImpl implements CustomerCardService {
    @Autowired
    private CustomerCardRepository customerCardRepository;


    @Override
    public CustomerCardResponse findByCardNumber(String cardNumber) {
        CustomerCardResponse customerCardResponse = null;

        CustomerCardEntityKey customerCardEntityKey = new CustomerCardEntityKey();
        customerCardEntityKey.setCardNumber(cardNumber);

        Optional<CustomerCardEntity> customerCardEntityOptional = customerCardRepository.findById(customerCardEntityKey);

        if (customerCardEntityOptional.isPresent()) {
            CustomerCardMapperResponse customerCardMapperResponse = new CustomerCardMapperResponse();
            customerCardResponse = customerCardMapperResponse.convertEntityToResponse(customerCardEntityOptional.get());
        }

        return customerCardResponse;
    }
}
