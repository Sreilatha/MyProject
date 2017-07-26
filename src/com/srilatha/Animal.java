package com.srilatha;

/**
 * Created by Srilatha on 6/22/2017.
 */
public class Animal {
    private String name;
    private int legs;
    public Animal(String name,int legs){
        this.name=name;
        this.legs=legs;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setLegs(int legs){
        this.legs=legs;
    }
    public int getLegs(){
       return this.legs;
    }
    public void makeSound(String sound){

    }
}
class Dog extends Animal{
    private int noofeyes;
    private int legs;
    public Dog(String name,int legs){
        super(name,legs);
        this.noofeyes=noofeyes;
    }
    public void setNoofeyes(int noofeyes){
        this.noofeyes=noofeyes;
    }
    public int getNoofeyes(){
        return this.noofeyes;
    }
    public void makeSound(String sound){
        System.out.println("this how dog makesSound"+" "+sound);
    }

}

