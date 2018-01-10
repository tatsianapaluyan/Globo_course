//package lection_2.com.globoforce.homework.util;
//
//import lection_2.com.globoforce.homework.award.Award;
//import lection_2.com.globoforce.homework.nominator.Nominator;
//import lection_2.com.globoforce.homework.nominee.Nominee;
//
//public class NominationLimit {
//
//        public void nominate(Nominator nominator, Nominee nominee, Award award) {
//        System.out.println("Recipient: " + nominee.getName() + " Recieves the award: " + award.getValue() + " "
//                + nominator.getCurrency() + " By Nominator: " + nominator.getName());
//        nominee.recieveAward(award);
//    }
//
//
//
//
//    public void maxNumberforNominator(Nominator nominator, Nominee nominee, Award award) {
//        int nominationsCount = 0;
//        for (int i = 0; i < nominator.getNominatorAwardQuantityLimit(); i++) {
////            nominate(nominee, award);
//            nominationsCount++;
//        }
//        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
//                + nominationsCount + " Nomination" + " With limit " + nominator.getNominatorAwardQuantityLimit());
//    }
//
//    /**
//     * @param nominee
//     * @param award
//     */
//    public void maxAmountForNominator(Nominator nominator, Nominee nominee, Award award) {
//        int sum = 0;
//        int nominationsCount = 0;
//        while (sum + award.getValue() <= nominator.getNominatorMaxAwardValue()) {
//            sum += award.getValue();
//
////            nominate(nominee, award);
//            nominationsCount++;
//        }
//        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
//                + nominationsCount + " Nomination" + " With limit " + nominator.getNominatorMaxAwardValue());
//    }
//
//
//    public void maxNumberForNominee(Nominator nominator, Nominee nominee, Award award) {
//        int nominationsCount = 1;
//        for (int i = 1; i <= nominee.getNomineeAwardQuantityLimit() + 1; i++) {
//            if (i <= nominee.getNomineeAwardQuantityLimit()) {
//
//                nominationsCount++;
//            } else {
//                System.out.println(nominee.getName() + " would not recieve more awards because ");
//            }
//        }
//        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
//                + nominationsCount + " Nomination " + " With limit " + nominee.getNomineeAwardQuantityLimit());
//    }
//
//
//    public void maxAmountForNominee(Nominator nominator, Nominee nominee, Award award) {
//        int sum = award.getValue();
//        int nominationsCount = 0;
//        do {
////            nominate(nominee, award);
//            nominationsCount++;
//        } while ((sum += award.getValue()) <= nominee.getNomineeMaxAwardValue());
//        System.out.println("Recipient " + nominee.getName() + " receives award value =  " + award.getValue() + " by "
//                + nominationsCount + " Nomination " + " With limit " + nominee.getNomineeMaxAwardValue());
//    }
//
//}
