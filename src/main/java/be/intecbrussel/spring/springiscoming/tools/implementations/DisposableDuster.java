package be.intecbrussel.spring.springiscoming.tools.implementations;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class DisposableDuster implements CleaningTool {
    private boolean used = true;

    public DisposableDuster() {
        System.out.println("created Disposable Duster");
    }

    @Override
    public void doCleanJob() {
        if(used){
            System.out.println("swifferdeswiff");
            used = false;
        }
        else{
            System.out.println("I'm a dirty dirty duster");

        }
    }
}
