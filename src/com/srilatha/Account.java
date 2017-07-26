package com.srilatha;

/**
 * Created by Srilatha on 6/20/2017.
 */
public class Account {
    private String name;
    private String id;
    private double balance;
    private String phoneNumber;
    public Account(String name,String id){
        this.name=name;
        this.id=id;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setId(String id){
        this.id=id;

    }
    public void setBalance(double balance){
        this.balance=balance;

    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getPhonenumber(){
        return this.phoneNumber;
    }
    public void witthDraw(double withdrawl){
        if(balance>withdrawl){
            balance=balance-withdrawl;
            System.out.println(balance);
        }else
            System.out.println("there is no sufficient balance to withdraw");

    }
public void depositt(double deposit){
        balance=balance+deposit;
        System.out.println(balance);
}
public static void main(String[] args){
    Account ac=new Account("Srilatha", "gsrilatha@gmail.com");
    ac.setBalance(1800);
    ac.setPhoneNumber("4804597255");
    System.out.println(ac.getName());
    System.out.println(ac.getId()+ "  " + ac.getPhonenumber()+ " ");
    System.out.println(ac.getBalance());
    ac.witthDraw(100.00);
    ac.depositt(1800.00);
}
}
