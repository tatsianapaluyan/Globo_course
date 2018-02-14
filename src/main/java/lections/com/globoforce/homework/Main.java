package lections.com.globoforce.homework;

import lections.com.globoforce.homework.award.Award;
import lections.com.globoforce.homework.nominator.Nominator;
import lections.com.globoforce.homework.nominee.Nominee;
import lections.com.globoforce.homework.util.*;

import java.util.*;

public class Main {

    public static void main(String[] args) throws AwardValueException, LimitExseption {
//task 2 and 5 together in 2
//        task2();
//        task3();
//        task4();
//        task5();
        //Polymorphism + Exception
        task6();
        //Array
//       task7();
        //        task8();

    }


    private static void task2() {
        System.out.println("Task 2 start");

        Award award = new Award(5, 200, "Cash");
        Award award1 = new Award(6, 300, "NonCash");
        Award award2 = new Award(7, 400, "Cash");

        Award cash = new Award(7, 400, "Cash");
        Award noncash = new Award(7, 400, "NonCash");


        Nominee nominee = new Nominee("Tanya");
        Nominee nominee1 = new Nominee("Yura");
        Nominee nominee2 = new Nominee("Pasha");

        Nominator nominator = new Nominator("Liam", "EUR");

        //Nominee nominee3 = new Nominee("BOB", 5, 2000);
        RecieveAward recieveAward = new RecieveAward();
//        nominee.recieveAward(award);
//        recieveAward.recieveAward(award);

        Person person = new Nominator("Bob", "USD");

        person.recieveAward(award);
        nominee.recieveAward(cash);
        nominator.recieveAward(noncash);
        person.recieveAward(award, nominee1);


        List<Nominee> recipients = new ArrayList<Nominee>();
        recipients.add(nominee);
        recipients.add(nominee1);
        recipients.add(nominee2);
        // nominator.nominate(recipients, award);
    }


    private static void task3() throws AwardValueException, LimitExseption {
        System.out.println("Task 3 start");

        System.out.println("Award values for the Nominees without Soli");


        Nominator nominator = new Nominator("Liam", "EUR");
        Award award = new Award(5, 200, "Cash");
        Award award1 = new Award(6, 300, "NonCash");
        Award award2 = new Award(7, 400, "Cash");
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


    private static void task4() throws AwardValueException, LimitExseption {
        System.out.println("Task 4 start");

        Nominator nominator1 = new Nominator("Jonathan", 5, 2000, 0, true);
        Nominee nominee = new Nominee("Tanya");
        Nominee nominee2 = new Nominee("Pasha");


        Award award = new Award(5, 200, "Cash");
        Award award1 = new Award(6, 300, "NonCash");
        Award award2 = new Award(7, 400, "Cash");

        Nominee nominee3 = new Nominee("BOB", 5, 2000, 0);

        NominationHelper nominationHelper = new NominationHelper(nominator1);
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 1:
                    System.out.println("NOMINATION LIMIT that Nominator can give");
                    nominationHelper.nominate(nominator1, nominee, award2);
                    System.out.println();
                    break;
                case 2:
                    nominator1.setNumberOfGivenAwards(0);
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
                    nominee3.setNumberOfRecievedAwards(0);
                    nominationHelper.nominate(nominee3, award1);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Choice .. Try Again.");

            }
        }
    }


    private static void task5() throws AwardValueException {
        System.out.println("Task 5 start");

        Person nominator1 = new Nominator(null, 5, 2000, 0, true);
        Person nominator2 = new Nominator("Jonathan", 4, 700, 0, true);

        Person nominee1 = new Nominee("Yura");
        Nominee nominee = new Nominee("Tanya");
        Person nominee3 = new Nominee("BOB", 5, 2100, 0);

        Award award = new Award(5, 200, "Cash");
        Award award1 = new Award(6, 300, "NonCash");
        Award award2 = new Award(7, 400, "Cash");

        NominationHelper nominationHelper = new NominationHelper();

        nominationHelper.nominateTillReachNominatorAwardQuantityLimit(nominator1, nominee1, award2);
        nominationHelper.nominateTillReachNominatorAwardQuantityLimit(nominator2, nominee1, award2);
        nominationHelper.nominateTillReachNominatorAwardAmountLimit(nominator2, nominee, award);
        nominationHelper.nominateTillReachNomineeAwardQuantityLimit(nominator1, nominee3, award);
        nominationHelper.nominateTillReachNomineeAwardAmountLimit(nominator1, nominee3, award1);
    }

    private static void task6() throws AwardValueException, LimitExseption {
        System.out.println("Task 6 start");

        // Polymorphism
        Person nominator3 = new Nominator(null, 5, 2000, 0, true);
        Person nominator4 = new Nominator("Jonathan", 0, 0, 0, false);
        Person nominator5 = new Nominator("Liam", 3, 1000, 0, false);

        Person nominee1 = new Nominee("Yura");
        Person nominee4 = new Nominee("Kolya", 5, 2100, 0);
        Person nominee5 = new Nominee("Mike", 0, 0, 0);

        Award award = new Award(5, 200, "Cash");
        Award award1 = new Award(6, 300, "NonCash");
        Award award2 = new Award(6, 0, "NonCash");
        Award award3 = new Award(6, -1, "NonCash");

        NominationHelper nominationHelper = new NominationHelper();

        nominationHelper.nominate(nominator3, nominee1, award);
       try {
           nominationHelper.nominate(nominator4, nominee4, award1);
       } catch (LimitExseption l){
           System.out.println("Limit has Incorrect value " + l.getErrorCode());
       }
        nominationHelper.nominate(nominator5, nominee1, award1);

        nominationHelper.nominate(nominee4, award1);
        nominationHelper.nominate(nominee5, award1);
        nominationHelper.nominate(nominee4, award2);
        nominationHelper.nominate(nominee4, award3);

        try {
            nominationHelper.nominate(nominator4, nominee4, award1);
        } catch (LimitExseption l) {
            System.out.println("Limit has Incorrect value " + l.getErrorCode());
        }
    }


    private static void task7() {
        System.out.println("Task 7 start");

//        Award award = new Award(1, "Thank you", 0);

        //Creating Array List of Awards
        List<Award> awardArrayList = new ArrayList<Award>();
        Random random = new Random();

        String[] awardType = new String[]{"Thank you", "Call Out", "Wisper", "Woohoo", "Surprise"};

        int id = 1;
        int currentValue = 0;
        int awardTypes = awardType.length;

        for (int i = 0; i < 15; i++) {
            Award award = new Award(i, id, awardType[random.nextInt(awardTypes)], currentValue);
            awardArrayList.add(award);
            currentValue += 100;
            id++;
        }


        AwardRecalculation awardRecalculation = new AwardRecalculation();
        awardRecalculation.printAwards(awardArrayList, "Thank you");
        awardRecalculation.printAwards(awardArrayList, "Call Out");
        awardRecalculation.printAwards(awardArrayList, "Wisper");
        awardRecalculation.printAwards(awardArrayList, "Woohoo");
        awardRecalculation.printAwards(awardArrayList, "Surprise");

        Set<String> set = new HashSet<String>();
        for (Award award : awardArrayList) {
            set.add(award.getType());
        }

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Award award = new Award(5);
        Award award1 = new Award(6);
        Award award2 = new Award(5, 5, "test");
        Award award3 = new Award(5, 1, "New");


        System.out.println(award.equals(award1));
        System.out.println(award2.equals(award3));
        System.out.println(award3.equals(award2));
//        System.out.println(Award award = (Award)obj);
//        System.out.println(award4.equals(award4));


//        if (value != award.value) return false;
//        if (type != award.type) return false;
//        if (soli != award.soli) return false;
//        if (getClass() != obj.getClass()) return false;
//        if (this == obj) return true;
//        return type.equals(award.type);


//        awardArrayList.add(award);

    }

    private static void task8() {
        System.out.println("Task 8 start");

        String s1 = "Str";
        String s2 = new String("Str");
        String s3 = "Str";


        System.out.println(s1 == s2);

        System.out.println(s2 == s3);

        System.out.println(s1.equals(s2));

    }
}
