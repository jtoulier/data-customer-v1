package com.reto2.datacustomerv1.service;

import com.reto2.datacustomerv1.dto.response.CustomerResponse;

public interface CustomerService {
    CustomerResponse findByCic(String cic);
}
