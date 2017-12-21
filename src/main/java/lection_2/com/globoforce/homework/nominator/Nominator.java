package lection_2.com.globoforce.homework.nominator;

import lection_2.com.globoforce.homework.award.Award;
import lection_2.com.globoforce.homework.nominee.Nominee;

import java.util.List;

public class Nominator {


    private String name;
    private String currency = "EUR";

    public Nominator(String name, String currency) {
        this.name = name;
        this.currency = currency;
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
}
