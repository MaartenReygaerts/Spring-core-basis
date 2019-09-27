package be.intecbrussel.spring.springiscoming.services.domestic;

import be.intecbrussel.spring.springiscoming.services.cleanin.CleaningService;
import be.intecbrussel.spring.springiscoming.services.garden.GardeningService;

public class DomesticServiceImpl implements DomesticService {

private GardeningService gardeningService;
private CleaningService cleaningService;



    @Override
    public void runHouseHold() {
        System.out.println("Let's domesticate!");
        gardeningService.garden();
        cleaningService.clean();


    }

    public void setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;

    }

    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;

    }
    //Een mogelijkheid om wanneer bij initialisatie, extra kenmerken mee te geven
    public void init(){
        System.out.println("Domesticating being prepared");
    }
    //Opruimen van de bean bij oproeping van deze methode
    public void destroy(){
        System.out.println("She ran!");
    }
}
