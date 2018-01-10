package lection_2.com.globoforce.homework.nominee;

import lection_2.com.globoforce.homework.award.Award;

import java.util.Random;

public class Nominee {
    private String name;
    final Random random = new Random();
    double result;
    int nomineeAwardQuantityLimit;
    double nomineeMaxAwardValue;


    public Nominee(String name) {
        this.name = name;
    }

    public Nominee(String name, int nomineeAwardQuantityLimit, double nomineeMaxAwardValue) {
        this.name = name;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeMaxAwardValue = nomineeMaxAwardValue;
    }

    public void recieveAward(Award award) {
        if (award.getSoli() >= 0) {
            double v = award.getSoli() * award.getValue();
            System.out.println("Soli value = " + award.getSoli() + " ; " + "Recalculation of the award with Soli =  " + v);
            System.out.println("Decreased amount = " + (v / award.getValue() * 100 + " %"));
        } else {
            System.out.println(" Origin value of the Award " + award.getValue());
        }
    }

    public String getName() {
        return name;
    }

    /**
     * @param award
     * @return
     */
    // Recalculation of the Award value by formula
    public double recalculation(Award award) {
        double C = random.nextDouble();
        double Z = random.nextInt();
        double population = 3;
        double P = award.getValue();
//        System.out.println(C + ":" + Z + ":" + population + ":" + P);
        //result = (((Math.pow(Z,2))*(P)*(1-P))/(Math.pow(C,2)))/(1+(((((Math.pow(Z,2))*(P)*(1-P))/(Math.pow(C,2)))-1)/population));

        double a = Math.pow(Z, 2) * P * (1.0 - P);
        double b = a / (Math.pow(C, 2));
        double c = (b - 1.0) / population;
        result = b / (1.0 + c);
        System.out.println(result);
        return result;
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


