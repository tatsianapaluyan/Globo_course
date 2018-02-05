package lections.com.globoforce.homework.util;

import lections.com.globoforce.homework.award.Award;

import java.util.List;
import java.util.Random;

public class AwardRecalculation {

    private final Random random = new Random();
    private double result;

    /**
     * @param award
     * @return ReCalculation of the Award Amount according to the Soli value
     */

    // Recalculation of the Award value by formula
    public double recalculation(Award award) {
        double k = random.nextDouble();
        double z = random.nextInt();
        double population = 3;
        double p = award.getValue();

        //result = (((Math.pow(Z,2))*(P)*(1-P))/(Math.pow(C,2)))/(1+(((((Math.pow(Z,2))*(P)*(1-P))/(Math.pow(C,2)))-1)/population));

        double a = Math.pow(z, 2) * p * (1.0 - p);
        double b = a / (Math.pow(k, 2));
        double c = (b - 1.0) / population;
        result = b / (1.0 + c);
        System.out.println(result);
        return result;
    }


    public void printAwards(List<Award> awards, String type) {
        System.out.println("Awards with the type 'Test' ");


    }




}
