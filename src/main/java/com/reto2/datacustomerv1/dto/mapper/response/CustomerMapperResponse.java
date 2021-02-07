package com.reto2.datacustomerv1.dto.mapper.response;

import com.reto2.datacustomerv1.dto.response.CustomerResponse;
import com.reto2.datacustomerv1.repository.entity.CustomerEntity;

public class CustomerMapperResponse {
    public CustomerResponse convertEntityToResponse(CustomerEntity customerEntity) {
        CustomerResponse customerResponse = null;

        if (customerEntity != null) {
            customerResponse = new CustomerResponse();

            customerResponse.setCic(customerEntity.getCustomerEntityKey().getCic());
            customerResponse.setDni(customerEntity.getDni());
            customerResponse.setFirstSurname(customerEntity.getFirstSurname());
            customerResponse.setSecondSurname(customerEntity.getSecondSurname());
            customerResponse.setGivenName(customerEntity.getGivenName());
        }

        return customerResponse;
    }
}
