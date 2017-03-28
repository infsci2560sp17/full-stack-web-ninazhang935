
package edu.infsci2560.controllers;

import edu.infsci2560.models.MakeRecipe;
import edu.infsci2560.repositories.RecipeRepository;
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
public class RecipeController {
    private static final Logger log = LoggerFactory.getLogger(RecipeController.class);
    
    @Autowired
    private RecipeRepository repository;
    
    @RequestMapping(value = "recipes", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("recipe", "recipes", repository.findAll());
    }  //                      first plan is the html name your view
    
//    @RequestMapping(value = "recipes/{id}", method = RequestMethod.GET)
//    public ModelAndView get(@PathVariable Long id) {        
//        return new ModelAndView("recipe", "recipes", repository.findOne(id));
//    }
    
    @RequestMapping(value = "recipes", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid MakeRecipe recipe, BindingResult result) {
        repository.save(recipe);
        return new ModelAndView("recipe", "recipes", repository.findAll());
    }
    
    @RequestMapping(value = "recipes/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView update(@ModelAttribute @Valid MakeRecipe recipe, BindingResult result) {
        repository.save(recipe);
        return new ModelAndView("recipe", "recipes", repository.findAll());
    }
    
//    @RequestMapping(value = "recipes", method = RequestMethod.DELETE)
    @RequestMapping(value = "recipes/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(value="id", required=true) Long id) {
        //log.info("*** delete id = " + id);
        MakeRecipe recipe = repository.findOne(id);
        
        if ( recipe != null ) {
            //log.info("*** recipe is not null");
            repository.delete(id);
        }

        return new ModelAndView("recipe", "recipes", repository.findAll());
    }
    
    
}