package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.cleanin.CleaningService;
import be.intecbrussel.spring.springiscoming.services.cleanin.CleaningServiceImpl;
import be.intecbrussel.spring.springiscoming.services.domestic.DomesticService;
import be.intecbrussel.spring.springiscoming.services.domestic.DomesticServiceImpl;
import be.intecbrussel.spring.springiscoming.services.garden.GardeningService;
import be.intecbrussel.spring.springiscoming.services.garden.GardeningServiceImplementation;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.GardeningTool;
import be.intecbrussel.spring.springiscoming.tools.gardeningTools.LawnMower;
import be.intecbrussel.spring.springiscoming.tools.implementations.Broom;
import be.intecbrussel.spring.springiscoming.tools.implementations.DisposableDuster;
import be.intecbrussel.spring.springiscoming.tools.implementations.Vacuum;
import org.springframework.context.annotation.*;

@Configuration
public class DomesticConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public DomesticService domesticService(GardeningTool gardeningTool, CleaningTool cleaningTool){
        DomesticServiceImpl domesticService = new DomesticServiceImpl();
        domesticService.setCleaningService(cleaningService(cleaningTool));
        domesticService.setGardeningService(gardeningService(gardeningTool));
        return domesticService;
    }

    //GardenConfig
    @Bean
    public GardeningTool lawnMower(){
        return new LawnMower();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public GardeningService gardeningService(GardeningTool gardeningTool){
        GardeningServiceImplementation gardeningService = new GardeningServiceImplementation();
        gardeningService.setGardeningTool(gardeningTool);
        return gardeningService;
    }

    //HouseConfig

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public CleaningService cleaningService(CleaningTool cleaningTool){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(cleaningTool);
        return cleaningService;
    }

    @Bean(name = "bezem")
    @Scope("prototype")
    @Lazy
    //@primary zorgt dat wanneer het programma meerdere keuzes heeft van het zelfde type
    // 'hier een cleaningtool' hij de Broom als eerste keuze maakt
    @Primary
    public CleaningTool broom(){
        return new Broom();
    }

    @Bean(name = "stofzuiger")
    @Scope("prototype")
    @Lazy
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
    public CleaningServiceImpl disposableDusterService(CleaningTool cleaningTool){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(cleaningTool);
        return cleaningService;
    }

    @Bean
    @Description("This is the cleaning service named vacuumService")
    public CleaningServiceImpl vacuumService(CleaningTool cleaningTool){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(cleaningTool);
        return cleaningService;
    }
    @Bean
    @Description("this is the cleaning service named broomService")
    public CleaningServiceImpl broomService(CleaningTool cleaningTool){
        CleaningServiceImpl cleaningService = new CleaningServiceImpl();
        cleaningService.setCleaningTool(cleaningTool);
        return cleaningService;
    }

}
