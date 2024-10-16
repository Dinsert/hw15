package org.skypro.skyshop.product;

public class Product {

    private final String nameProduct;
    private final int costProduct;

    public Product(String nameProduct, int costProduct) {
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getCostProduct() {
        return costProduct;
    }

}
