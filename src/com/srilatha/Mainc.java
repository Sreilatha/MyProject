package com.srilatha;

/**
 * Created by Srilatha on 6/22/2017.
 */
public class Mainc{
    public static void main(String[] args){
        Animal a=new Animal("king",4);
        Dog d=new Dog("puppy",4);
        d.setNoofeyes(2);
        System.out.println("Dog has "+ " "+d.getNoofeyes()+ " "+ "eyes");
        d.makeSound("bark");



    }
}

