package ru.springframework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.springframework.domain.UnitOfMeasure;

import java.util.Optional;


public interface UnitOfMeasureRepository extends MongoRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
