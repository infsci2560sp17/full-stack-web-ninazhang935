
package edu.infsci2560.repositories;


import edu.infsci2560.models.MakeRecipe;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Wenjia
 */
public interface RecipeRepository extends PagingAndSortingRepository<MakeRecipe, Long> {}