package com.reto2.datacustomerv1.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCardResponse {
    private String cardNumber;
    private String cic;
}
