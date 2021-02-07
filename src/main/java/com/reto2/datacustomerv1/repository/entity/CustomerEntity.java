package com.reto2.datacustomerv1.repository.entity;

import com.reto2.datacustomerv1.repository.entity.key.CustomerEntityKey;
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
@Table(schema = "customer", name = "customer")
public class CustomerEntity {
    @EmbeddedId
    private CustomerEntityKey customerEntityKey;

    @Column(name = "dni")
    private String dni;

    @Column(name = "first_surname")
    private String firstSurname;

    @Column(name = "second_surname")
    private String secondSurname;

    @Column(name = "given_name")
    private String givenName;

}
