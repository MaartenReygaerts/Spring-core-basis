package be.intecbrussel.spring.springiscoming.services;

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
}


