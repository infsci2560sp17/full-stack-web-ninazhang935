package edu.infsci2560.repositories;

import edu.infsci2560.models.Dvd;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Wenjia Zhang
 */
public interface DvdRepository extends PagingAndSortingRepository<Dvd, Long> {}
