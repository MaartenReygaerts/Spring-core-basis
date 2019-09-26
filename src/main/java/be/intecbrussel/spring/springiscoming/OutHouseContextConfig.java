package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.GardeningService;
import be.intecbrussel.spring.springiscoming.services.GardeningServiceImplementation;
import be.intecbrussel.spring.springiscoming.tools.GardeningTool;
import be.intecbrussel.spring.springiscoming.tools.gardeningTools.LawnMower;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutHouseContextConfig {

    @Bean
    public GardeningTool lawnMower(){
        return new LawnMower();
    }

    @Bean
    public GardeningService gardeningService(GardeningTool gardeningTool){
        GardeningServiceImplementation gardeningService = new GardeningServiceImplementation();
        gardeningService.setGardeningTool(gardeningTool);
        return gardeningService;
    }
}
