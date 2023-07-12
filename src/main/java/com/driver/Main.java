package com.driver;

public class Main {

      public class Product{

         public int product(int x, int y){
            return x*y;
        }

         public int product(int x, int y, int z) {
            return 0;
        }

         public double product(double x, double y) {
            return 0.00;
        }

    }

    public void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(1,2);
    }

}