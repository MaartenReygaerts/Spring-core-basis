package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.GardeningService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OutHouseApp {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(OutHouseContextConfig.class)){

            applicationContext.getBean("gardeningService", GardeningService.class).garden();

        }
    }
}
