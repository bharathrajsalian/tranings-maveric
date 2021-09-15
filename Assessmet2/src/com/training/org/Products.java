package com.training.org;

public class Products {

    private int id;
    private String Name;
    private String desc;
    private double unitPrice;
    public Products(){

    }

    public Products(int id, String name, String desc, double unitPrice) {
        this.id = id;
        Name = name;
        this.desc = desc;
        this.unitPrice = unitPrice;
    }

    public double getPrice(){
        return unitPrice;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", desc='" + desc + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
