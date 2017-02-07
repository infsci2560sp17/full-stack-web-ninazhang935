package edu.infsci2560;

import edu.infsci2560.models.Dvd;
import edu.infsci2560.models.Dvd.WorkoutType;
import edu.infsci2560.repositories.DvdRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author kolobj
 */
@RestController
@RequestMapping("/public/api/dvds")
public class DvdsService {

    @Autowired
    private DvdRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<Dvd>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Dvd> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<Dvd> create(@RequestBody Dvd dvd) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(dvd), headers, HttpStatus.OK);
    }
}