package com.company.rocket;

public class U1 extends Rocket {

    public U1(int cost,int weight, int maxWeight) {

        this.rocketCost=cost;
        this.maxRocketWeight=maxWeight;
        this.rocketWeight=weight;
    }

    @Override
    public boolean launch() {
        return (Math.random()*100) > (5* (Double.valueOf(rocketWeight)/Double.valueOf(maxRocketWeight)));
    }

    @Override
    public boolean land() {
        return (Math.random()*100) > (1* (Double.valueOf(rocketWeight)/Double.valueOf(maxRocketWeight)));
    }
}
