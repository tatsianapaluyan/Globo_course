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
        nominator.nominate(nominee, award);
        nominator.nominate(nominee, award2);
        nominator.nominate(nominee1, award);
        nominator.nominate(nominee1, award2);
        nominator.nominate(nominee2, award1);
        nominator.nominate(nominee2, award);


        double a1 = nominee.recalculation(award);
        double a2 = nominee.recalculation(award1);
        double a3 = nominee.recalculation(award2);
        double a4 = nominee1.recalculation(award);
        double a5 = nominee2.recalculation(award2);

        System.out.println("testpn");


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        if (a1>a2) {
            System.out.println( nominee.getName() + ": a1=" + a1 + "is greated than a2=" + a2);
        }

        if (a1>a2 && a1>a3) {
            System.out.println( nominee.getName() + ": a1=" + a1 + "is greated than a2=" + a2 +  " and greater than a3=" + a3);
        }

    }
}

