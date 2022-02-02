package com.techinterview.onlinestore.domain;

import java.util.StringJoiner;

/**
 * Base class for all products that can be soled in online store.
 * SEE TASK DESCRIPTION IN ProductListProcessor CLASS!
 */
public abstract class Product {

    /**
     * GUID that uniquely identifies a product,
     */
    private final String guid;

    /**
     * Meaningful product name.
     */
    private final String name;

    public Product(String guid, String name) {
        this.guid = guid;
        this.name = name;
    }

    public String getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }

    /**
     * Method to return the class type name.
     * @return String that holds the simple name of the underlying class Product.
     */
    public String classType(){
        return Product.class.getSimpleName();
    }

    /**
     * Overriden method to return the product name and it's GUID seperated by delimiter ",".
     * @return product name and values seperated by ","
     */
    @Override
    public String toString(){
        return new StringJoiner(",",
            name + "(" , ")"
        ).add(guid).toString();
    }
}
