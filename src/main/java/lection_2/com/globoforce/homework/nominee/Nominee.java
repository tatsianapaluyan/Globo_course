package lection_2.com.globoforce.homework.nominee;

import lection_2.com.globoforce.homework.award.Award;

import java.util.Random;

public class Nominee {
    private String name;
    private int nomineeAwardQuantityLimit;
    private double nomineeMaxAwardValue;


    public Nominee(String name) {
        this.name = name;
    }

    public Nominee(String name, int nomineeAwardQuantityLimit, double nomineeMaxAwardValue) {
        this.name = name;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeMaxAwardValue = nomineeMaxAwardValue;
    }

//    public void recieveAward(Award award) {
//        if (award.getSoli() >= 0) {
//            double v = award.getSoli() * award.getValue();
//            System.out.println("Soli value = " + award.getSoli() + " ; " + "Recalculation of the award with Soli =  " + v);
//            System.out.println("Decreased amount = " + (v / award.getValue() * 100 + " %"));
//        } else {
//            System.out.println(" Origin value of the Award " + award.getValue());
//        }
//    }

    public String getName() {
        return name;
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


