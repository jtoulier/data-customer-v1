package com.reto2.datacustomerv1.repository.entity;

import com.reto2.datacustomerv1.repository.entity.key.CustomerCardEntityKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "customer", name = "customer_card")
public class CustomerCardEntity {
    @EmbeddedId
    private CustomerCardEntityKey customerCardEntityKey;

    @Column(name = "cic")
    private String cic;
}
