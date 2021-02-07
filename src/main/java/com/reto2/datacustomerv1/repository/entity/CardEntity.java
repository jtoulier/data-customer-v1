package com.reto2.datacustomerv1.repository.entity;

import com.reto2.datacustomerv1.repository.entity.key.CardEntityKey;
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
@Table(schema = "customer", name = "card")
public class CardEntity {
    @EmbeddedId
    private CardEntityKey cardEntityKey;

    @Column(name = "internet_password")
    private String internetPassword;
}
