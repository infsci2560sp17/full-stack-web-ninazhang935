
package edu.infsci2560.repositories;


import edu.infsci2560.models.SeekHouse;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Wenjia
 */
public interface SeekRepository extends PagingAndSortingRepository<SeekHouse, Long> {}