package edu.infsci2560;

import edu.infsci2560.models.Makeplan;
import edu.infsci2560.models.MakeRecipe;
import edu.infsci2560.models.SeekHouse;
import edu.infsci2560.models.Makeplan.Demand;
import edu.infsci2560.models.MakeRecipe.Type;
import edu.infsci2560.models.MakeRecipe.Park;
import edu.infsci2560.repositories.PlanRepository;
import edu.infsci2560.repositories.RecipeRepository;
import edu.infsci2560.repositories.SeekRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        PlanRepository repository = ctx.getBean(PlanRepository.class);
        repository.save(new Makeplan(1L, "Amberson Apartment","Jone", Demand.request, "wes9@pitt.edu", 
        "I wan to find a female roommate. If you require a roommate in Amberson Apartment, please contact me."));
        repository.save(new Makeplan(2L, "Chalfont Apartment", "Lisa", Demand.require, "winbglnn@gmail.com", 
        "I have two room available, one is a bedroom with bathroom and closet, and the other is living room, the fee of living room is cheaper."));
        repository.save(new Makeplan(3L, "Unknown","Smith", Demand.unknown, "876468223@qq.com", 
        "I want to find a bedroom, I live in a house in squirral hill, if you want to live with me, please contact me. And if you need a roommate in other apartment, please let me know "));
        
        RecipeRepository recipeRepo = ctx.getBean(RecipeRepository.class);
        recipeRepo.save(new MakeRecipe(1L, "Parlane", Type.three, 1500, "71A, 71B", Park.garage, "This apartment is great, the room is big and the fee is low, the only shortcoming is it's far from school."));
        recipeRepo.save(new MakeRecipe(2L, "Chalfont", Type.four, 2100, "71A, 71C, 82, 54", Park.garage, "The apartment has gym and self laundry, and the transportation is convenient and it's near school. "));
        recipeRepo.save(new MakeRecipe(3L, "Pennsylvania", Type.three, 1360, "71A, 71C, 82, 54, P3", Park.garage, "include on-site laundry"));
   
        
   }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}