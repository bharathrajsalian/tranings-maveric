package com.training.org;

public class Customer {
    private int custId;
    private String custName;
    private String custAddress;
    private double custMobileNo;

    public Customer() {
        System.out.println("default constructor");
    }

    public Customer(int custId, String custName, String custAddress, double custMobileNo) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custMobileNo = custMobileNo;
    }

    public void showCustomerDetails(){
        System.out.println("cus id " + custId + " cus name " + custName + " cus address " + custAddress + " mob number " + custMobileNo);
    }

}
