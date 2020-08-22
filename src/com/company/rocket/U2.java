package com.company.rocket;

public class U2 extends Rocket {
    public U2(int cost,int weight, int maxWeight) {

        this.rocketCost=cost;
        this.maxRocketWeight=maxWeight;
        this.rocketWeight=weight;
    }
    @Override
    public boolean launch() {
        // 5% * (rocketWeight/ rocketMaxWeight)
        return (Math.random()*100) > (0.04* (rocketWeight/maxRocketWeight));
    }

    @Override
    public boolean land() {
        return (Math.random()*100) > (0.08* (rocketWeight/maxRocketWeight));
    }


}
