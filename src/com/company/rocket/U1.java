package com.company.rocket;

public class U1 extends Rocket {

    public U1(int cost,int weight, int maxWeight) {

        this.rocketCost=cost;
        this.maxRocketWeight=maxWeight;
        this.rocketWeight=weight;
    }

    @Override
    public boolean launch() {
        // 5% * (rocketWeight/ rocketMaxWeight)
        boolean returned = (Math.random()*100) > (0.05* (rocketWeight/maxRocketWeight));
        return returned;
    }

    @Override
    public boolean land() {
        boolean returned= (Math.random()*100) > (0.01* (rocketWeight/maxRocketWeight));
        return returned;
    }
}
