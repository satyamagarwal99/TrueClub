package com.example.TrueClub.repository;

import com.example.TrueClub.entity.TrueClubb;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface TrueClubRepository extends MongoRepository<TrueClubb,String> {
    List<TrueClubb> findAll();
    Optional<TrueClubb> findById(String id);
}
