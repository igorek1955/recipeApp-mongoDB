package ru.springframework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.springframework.domain.Recipe;


public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
