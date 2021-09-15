package com.training.org;

public class Bank {
    private String bankName;
    private String accountNo;
    private String typeOfAccount;
    private double balance;

    public Bank(){
        System.out.println("Default constructor of Bank is called");
        bankName="";
        accountNo="";
        typeOfAccount="";
        balance=0;
    }

    public Bank(String bankName, String accountNo, String typeOfAccount, double balance) {
        System.out.println("Parameterised consstructor of Bank is called");
        this.bankName = bankName;
        this.accountNo = accountNo;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
    }

    public void showBankDeatils(){
        System.out.println("Bank details "+bankName+" Acccount No"+accountNo+" Type of account"+typeOfAccount+" Balance"+balance);
    }
}

