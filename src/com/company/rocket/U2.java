package com.company.rocket;

public class U2 extends Rocket {
    public U2(int cost,int weight, int maxWeight) {

        this.rocketCost=cost;
        this.maxRocketWeight=maxWeight;
        this.rocketWeight=weight;
    }
    @Override
    public boolean launch() {
        return (Math.random()*100) > (4* (Double.valueOf(rocketWeight)/Double.valueOf(maxRocketWeight)));
    }

    @Override
    public boolean land() {
        return (Math.random()*100) > (8* (Double.valueOf(rocketWeight)/Double.valueOf(maxRocketWeight)));
    }


}
