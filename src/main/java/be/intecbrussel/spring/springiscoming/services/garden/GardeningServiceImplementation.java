package be.intecbrussel.spring.springiscoming.services.garden;

import be.intecbrussel.spring.springiscoming.tools.GardeningTool;

public class GardeningServiceImplementation implements GardeningService {
    private GardeningTool gardeningTool;



    @Override
    public void garden() {
        System.out.println("Lets get green");
        gardeningTool.doGardenJob();
    }

    public GardeningServiceImplementation setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
        return this;
    }
    //Een mogelijkheid om wanneer bij initialisatie, extra kenmerken mee te geven
    public void init(){
        System.out.println("GardeningService preparing for work.");
    }
    //Opruimen van de bean bij oproeping van deze methode
    public void destroy(){
        System.out.println("GardeningService cleaning up.");
    }
}


