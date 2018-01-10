package lection_2.com.globoforce.homework.nominator;

import lection_2.com.globoforce.homework.award.Award;
import lection_2.com.globoforce.homework.nominee.Nominee;

import java.util.List;

public class Nominator {
    private String name;
    private String currency = "EUR";
    private int nominatorAwardQuantityLimit;
    private double nominatorMaxAwardValue;


    /**
     * @param name     - Recipient's name
     * @param currency - currency of the Award
     */
    public Nominator(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    /**
     * @param name                        - Nominator's name
     * @param nominatorAwardQuantityLimit - № of Nominations that Nominator can give
     * @param nominatorMaxAwardValue      - max value of the Award that Nominator can give
     */
    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorMaxAwardValue) {
        this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorMaxAwardValue = nominatorMaxAwardValue;
    }

    /**
     * This Method Nominates the Recipient by particular Award
     */
    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
                + currency + " By Nominator: " + name);
//        nominee.recieveAward(award);
        nominateByNomineesConditions(nominee, award);
    }

    /**
     * This Method Nominates multiple recipients
     */
    public void nominate(List<Nominee> recipients, Award award) {
        for (int i = 0; i < recipients.size(); i++) {
            Nominee recipient = recipients.get(i);
            nominate(recipient, award);
        }
    }

    public void nominate(Nominator nominator, Nominee nominee, Award award) {
        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
                + currency + " By Nominator: " + name);
//        nominee.recieveAward(award);
        nominateByNominatorsConditions(nominator, nominee, award);
    }

    /**
     * This method nominates recipient till the limit by # of Nominations OR
     * till the limit by Nominator's Amount will be reached for Nominator
     *
     * @param nominator is a specifier argument that is relative to the Nomination
     * @param nominee   is a specifier argument that is relative to the Nomination
     * @param award     an absolute Award to be given
     */
    private void nominateByNominatorsConditions(Nominator nominator, Nominee nominee, Award award) {
        if (nominatorAwardQuantityLimit > 0) {
            int nominationsCount = 0;
            for (int i = 0; i < getNominatorAwardQuantityLimit(); i++) {
//            nominate(nominee, award);
                nominationsCount++;
            }
            System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                    + nominationsCount + " Nomination" + " With limit " + nominator.getNominatorAwardQuantityLimit());
        } else {
            int sum = 0;
            int nominationsCount = 0;
            while (sum + award.getValue() <= getNominatorMaxAwardValue()) {
                sum += award.getValue();
//            nominate(nominee, award);
                nominationsCount++;

                System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                        + nominationsCount + " Nomination" + " With limit " + nominator.getNominatorMaxAwardValue());
            }
        }
    }

    /**
     * This method nominates recipient till the limit by # of Nominations OR
     * till the limit by Nominee's Amount will be reached for the recipient
     *
     * @param nominee is a specifier argument that is relative to the Nomination
     * @param award   an absolute Award to be given
     */

    private void nominateByNomineesConditions(Nominee nominee, Award award) {
        if (nominee.getNomineeAwardQuantityLimit() > 0) {
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
        } else {
            int sum = award.getValue();
            int nominationsCount = 0;
            do {
//            nominate(nominee, award);
                nominationsCount++;
            } while ((sum += award.getValue()) <= nominee.getNomineeMaxAwardValue());
            System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                    + nominationsCount + " Nomination " + " With limit " + nominee.getNomineeMaxAwardValue());
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}



