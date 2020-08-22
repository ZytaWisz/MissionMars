package com.company.rocket;

import com.company.Item;

public class Rocket implements SpaceShip {

    int rocketWeight;
    int maxRocketWeight;
    public int rocketCost;


    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public final boolean canCarry(Item item) {
        if (item.weight+rocketWeight<=maxRocketWeight){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public final void carry(Item item) {
        rocketWeight+=item.weight;

    }
}
