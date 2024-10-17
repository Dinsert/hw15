package org.skypro.skyshop.basket;

import static java.util.Objects.*;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private final Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (isNull(products[i])) {
                products[i] = product;
                break;
            }
            if (i == products.length - 1) {
                System.out.println("Невозможно добавить продукт");
            }
        }
    }

    public int getTotalBasketValue() {
        int result = 0;
        for (Product product : products) {
            if (nonNull(product)) {
                result += product.getCostProduct();
            }
        }
        return result;
    }

    public void printBasketContents() {
        for (int i = 0; i < products.length; i++) {
            if (isNull(products[0])) {
                System.out.println("В корзине пусто");
                break;
            } else if (nonNull(products[i])) {
                System.out.println(products[i]);
                if (i == products.length - 1) {
                    System.out.println("Итого: " + getTotalBasketValue());
                }
            }
        }
    }

    public boolean checkIfProductIsByBasket(String string) {
        for (Product product : products) {
            if (nonNull(product) && string.equals(product.getNameProduct())) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            if (nonNull(products[i])) {
                products[i] = null;
            }
        }
    }

}
