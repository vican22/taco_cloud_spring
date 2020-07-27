package com.vedran.tacocloud.controller;

import com.vedran.tacocloud.domain.Ingredient;
import com.vedran.tacocloud.repositories.jpa.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepository;

    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(id);

        if (!ingredient.isPresent()) {
            return null;
        }

        return ingredient.get();
    }
}
