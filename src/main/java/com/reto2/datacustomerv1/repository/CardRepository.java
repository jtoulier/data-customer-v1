package com.reto2.datacustomerv1.repository;

import com.reto2.datacustomerv1.repository.entity.CardEntity;
import com.reto2.datacustomerv1.repository.entity.key.CardEntityKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, CardEntityKey> {
}
