package lections.com.globoforce.homework;

import lections.com.globoforce.homework.award.Award;
import lections.com.globoforce.homework.nominee.Nominee;
import lections.com.globoforce.homework.util.OperationsWithLimit;

public abstract class Person implements OperationsWithLimit {

    private String name;
    private String lastName;
    private int awardQuantityLimit;
    private double maxAwardValue;
    private boolean ableNominate;


    public Person(String name, int awardQuantityLimit, double maxAwardValue, boolean ableNominate) {
        this.name = name;
        this.awardQuantityLimit = awardQuantityLimit;
        this.maxAwardValue = maxAwardValue;
        this.ableNominate = ableNominate;
    }

    public Person(String name) {
        this.name = name;
    }


    //Overloading of Person constructor with additional parameter
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void recieveAward(Award award) {
        System.out.println("User recieves Award with value " + award.getValue());
    }

    //Overloading of recieveAward Method with additional parameter
    public void recieveAward(Award award, Nominee nominee) {
        System.out.println(("User recieves Award with value " + award.getValue() + nominee.getName() + getLastName()));
    }


    public abstract boolean isLimitReached(double currentValue, double limit);


    //abstract method
    public abstract boolean getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAwardQuantityLimit() {
        return awardQuantityLimit;
    }

    public void setAwardQuantityLimit(int awardQuantityLimit) {
        awardQuantityLimit = awardQuantityLimit;
    }

    public double getMaxAwardValue() {
        return maxAwardValue;
    }

    public void setMaxAwardValue(double maxAwardValue) {
        maxAwardValue = maxAwardValue;
    }

    public boolean isAbleNominate() {
        return ableNominate;
    }

    public void setAbleNominate(boolean ableNominate) {
        this.ableNominate = ableNominate;
    }

    //Overload defaul constructor and call from it a parametrized, Person object s created with the name "No name"
    public Person() {
        this("No name");

        System.out.println("Person object created using default constructor");
    }

}
