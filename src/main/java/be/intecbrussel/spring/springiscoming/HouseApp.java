package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String[] args) {

       /* CleaningService cleaningService = new CleaningService(new Vacuum());

        cleaningService.clean();*/

       //configurableApplicationContext configureerd alle beans
        try(ConfigurableApplicationContext applicationContext =
                    new AnnotationConfigApplicationContext(HouseContextConfig.class);)
        {
            CleaningService cleaningService = applicationContext.getBean("disposableDusterService",CleaningService.class);
            cleaningService.clean();
            cleaningService.clean();

        }



    }
}
