package lections.com.globoforce.homework.nominee;

import lections.com.globoforce.homework.Person;
import lections.com.globoforce.homework.award.Award;

public class Nominee extends Person {
    private int nomineeAwardQuantityLimit;
    private double nomineeMaxAwardValue;


    public Nominee(String name) {
        super(name);
    }


    public Nominee(String name, int nomineeAwardQuantityLimit, double nomineeMaxAwardValue) {
        super(name);
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeMaxAwardValue = nomineeMaxAwardValue;
    }

    @Override
    public void recieveAward(Award award) {
        if (award.getType().equals("Cash")) {
            System.out.println("User " + getName()+  " recieves Award with value " + award.getValue() + " and type " + award.getType());
        } else {
            System.out.println("Do nothing");
        }
    }


    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public double getNomineeMaxAwardValue() {
        return nomineeMaxAwardValue;
    }

    public void setNomineeMaxAwardValue(double nomineeMaxAwardValue) {
        this.nomineeMaxAwardValue = nomineeMaxAwardValue;
    }

}


