
package edu.infsci2560.controllers;

import edu.infsci2560.models.SeekHouse;
import edu.infsci2560.repositories.SeekRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Wenjia
 */
@Controller
public class SeekController {
    private static final Logger log = LoggerFactory.getLogger(SeekController.class);
    
    @Autowired
    private SeekRepository repository;
    
    @RequestMapping(value = "seeks", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("seek", "seeks", repository.findAll());
    }  //                      first plan is the html name your view
    
//    @RequestMapping(value = "recipes/{id}", method = RequestMethod.GET)
//    public ModelAndView get(@PathVariable Long id) {        
//        return new ModelAndView("recipe", "recipes", repository.findOne(id));
//    }
    
    @RequestMapping(value = "seeks", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid SeekHouse seek, BindingResult result) {
        repository.save(seek);
        return new ModelAndView("seek", "seeks", repository.findAll());
    }
    
    @RequestMapping(value = "seeks/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView update(@ModelAttribute @Valid SeekHouse seek, BindingResult result) {
        repository.save(seek);
        return new ModelAndView("seek", "seeks", repository.findAll());
    }
    
//    @RequestMapping(value = "recipes", method = RequestMethod.DELETE)
    @RequestMapping(value = "seeks/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
        log.info("*** delete id = " + id);
        SeekHouse seek = repository.findOne(id);
        
        if ( seek != null ) {
            log.info("*** seek is not null");
            repository.delete(seek);
        }

        return new ModelAndView("seek", "seeks", repository.findOne(id));
    }
    
    
}