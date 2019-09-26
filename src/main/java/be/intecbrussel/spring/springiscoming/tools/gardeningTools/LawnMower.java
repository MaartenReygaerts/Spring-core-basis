package be.intecbrussel.spring.springiscoming.tools.gardeningTools;

import be.intecbrussel.spring.springiscoming.tools.GardeningTool;

public class LawnMower implements GardeningTool {
    public LawnMower() {
        System.out.println("LawnMower created");
    }

    @Override
    public void doGardenJob() {
        System.out.println("mow mow mow pruh pruh mow");
    }
}
