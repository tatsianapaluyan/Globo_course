package lection_2.com.globoforce.homework.nominator;

import lection_2.com.globoforce.homework.award.Award;
import lection_2.com.globoforce.homework.nominee.Nominee;

import java.util.List;

public class Nominator {

    private String name;
    private String currency = "EUR";
    int nominatorAwardQuantityLimit;
    double nominatorMaxAwardValue;


    public Nominator(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorMaxAwardValue) {
        this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorMaxAwardValue = nominatorMaxAwardValue;
    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
                + currency + " By Nominator: " + name);
        nominee.recieveAward(award);
    }

    // Nominate multiple recipients
    public void nominate(List<Nominee> recipients, Award award) {
        for (int i = 0; i < recipients.size(); i++) {
            Nominee recipient = recipients.get(i);
            nominate(recipient, award);
        }
    }


    public void maxNumberforNominator(Nominee nominee, Award award) {
        int nominationsCount = 0;
        for (int i = 0; i < getNominatorAwardQuantityLimit(); i++) {
//            nominate(nominee, award);
            nominationsCount++;
        }
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination" + " With limit " + getNominatorAwardQuantityLimit());
    }

    public void maxAmountForNominator(Nominee nominee, Award award) {
        int sum = 0;
        int nominationsCount = 0;
        while (sum + award.getValue() <= getNominatorMaxAwardValue()) {
            sum += award.getValue();

//            nominate(nominee, award);
            nominationsCount++;
        }
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination" + " With limit " + getNominatorMaxAwardValue());
    }

    public void maxNumberForNominee(Nominee nominee, Award award) {
        int nominationsCount = 1;
        for (int i = 1; i <= nominee.getNomineeAwardQuantityLimit() + 1; i++) {
            if (i <= nominee.getNomineeAwardQuantityLimit()) {

                nominationsCount++;
            } else {
                System.out.println(nominee.getName() + " would not recieve more awards because ");
            }
        }
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination " + " With limit " + nominee.getNomineeAwardQuantityLimit());
    }


    public void maxAmountForNominee(Nominee nominee, Award award) {
        int sum = award.getValue();
        int nominationsCount = 0;
        do {
//            nominate(nominee, award);
            nominationsCount++;
        } while ((sum += award.getValue()) <= nominee.getNomineeMaxAwardValue());
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination " + " With limit " + nominee.getNomineeMaxAwardValue());
    }


    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public double getNominatorMaxAwardValue() {
        return nominatorMaxAwardValue;
    }

    public void setNominatorMaxAwardValue(double nominatorMaxAwardValue) {
        this.nominatorMaxAwardValue = nominatorMaxAwardValue;
    }
}



