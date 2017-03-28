package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/plans").setViewName("plan");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/recipes").setViewName("recipe");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/uploadForm").setViewName("uploadForm");
        registry.addViewController("/seek").setViewName("seek");
        //registry.addViewController("/seeks").setViewName("editSeek");
    }

}