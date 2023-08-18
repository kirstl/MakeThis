package com.makethis.makethis.data;

import com.makethis.makethis.models.RecipeDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeDetailsRepository extends CrudRepository<RecipeDetails, Integer> {


}
