package com.company;

import com.company.rocket.Rocket;
import com.company.rocket.U1;
import com.company.rocket.U2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public ArrayList<Item> loadItems(String fileName){
        ArrayList<Item> itemList=new ArrayList<>();
        File file=new File(fileName);
        try {
            Scanner scaner=new Scanner(file);
            while (scaner.hasNextLine()){
                String readLine = scaner.nextLine();
                String[] itemData= readLine.split("=");
                Item item=new Item(Integer.valueOf(itemData[1] ), itemData[0]);
                itemList.add(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return itemList;


    }
    public ArrayList<Rocket> loadU1(ArrayList<Item> items){
        ArrayList<Rocket> rocketList=new ArrayList<>();
        U1 rocket= new U1(100,10000,18000);
        for(Item item:items){
            if(rocket.canCarry(item)){
                rocket.carry(item);
            }
            else{
                rocketList.add(rocket);
                rocket=new U1(100,10000,18000);
                rocket.carry(item);
            }
        }

        return rocketList;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items){
        ArrayList<Rocket> rocketList=new ArrayList<>();
        U2 rocket= new U2(120,18000,29000);
        for(Item item:items){
            if(rocket.canCarry(item)){
                rocket.carry(item);
            }
            else{
                rocketList.add(rocket);
                rocket=new U2(120,18000,29000);
                rocket.carry(item);
            }
        }

        return rocketList;

    }
    public int runSimulation(ArrayList<Rocket>rocketList){
        int budget=0;
        for(Rocket rocket:rocketList){
            do{
                //System.out.println("jestem"+ budget);
                budget+=rocket.rocketCost;

            } while(!(rocket.land() && rocket.launch()));

        }
        return budget;
    }
}
