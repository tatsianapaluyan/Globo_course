package lection_2.com.globoforce.homework.nominee;

import lection_2.com.globoforce.homework.award.Award;

import java.util.Random;

public class Nominee {
    private String name;
    final Random random = new Random();
    double result;

    public Nominee(String name) {
        this.name = name;
    }

    public void recieveAward(Award award) {
        if (award.getSoli() >= 0) {
            System.out.println("значение соли которое было использовано " + award.getSoli() + " ; " + "пересчет аварды " + award.getValue() * award.getSoli());
            System.out.println("потеряное количество от первоначальной аварды " + (award.getValue() - (award.getSoli() * award.getValue()) / award.getValue() * 100 + " %"));
        } else {
            System.out.println("Значение аварды " + award.getValue());
        }
///    return award.getValue();
    }

    public String getName() {
        return name;
    }

    // пересчет авард с соли
    public double recalculation(Award award) {
        double C = 1.2;//random.nextDouble();
        int Z = 2;//random.nextInt();
        int population = 3;
        int P = award.getValue();
        System.out.println(C + ":" + Z + ":" + population + ":" + P);
        //result = (((Math.pow(Z,2))*(P)*(1-P))/(Math.pow(C,2)))/(1+(((((Math.pow(Z,2))*(P)*(1-P))/(Math.pow(C,2)))-1)/population));


        double a = Math.pow(Z, 2) * P * (1 - P);
        double b = a / (Math.pow(C, 2));
        double c = (b - 1) / population;
        result = b / (1 + c);
        System.out.println(result);
        return result;


    }


}


