package be.intecbrussel.spring.springiscoming.services.cleanin;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class CleaningServiceImpl implements CleaningService{
private CleaningTool cleaningTool;

    @Override
    public void clean() {
        System.out.println("Let's get cleaning!");
        cleaningTool.doCleanJob();

    }

    public CleaningServiceImpl setCleaningTool(CleaningTool tool){
            this.cleaningTool = tool;
            return this;
    }

    //Een mogelijkheid om wanneer bij initialisatie, extra kenmerken mee te geven
    public void init(){
        System.out.println("CleaningService preparing for work.");
    }
    //Opruimen van de bean bij oproeping van deze methode
    public void destroy(){
        System.out.println("CleaningService cleaning up.");
    }


}
