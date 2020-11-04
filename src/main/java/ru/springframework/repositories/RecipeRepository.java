package ru.springframework.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.springframework.domain.Recipe;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String> {
    boolean existsById(Recipe recipe);
}
