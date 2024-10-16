package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {
        Product product1 = new Product("Course Java", 200_000);
        Product product2 = new Product("Course C++", 250_000);
        Product product3 = new Product("Course Python", 100_000);
        Product product4 = new Product("Course Kotlin", 95_000);
        Product product5 = new Product("Course С#", 175_000);
        Product product6 = new Product("Course JavaScript", 400_000);

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
