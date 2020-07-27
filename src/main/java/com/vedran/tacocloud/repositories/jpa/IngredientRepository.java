package com.vedran.tacocloud.repositories.jpa;

import com.vedran.tacocloud.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

    Optional<Ingredient> findById(String id);
}
