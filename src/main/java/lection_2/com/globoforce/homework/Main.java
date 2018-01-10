package lection_2.com.globoforce.homework;

import lection_2.com.globoforce.homework.award.Award;
import lection_2.com.globoforce.homework.nominator.Nominator;
import lection_2.com.globoforce.homework.nominee.Nominee;
import lection_2.com.globoforce.homework.util.AwardRecalculation;
import lection_2.com.globoforce.homework.util.NominationHelper;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        task2();
        task3();
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
        // nominator.nominate(recipients, award);
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

        NominationHelper nominationHelper = new NominationHelper(nominator);
        nominationHelper.nominate(nominee, award2);
        nominationHelper.nominate(nominee1, award1);
        nominationHelper.nominate(nominator, nominee2, award2);


        AwardRecalculation awardRecalculation = new AwardRecalculation();

        System.out.println("Award values for the Nominees with Soli");
        double first = awardRecalculation.recalculation(award1);
        double second = awardRecalculation.recalculation(award2);
        double third = awardRecalculation.recalculation(award);

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

        NominationHelper nominationHelper = new NominationHelper(nominator1);
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 1:
                    System.out.println("NOMINATION LIMIT that Nominator can give");
                    nominationHelper.nominate(nominator1, nominee, award2);
                    System.out.println();
                    break;
                case 2:
                    nominator1.setNominatorAwardQuantityLimit(0);
                    nominationHelper.nominate(nominator1, nominee2, award1);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("NOMINATION LIMIT that Recipient can receive");
                    nominationHelper.nominate(nominee3, award);
                    System.out.println();

                    break;
                case 4:
                    System.out.println("NOMINATION LIMIT for the Award Amount that Recipient can receive");
                    nominee3.setNomineeAwardQuantityLimit(0);
                    nominationHelper.nominate(nominee3, award1);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Choice .. Try Again.");
            }
        }
    }
}
