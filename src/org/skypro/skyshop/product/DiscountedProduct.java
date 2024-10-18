package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private final int basePrise;
    private final int wholePercentDiscount;

    public DiscountedProduct(String nameProduct, int basePrise, int wholePercentDiscount) {
        super(nameProduct);
        this.basePrise = basePrise;
        this.wholePercentDiscount = wholePercentDiscount;
    }

    @Override
    public int getPrice() {
        return basePrise - (basePrise * wholePercentDiscount / 100);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getNameProduct() + ": " + basePrise + " (" + wholePercentDiscount + "%)";
    }
}
