package com.makethis.makethis.data;

import com.makethis.makethis.models.RecipeCategory;
import org.springframework.data.repository.CrudRepository;

public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, Integer> {
}
