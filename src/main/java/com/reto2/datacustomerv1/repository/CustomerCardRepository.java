package com.reto2.datacustomerv1.repository;

import com.reto2.datacustomerv1.repository.entity.CustomerCardEntity;
import com.reto2.datacustomerv1.repository.entity.key.CustomerCardEntityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCardRepository extends JpaRepository<CustomerCardEntity, CustomerCardEntityKey> {
}
