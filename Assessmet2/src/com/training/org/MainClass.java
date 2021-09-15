package com.training.org;

public class MainClass {
    public static void main(String[] args) throws OutOfSpaceException {

        Warehouse wh = new Warehouse(101, "WareHouse1", 10, 10);
        wh.addProduct(new Products(102, "test", "desc", 20));
        System.out.println(wh);

        wh.addProduct(new Products(103, "goods", "desc", 20));
        System.out.println(wh);

        wh.removeProduct(new Products(103, "goods", "desc", 20));
        System.out.println(wh);

    }
}
