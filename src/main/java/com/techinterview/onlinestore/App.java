package com.techinterview.onlinestore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.techinterview.onlinestore.domain.BackPack;
import com.techinterview.onlinestore.domain.Product;
import com.techinterview.onlinestore.domain.SmartPhone;
import com.techinterview.onlinestore.service.ConvertToJson;
import com.techinterview.onlinestore.service.ConvertToString;
import com.techinterview.onlinestore.service.Converter;
import com.techinterview.onlinestore.service.ProductListProcessor;

import java.util.ArrayList;
import java.util.List;

public class App {

    /**
     * Main method to create the object of products and add it to the product List.
     * Instantiates the interface implementation "ConvertToString"
     * Set Converter object to productListProcessor(here it invokes ConvertToString Interface Implementation).
     * Invoking the method productListToString by passing productList as parameter that returns convertedString.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {

        /**
         * BackPack Object
         */
        BackPack product = new BackPack("111-222-333", "Cool Backpack");
        product.setCapacity(20);
        product.setColor("Black");
        product.setMaxContentWeight(15);

        /**
         * Smartphone Object
         */
        SmartPhone smartPhone = new SmartPhone("222-333-555", "Motorola");
        smartPhone.setColor("grey");
        smartPhone.setManufacturer("Motorola");
        smartPhone.setNumberOfCPUs(1);
        smartPhone.setRamSize(64);
        smartPhone.setScreenResolution("large");

        /**
         * List of Products : Product, smartPhone
         */
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(smartPhone);

        /**
         * Instantiates the interface implementation "ConvertToString"
         * In future, we can extend the functionality to convertToJSON or convertToXML
         *
         */
        Converter converter = new ConvertToString();

        ProductListProcessor productListProcessor = new ProductListProcessor();

        /**
         * Set Converter object(here it invokes ConvertToString Interface Implementation).
         * Invoking the method productListToString by passing productList as parameter that returns convertedString.
         */
        productListProcessor.setConverter(converter);
        String convertedString = productListProcessor.productListToString(productList);
        System.out.println(convertedString);

    }

}
