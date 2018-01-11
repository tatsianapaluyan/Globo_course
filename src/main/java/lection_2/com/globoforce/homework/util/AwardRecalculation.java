package lection_2.com.globoforce.homework.util;

import lection_2.com.globoforce.homework.award.Award;

import java.util.Random;

public class AwardRecalculation {

    final Random random = new Random();
    double result;

    /**
     * @param award
     * @return ReCalculation of the Award Amount according to the Soli value
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
}
