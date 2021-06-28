package model;

import java.util.Arrays;
import java.util.Date;

public class Cage {

    @Override
    public String toString() {
        return "Cage{" +
                "type=" + type +
                '}';
    }

    public Cage (String type, int location, int capacity) {
        this.type = type;
        this.location = location;
        this.capacity = capacity;
    }
    private String type;
    private int location;
    private int foodAmount;

    private Date lastFeed;
    private Date nextFeed;
    private Animal[] animals;
    private int capacity = 1;


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public Date getLastFeed() {
        return lastFeed;
    }

    public void setLastFeed(Date lastFeed) {
        this.lastFeed = lastFeed;
    }

    public Date getNextFeed() {
        return nextFeed;
    }

    public void setNextFeed(Date nextFeed) {
        this.nextFeed = nextFeed;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }


}
