package be.intecbrussel.spring.springiscoming.tools.implementations;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class Broom implements CleaningTool {
    public Broom() {
        System.out.println("Create Broom");
    }

    @Override
    public void doCleanJob() {
        System.out.println("Woosh woosh wooosh wooosh swhooo ... broom is cleaning");
    }
}
