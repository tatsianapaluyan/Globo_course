package lection_2.com.globoforce.homework;

import lection_2.com.globoforce.homework.award.Award;
import lection_2.com.globoforce.homework.nominator.Nominator;
import lection_2.com.globoforce.homework.nominee.Nominee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class Main {

    public static void main(String[] args) {

        // task2();
        // task3();
        task4();
    }


    private static void task2() {
        System.out.println("Task 2 start");

        Award award = new Award(5, 200);
        Award award1 = new Award(6, 300);
        Award award2 = new Award(7, 400);

        Nominee nominee = new Nominee("Tanya");
        Nominee nominee1 = new Nominee("Yura");
        Nominee nominee2 = new Nominee("Pasha");

        Nominee nominee3 = new Nominee("BOB", 5, 2000);

        nominee.recieveAward(award);

        Nominator nominator = new Nominator("Liam", "EUR");

        List<Nominee> recipients = new ArrayList<Nominee>();
        recipients.add(nominee);
        recipients.add(nominee1);
        recipients.add(nominee2);

        //        nominator.nominate(recipients, award);
    }


    private static void task3() {
        System.out.println("Task 3 start");

        System.out.println("Award values for the Nominees without Soli");


        Nominator nominator = new Nominator("Liam", "EUR");
        Award award = new Award(5, 200);
        Award award1 = new Award(6, 300);
        Award award2 = new Award(7, 400);
        Nominee nominee = new Nominee("Tanya");
        Nominee nominee1 = new Nominee("Yura");
        Nominee nominee2 = new Nominee("Pasha");

        nominator.nominate(nominee, award2);
        nominator.nominate(nominee1, award1);
        nominator.nominate(nominee2, award);

        System.out.println("Award values for the Nominees with Soli");
        double first = nominee.recalculation(award1);
        double second = nominee1.recalculation(award2);
        double third = nominee2.recalculation(award);


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        if (first > second) {
            System.out.println(nominee.getName() + ": a1=" + first + " is greater than a2=" + second);
        }
        if (first > second && first > third) {
            System.out.println(nominee.getName() + ": a1=" + first + " is greater than a2=" + second + " and greater than a3=" + third);
        }
        if (first >= second || first <= third) {
            System.out.println(nominee.getName() + ": a1=" + first + " is greated than a2=" + second + " and greater than a3=" + third);
        }
    }


    private static void task4() {
        System.out.println("Task 4 start");

        Nominator nominator1 = new Nominator("Jonathan", 5, 500);
        Nominee nominee = new Nominee("Tanya");
        Nominee nominee1 = new Nominee("Yura");
        Nominee nominee2 = new Nominee("Pasha");
        Award award = new Award(5, 200);
        Award award1 = new Award(6, 300);
        Award award2 = new Award(7, 400);

        Nominee nominee3 = new Nominee("BOB", 5, 2000);

        NominationLimit nl = new NominationLimit();
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 1:
                    System.out.println("NOMINATION LIMIT that Nominator can give");
                    nl.maxNumberforNominator(nominator1, nominee, award2);
                    break;
                case 2:
                    System.out.println("NOMINATION LIMIT for the Award Amount that Nominator can give");
                    nl.maxAmountForNominator(nominator1, nominee1, award);
                    break;
                case 3:
                    System.out.println("NOMINATION LIMIT that Recipient can receive");
                    nl.maxNumberForNominee(nominator1, nominee3, award);

                    break;
                case 4:
                    System.out.println("NOMINATION LIMIT for the Award Amount that Recipient can receive");
                    nl.maxAmountForNominee(nominator1, nominee3, award1);

                    break;
                case 5:

                    nl.maxNumberforNominator(nominator1, nominee, award);
                    break;

                default:
                    System.out.println("Invalid Choice .. Try Again.");
            }
        }

    }
}

