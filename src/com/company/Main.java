package com.company;

import com.company.rocket.Rocket;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Simulation simulation=new Simulation();
        ArrayList<Item> phase1ItemList = simulation.loadItems("phase-1.txt");
        ArrayList<Item> phase2ItemList = simulation.loadItems("phase-2.txt");
        System.out.println(phase1ItemList.size()+ " : "+ phase2ItemList.size());

        ArrayList<Rocket> rocketListU1Phase1=simulation.loadU1(phase1ItemList);
        ArrayList<Rocket> rocketListU1Phase2=simulation.loadU1(phase2ItemList);

        rocketListU1Phase1.addAll(rocketListU1Phase2);

        int budgetU1=simulation.runSimulation(rocketListU1Phase1);
        System.out.println("Budget for U1 " +budgetU1);



        ArrayList<Rocket> rocketListU2Phase1=simulation.loadU2(phase1ItemList);
        ArrayList<Rocket> rocketListU2Phase2=simulation.loadU2(phase2ItemList);

        rocketListU2Phase1.addAll(rocketListU2Phase2);

        int budgetU2=simulation.runSimulation(rocketListU2Phase1);
        System.out.println("Budget for U2 " +budgetU2);

    }
}
