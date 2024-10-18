package org.skypro.skyshop.basket;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

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
                result += product.getPrice();
            }
        }
        return result;
    }

    public void printBasketContents() {
        int count = 0;
        for (Product product : products) {
            if (nonNull(product)) {
                System.out.println(product);
                if (product.isSpecial()) {
                    count++;
                }
            } else {
                System.out.println("В корзине пусто");
                return;
            }
        }
        if (isProductByBasket()) {
            System.out.println("Итого: " + getTotalBasketValue());
            System.out.println("Специальных товаров: " + count);
        }
    }

    private boolean isProductByBasket() {
        for (Product product : products) {
            if (nonNull(product)) {
                return true;
            }
        }
        return false;
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
