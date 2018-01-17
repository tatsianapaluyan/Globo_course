package lections.com.globoforce.homework;

import lections.com.globoforce.homework.award.Award;
import lections.com.globoforce.homework.nominator.Nominator;
import lections.com.globoforce.homework.nominee.Nominee;

public class Person {

    private String name;
    private String lastName;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


    public void recieveAward(Nominator nominator, Nominee nominee, Award award) {
        System.out.println(" User recieves Award with value " + award.getValue());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;


    }

    public void recieveAward1(Nominator nominator, Nominee nominee) {
        System.out.println(" User recieves Award");
    }
}