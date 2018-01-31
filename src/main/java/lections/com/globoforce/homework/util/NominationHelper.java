package lections.com.globoforce.homework.util;

import lections.com.globoforce.homework.Person;
import lections.com.globoforce.homework.award.Award;
import lections.com.globoforce.homework.nominator.Nominator;
import lections.com.globoforce.homework.nominee.Nominee;

import java.util.List;

public class NominationHelper {
    private Nominator nominator;

    public NominationHelper(Nominator nominator) {
        this.nominator = nominator;
    }

    public NominationHelper() {
    }

    /**
     * This Method Nominates the Recipient by particular Award
     */
    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
                + nominator.getCurrency() + " By Nominator: " + nominator.getName());
//        nominee.recieveAward(award);

        if (nominee.getNumberOfRecievedAwards() > 0) {
            nominateTillReachNomineeAwardQuantityLimit(nominator, nominee, award);
        } else {
            nominateTillReachNomineeAwardAmountLimit(nominator, nominee, award);
        }
    }

    public void nominate(Nominator nominator, Nominee nominee, Award award) {
        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
                + nominator.getCurrency() + " By Nominator: " + nominator.getName());
//        nominee.recieveAward(award);
        if (nominator.getNumberOfGivenAwards() > 0) {
            nominateTillReachNominatorAwardQuantityLimit(nominator, nominee, award);
        } else {
            nominateTillReachNominatorAwardAmountLimit(nominator, nominee, award);
        }
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

    /**
     * This method nominates recipient till the limit by # of Nominations OR
     * till the limit by Nominator's Amount will be reached for Nominator
     *  @param nominator is a specifier argument that is relative to the Nomination
     * @param nominee   is a specifier argument that is relative to the Nomination
     * @param award     an absolute Award to be given
     */
    public void nominateTillReachNominatorAwardQuantityLimit(Nominator nominator, Person nominee, Award award) {
        int nominationsCount = 0;
        // for (int i = 0; i < nominator.getNumberOfGivenAwards(); i++) {
        for (int i = 0; nominator.isLimitReached(nominationsCount, nominator.getAwardQuantityLimit()); i++) {
//            nominate(nominee, award);
            nominationsCount++;
        }
        if (nominationsCount > 1) {
            System.out.println("Recipient " + nominee.getName() + " receives award value = " + award.getValue() + " by "
                    + nominationsCount + " Nomination" + " With limit AAA " + nominator.getAwardQuantityLimit());
        } else {
            System.out.println("Recipient " + nominee.getName() + " does not receive award by " +  nominator.getName()
                    + " Nominator AAA  ");
        }


    }

    public void nominateTillReachNominatorAwardAmountLimit(Nominator nominator, Nominee nominee, Award award) {
        int sum = 0;
        int nominationsCount = 0;
        //  while (sum + award.getValue() <= nominator.getNumberOfGivenAwards()) {
        while (nominator.isLimitReached(sum + award.getValue(), nominator.getMaxAwardValue())) {
            sum += award.getValue();
//            nominate(nominee, award);
            nominationsCount++;
        }
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination" + " With limit BBB " + nominator.getMaxAwardValue());
    }

    /**
     * This method nominates recipient till the limit by # of Nominations OR
     * till the limit by Nominee's Amount will be reached for the recipient
     *
     * @param nominee is a specifier argument that is relative to the Nomination
     * @param award   an absolute Award to be given
     */

    public void nominateTillReachNomineeAwardQuantityLimit(Nominator nominator, Person nominee, Award award) {
        int nominationsCount = 1;
//        for (int i = 1; i <= nominee.getNumberOfRecievedAwards() + 1; i++) {
        for (int i = 1; nominee.isLimitReached(i, nominee.getAwardQuantityLimit()); i++) {
            if (i <= nominee.getAwardQuantityLimit()) {
                nominationsCount++;
            } else {
                System.out.println(nominee.getName() + " would not recieve more awards because ");
            }
        }
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination " + " With limit CCC " + nominee.getAwardQuantityLimit());
    }

    public void nominateTillReachNomineeAwardAmountLimit(Nominator nominator, Person nominee, Award award) {
        int sum = award.getValue();
        int nominationsCount = 0;
        do {
//            nominate(nominee, award);
            nominationsCount++;
        }
        //while ((sum += award.getValue()) <= nominee.getNumberOfRecievedAwards());
        while (nominee.isLimitReached(sum += award.getValue(), nominee.getMaxAwardValue()));
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination " + " With limit DDD " + nominee.getMaxAwardValue());
    }
}