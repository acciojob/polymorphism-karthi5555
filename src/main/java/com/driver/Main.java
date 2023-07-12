package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        // Task 3: Calling the method with two integer parameters
        int result1 = p.product(5, 10);
        System.out.println("Result 1: " + result1);

        // Task 4: Calling the method with three integer parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Result 2: " + result2);

        // Task 5: Calling the method with two double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }

    public static class Product {
        // Task 3: Method with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }
}