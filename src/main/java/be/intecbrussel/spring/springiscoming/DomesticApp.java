package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.domestic.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DomesticApp {
    public static void main(String[] args) {

        try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(DomesticConfig.class))  {
            System.out.println("Container initialized");
            DomesticService domesticService = applicationContext.getBean("domesticService",DomesticService.class);
            domesticService.runHouseHold();
        }
    }
}
