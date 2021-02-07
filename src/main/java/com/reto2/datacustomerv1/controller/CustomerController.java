package com.reto2.datacustomerv1.controller;

import com.reto2.datacustomerv1.repository.CustomerRepository;
import com.reto2.datacustomerv1.repository.entity.CustomerEntity;
import com.reto2.datacustomerv1.repository.entity.key.CustomerEntityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-customer-v1")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer/{cic}")
    public CustomerEntity findByCic(
        @PathVariable("cic") String cic
    ) {
        CustomerEntityKey customerEntityKey = new CustomerEntityKey();
        customerEntityKey.setCic(cic);

        return customerRepository.findById(customerEntityKey).get();
    }
}
