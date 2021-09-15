package com.training.org;

import java.util.ArrayList;

public class Warehouse {
    private int id;
    private String Name;
    private int capacity;
    private int availableSpace;
    private int totalValue;
    private ArrayList<Products> prods;

    public Warehouse() {
    }

    public Warehouse(int id, String name, int capacity, int availableSpace) {
        this.id = id;
        Name = name;
        this.capacity = capacity;
        this.availableSpace = availableSpace;
        this.prods = new ArrayList<Products>();
    }

    public Warehouse(int id, String name, int capacity, int availableSpace, int totalValue, ArrayList<Products> prods) {
        this.id = id;
        Name = name;
        this.capacity = capacity;
        this.availableSpace = availableSpace;
        this.totalValue = totalValue;
        this.prods = prods;

    }
    public void addProduct(Products products) throws OutOfSpaceException {
        if(availableSpace <= 0)
        {
            throw new OutOfSpaceException("Ran out of space.. Please try later..!");
        }
        this.prods.add(products);
        availableSpace--;
        totalValue = (int) (totalValue + products.getPrice());
    }
    public void removeProduct(Products product){
        prods.remove(product);
        availableSpace++;
        totalValue = (int) (totalValue- product.getPrice());
    }
    public int checkAvailability(){
        return availableSpace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(int availableSpace) {
        this.availableSpace = availableSpace;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public ArrayList<Products> getProds() {
        return prods;
    }

    public void setProds(ArrayList<Products> prods) {
        this.prods = prods;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", capacity=" + capacity +
                ", availableSpace=" + availableSpace +
                ", totalValue=" + totalValue +
                ", prods=" + prods +
                '}';
    }
}
