package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.implementations.Broom;
import be.intecbrussel.spring.springiscoming.tools.implementations.DisposableDuster;
import be.intecbrussel.spring.springiscoming.tools.implementations.Vacuum;
import org.springframework.context.annotation.*;

@Configuration
public class HouseContextConfig {

    @Bean(name = "bezem")
    @Scope("prototype")
    @Primary
    public CleaningTool broom(){
        return new Broom();
    }

    @Bean(name = "stofzuiger")
    @Scope("prototype")
    public CleaningTool vacuum(){
        return new Vacuum();
    }
    @Bean(name = "duster")
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool disposableDuster(){
        return new DisposableDuster();
    }


    //services
    @Bean(name = "disposableDusterService")
    @Description("this is the cleaning service named disposableDusterService")
    public CleaningService disposableDusterService(){
        CleaningService cleaningService = new CleaningService();
        cleaningService.setCleaningTool(disposableDuster());
        return cleaningService;
    }

    @Bean
    @Description("This is the cleaning service named vacuumService")
    public CleaningService vacuumService(){
        CleaningService cleaningService = new CleaningService();
        cleaningService.setCleaningTool(vacuum());
        return cleaningService;
    }
    @Bean
    @Description("this is the cleaning service named broomService")
    public CleaningService broomService(CleaningTool cleaningTool){
        CleaningService cleaningService = new CleaningService();
        cleaningService.setCleaningTool(broom());
        return cleaningService;
    }
}
