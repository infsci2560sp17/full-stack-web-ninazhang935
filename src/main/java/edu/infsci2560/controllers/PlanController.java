
package edu.infsci2560.controllers;

import edu.infsci2560.models.Makeplan;
import edu.infsci2560.repositories.PlanRepository;
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
/**
 *
 * @author Wenjia
 */
@Controller
public class PlanController {
    @Autowired
    private PlanRepository repository;
    
    @RequestMapping(value = "plans", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("plan", "plans", repository.findAll());
    }  //                      first plan is the html name your view
    
    
    @RequestMapping(value = "plans", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Makeplan plan, BindingResult result) {
        repository.save(plan);
        return new ModelAndView("plan", "plans", repository.findAll());
    }
    @RequestMapping(value = "plans/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
        //log.info("*** delete id = " + id);
        Makeplan plan = repository.findOne(id);
        
        if ( plan != null ) {
            //log.info("*** recipe is not null");
            repository.delete(id);
        }

        return new ModelAndView("plan", "plans", repository.findAll());
    }
    
}