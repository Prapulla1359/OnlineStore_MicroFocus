package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.Product;

import java.util.List;
/**
 * Interface class "converter" that has the method named "convert" which returns generic type.
 *
 */
public interface Converter<T> {

    T convert(List<Product> productList);
}
