package org.skypro.skyshop.product;

public class SimpleProduct extends Product {

    private final int simplePrice;

    public SimpleProduct(String nameProduct, int simplePrice) {
        super(nameProduct);
        this.simplePrice = simplePrice;
    }

    @Override
    public int getPrice() {
        return simplePrice;
    }

    @Override
    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return getNameProduct() + ": " + simplePrice;
    }
}
