package lection_2.com.globoforce.homework.util;

import lection_2.com.globoforce.homework.award.Award;
import lection_2.com.globoforce.homework.nominator.Nominator;
import lection_2.com.globoforce.homework.nominee.Nominee;

import java.util.List;

public class NominationHelper {
    private Nominator nominator;

    public NominationHelper(Nominator nominator) {
        this.nominator = nominator;
    }

    /**
     * This Method Nominates the Recipient by particular Award
     */
    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
                + nominator.getCurrency() + " By Nominator: " + nominator.getName());
//        nominee.recieveAward(award);
        if (nominee.getNomineeAwardQuantityLimit() > 0) {
            maxNumberForNominee(nominator, nominee, award);
        } else {
            maxAmountForNominee(nominator, nominee, award);
        }

    }

    public void nominate(Nominator nominator, Nominee nominee, Award award) {
        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
                + nominator.getCurrency() + " By Nominator: " + nominator.getName());
//        nominee.recieveAward(award);
        if (nominator.getNominatorAwardQuantityLimit() > 0) {
            maxNumberforNominator(nominator, nominee, award);
        } else {
            maxAmountForNominator(nominator, nominee, award);
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
     *
     * @param nominator is a specifier argument that is relative to the Nomination
     * @param nominee   is a specifier argument that is relative to the Nomination
     * @param award     an absolute Award to be given
     */
    private void maxNumberforNominator(Nominator nominator, Nominee nominee, Award award) {
        int nominationsCount = 0;
        for (int i = 0; i < nominator.getNominatorAwardQuantityLimit(); i++) {
//            nominate(nominee, award);
            nominationsCount++;
        }
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination" + " With limit " + nominator.getNominatorAwardQuantityLimit());
    }

    private void maxAmountForNominator(Nominator nominator, Nominee nominee, Award award) {
        int sum = 0;
        int nominationsCount = 0;
        while (sum + award.getValue() <= nominator.getNominatorMaxAwardValue()) {
            sum += award.getValue();
//            nominate(nominee, award);
            nominationsCount++;
        }
        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
                + nominationsCount + " Nomination" + " With limit " + nominator.getNominatorMaxAwardValue());
    }

    /**
     * This method nominates recipient till the limit by # of Nominations OR
     * till the limit by Nominee's Amount will be reached for the recipient
     *
     * @param nominee is a specifier argument that is relative to the Nomination
     * @param award   an absolute Award to be given
     */

    private void maxNumberForNominee(Nominator nominator, Nominee nominee, Award award) {
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

    private void maxAmountForNominee(Nominator nominator, Nominee nominee, Award award) {
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