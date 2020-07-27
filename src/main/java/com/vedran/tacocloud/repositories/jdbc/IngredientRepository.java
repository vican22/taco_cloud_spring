package com.vedran.tacocloud.repositories.jdbc;

import com.vedran.tacocloud.domain.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
