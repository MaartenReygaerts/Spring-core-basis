package be.intecbrussel.spring.springiscoming.services;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.implementations.Broom;

public class CleaningService {

    private CleaningTool cleaningTool;

    public CleaningService() {
    }

    public CleaningService(CleaningTool cleaningTool){
        this.cleaningTool = cleaningTool;
    }

    public CleaningTool getCleaningTool() {
        return cleaningTool;
    }

    public CleaningService setCleaningTool(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
        return this;
    }

    public void clean(){
        System.out.println("cleaningService will now start cleaning... please hold");
        cleaningTool.doCleanJob();
    }
}
