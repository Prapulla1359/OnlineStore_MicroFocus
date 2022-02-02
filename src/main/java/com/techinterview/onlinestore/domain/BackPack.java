package com.techinterview.onlinestore.domain;

/**
 * Backpack product definition.
 * SEE TASK DESCRIPTION IN ProductListProcessor CLASS!
 */
public class BackPack extends Product {

    /**
     * Maximum weight of content that can be placed inside a backpack.
     */
    private double maxContentWeight;

    /**
     * Backpack color.
     */
    private String color;

    /**
     * Capacity (in liters) of all parts of back pack.
     */
    private double capacity;

    public BackPack(String guid, String name) {
        super(guid, name);
    }

    public double getMaxContentWeight() {
        return maxContentWeight;
    }

    public void setMaxContentWeight(double maxContentWeight) {
        this.maxContentWeight = maxContentWeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * Method to return the class type name.
     * @return String that holds the simple name of the underlying class BackPack.
     */
    public String classType(){
        return BackPack.class.getSimpleName();
    }

    /**
     * Overriden method to return the backpack object values.
     * @return backpack object values seperated by ","
     */
    @Override
    public String toString(){
        return "maxContentWeight:" + this.maxContentWeight + "," + "color:" + this.color
                + "," + "capacity:" + this.capacity;
    }
}
