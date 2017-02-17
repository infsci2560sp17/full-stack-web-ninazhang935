
package edu.infsci2560.repositories;


import edu.infsci2560.models.Makeplan;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Wenjia
 */
public interface PlanRepository extends PagingAndSortingRepository<Makeplan, Long> {}