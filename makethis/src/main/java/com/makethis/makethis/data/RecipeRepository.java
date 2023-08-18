package com.makethis.makethis.data;


import com.makethis.makethis.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
