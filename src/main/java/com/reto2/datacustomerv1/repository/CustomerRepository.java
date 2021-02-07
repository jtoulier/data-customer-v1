package com.reto2.datacustomerv1.repository;

import com.reto2.datacustomerv1.repository.entity.CustomerEntity;
import com.reto2.datacustomerv1.repository.entity.key.CustomerEntityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, CustomerEntityKey> {
}
