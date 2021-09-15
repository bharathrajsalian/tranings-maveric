package com.training.org;

import java.util.Date;

public class Widget extends  Products{
    private Date expDate;


    public Widget(){

    }
    public Widget(Date expDate) {
        this.expDate = expDate;
    }

    public Widget(int id, String name, String desc, double unitPrice, Date expDate) {
        super(id, name, desc, unitPrice);
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Widget{" +
                "expDate=" + expDate +
                '}';
    }
}
