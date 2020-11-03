package ru.springframework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findByDescription(String description);
}
