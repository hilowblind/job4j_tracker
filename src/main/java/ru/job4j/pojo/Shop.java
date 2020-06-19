package ru.job4j.pojo;

public class Shop {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Coffee", 32);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Bread", 4);

        System.out.println("Before using the method:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println(System.lineSeparator() + "After deleting and using the method:");
        Product.deleteAndMoveToLeft(products, 1);

        System.out.println("After using the method:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
    }
}