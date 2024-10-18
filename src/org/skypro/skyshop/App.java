package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {

    public static void main(String[] args) {
        SimpleProduct product1 = new SimpleProduct("Course Java", 200_000);
        DiscountedProduct product2 = new DiscountedProduct("Course C++", 250_000, 50);
        SimpleProduct product3 = new SimpleProduct("Course Python", 100_000);
        DiscountedProduct product4 = new DiscountedProduct("Course Kotlin", 95_000, 95);
        FixPriceProduct product5 = new FixPriceProduct("Course С#");
        SimpleProduct product6 = new SimpleProduct("Course JavaScript", 400_000);

        ProductBasket productBasket = new ProductBasket();

        productBasket.addProduct(product1);
        productBasket.addProduct(product2);
        productBasket.addProduct(product3);
        productBasket.addProduct(product4);
        productBasket.addProduct(product5);
        productBasket.addProduct(product6);
        productBasket.printBasketContents();
        System.out.println(productBasket.getTotalBasketValue());
        System.out.println(productBasket.checkIfProductIsByBasket("Course С#"));
        System.out.println(productBasket.checkIfProductIsByBasket("Course С"));
        productBasket.clearBasket();
        productBasket.printBasketContents();
        System.out.println(productBasket.getTotalBasketValue());
        System.out.println(productBasket.checkIfProductIsByBasket("Course Python"));
    }

}
