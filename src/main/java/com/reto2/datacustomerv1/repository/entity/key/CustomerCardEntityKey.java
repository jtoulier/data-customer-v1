package com.reto2.datacustomerv1.repository.entity.key;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CustomerCardEntityKey implements Serializable {
    @Column(name = "card_number")
    private String cardNumber;
}
