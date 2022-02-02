package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.Product;

import java.util.List;

/**
 * ConvertToJson class implements the Interface Converter.
 *
 */
public class ConvertToJson implements Converter<Object>{

    /**
     * This method provides the implementation of convert method to convert the product to JSON.
     * @param productList
     * @return JsonObject
     */
    @Override
    public Object convert(List<Product> productList) {
        return null;
    }
}
