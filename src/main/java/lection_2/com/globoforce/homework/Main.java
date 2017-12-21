package lection_2.com.globoforce.homework;

import lection_2.com.globoforce.homework.award.Award;
import lection_2.com.globoforce.homework.nominator.Nominator;
import lection_2.com.globoforce.homework.nominee.Nominee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Award award = new Award(5, 200);
        Award award1 = new Award(6, 300);
        Award award2 = new Award(7, 400);

        Nominee nominee = new Nominee("Tanya");
        Nominee nominee1 = new Nominee("Yura");
        Nominee nominee2 = new Nominee("Sasha");


        nominee.recieveAward(award);

        Nominator nominator = new Nominator("Liam", "EUR");

        List<Nominee> recipients = new ArrayList<Nominee>();
        recipients.add(nominee);
        recipients.add(nominee1);
        recipients.add(nominee2);

        //        nominator.nominate(recipients, award);

        System.out.println("Award values for the Nominees without Soli");
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
}

