package com.techinterview.onlinestore.service;

import com.techinterview.onlinestore.domain.Product;
import java.util.List;
import java.util.StringJoiner;
/**
 * ConvertToString class implements the Interface Converter.
 * Provides implementation for the convert method to convert the provided list of products to text representation
 * of this list in the format of
 * Product name (product GUID), product attribute 1 name:product attribute1 value; ... product attribute-n name:product attribute-n value
 */
public class ConvertToString implements Converter<String>{

    /**
     * Constants to represent PRODUCT_NAME, PRODUCT_GUID, PRODUCT_ATTRIBUTE, Delimiter and String Separator.
     */
    private final String PRODUCT_NAME_TOKEN = "<PRODUCT_NAME> ";
    private final String PRODUCT_GUID_TOKEN = "(<PRODUCT_GUID>)";
    private final String PRODUCT_ATTRIBUTE_TOKEN = "<PRODUCT_ATTRIBUTE>";
    private final String DELIMITER = ",";
    private final String STRING_SEPARATOR = "\n";

    /**
     * This method provides the implementation of convert method to convert the product to String.
     *
     * Iterating through each product and converting the product to text representation.
     *
     * @param productList
     * @return JsonObject
     */
    @Override
    public String convert(List<Product> productList) {
        StringBuffer output = new StringBuffer();
        productList.stream().forEach(
                product -> {
                    if(output.length() > 0)
                        output.append(STRING_SEPARATOR);
                    StringJoiner productDescription = createProductDescription(product);
                    output.append(productDescription.toString());
                });
        return output.toString();
    }

    /**
     * Method to create product description that joins the string in the format of
     * Product name (product GUID), product attribute 1 name:product attribute1 value; ... product attribute-n name:product attribute-n value
     *
     * @param product of Object Type Product
     * @return joiner of type StringJoiner that constructs the sequence if characters separated by Delimiter.
     */
    private StringJoiner createProductDescription(Product product){
        StringJoiner joiner = new StringJoiner(DELIMITER);
        joiner.add(PRODUCT_NAME_TOKEN.replace("<PRODUCT_NAME>", product.getName()) +
                PRODUCT_GUID_TOKEN.replace("<PRODUCT_GUID>", product.getGuid()));
        joiner.add(PRODUCT_ATTRIBUTE_TOKEN.replace("<PRODUCT_ATTRIBUTE>", product.toString()));
        return joiner;
    }
}
