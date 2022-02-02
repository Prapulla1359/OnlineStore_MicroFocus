package com.techinterview.onlinestore.domain;

/**
 * Definition of SmartPhone product.
 * SEE TASK DESCRIPTION IN ProductListProcessor CLASS!
 */
public class SmartPhone extends Product {

    /**
     * Name of smartphone manufacturer.
     */
    private String manufacturer;

    /**
     * Color of the smartphone.
     */
    private String color;

    /**
     * Number of CPUs installed in smartphone.
     */
    private int numberOfCPUs;

    /**
     * Amount of RAM installed in smartphone.
     */
    private double ramSize;

    /**
     * Smartphone's screen resolution.
     */
    private String screenResolution;

    public SmartPhone(String guid, String name) {
        super(guid, name);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfCPUs() {
        return numberOfCPUs;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        this.numberOfCPUs = numberOfCPUs;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    /**
     * Method to return the class type name.
     * @return String that holds the simple name of the underlying class SmartPhone.
     */
    public String classType(){
        return SmartPhone.class.getSimpleName();
    }

    /**
     * Overriden method to return the smartphone object values.
     * @return product object values seperated by ","
     */
    @Override
    public String toString(){
        return "manufacturer:" + this.manufacturer + "," + "color:" + this.color
                + "," + "numberOfCPUs:" + this.numberOfCPUs + "," + "ramSize:" + this.ramSize
                + "," + "screenResolution:" + this.screenResolution;
    }
}
