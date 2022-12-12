package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p= new Product();
        int val1= p.product(10,20);
        int val2= p.product(10,20,30);
        double val3= p.product(10.1,20.2);

        System.out.println(val1+" "+val2+" "+val3);

    }

    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }


    }

}