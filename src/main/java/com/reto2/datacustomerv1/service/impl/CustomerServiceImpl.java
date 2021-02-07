package com.reto2.datacustomerv1.service.impl;

import com.reto2.datacustomerv1.dto.mapper.response.CustomerMapperResponse;
import com.reto2.datacustomerv1.dto.response.CustomerResponse;
import com.reto2.datacustomerv1.repository.CustomerRepository;
import com.reto2.datacustomerv1.repository.entity.CustomerEntity;
import com.reto2.datacustomerv1.repository.entity.key.CustomerEntityKey;
import com.reto2.datacustomerv1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerResponse findByCic(String cic) {
        CustomerResponse customerResponse = null;

        CustomerEntityKey customerEntityKey = new CustomerEntityKey();
        customerEntityKey.setCic(cic);

        Optional<CustomerEntity> customerEntityOptional = customerRepository.findById(customerEntityKey);

        if (customerEntityOptional.isPresent()) {
            CustomerMapperResponse customerMapperResponse = new CustomerMapperResponse();
            customerResponse = customerMapperResponse.convertEntityToResponse(customerEntityOptional.get());
        }

        return customerResponse;
    }
}
