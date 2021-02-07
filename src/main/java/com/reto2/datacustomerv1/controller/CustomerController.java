package com.reto2.datacustomerv1.controller;

import com.reto2.datacustomerv1.dto.response.CustomerResponse;
import com.reto2.datacustomerv1.repository.CustomerRepository;
import com.reto2.datacustomerv1.repository.entity.CustomerEntity;
import com.reto2.datacustomerv1.repository.entity.key.CustomerEntityKey;
import com.reto2.datacustomerv1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-customer-v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/{cic}")
    public ResponseEntity<CustomerResponse> findByCic(
        @PathVariable("cic") String cic
    ) {
        return new ResponseEntity(customerService.findByCic(cic), HttpStatus.OK);
    }
}
