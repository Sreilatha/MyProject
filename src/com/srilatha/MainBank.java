package com.srilatha;

/**
 * Created by Srilatha on 7/25/2017.
 */
public class MainBank {
    public static void main(String [] args){
        Bank bank=new Bank("Bank of America");
        bank.addBranches("Scottsdale");
        bank.addCustomer("Scottsdale","Prathyush",1500.00);
        bank.listCustomers("Scottsdale",true);
    }
}
