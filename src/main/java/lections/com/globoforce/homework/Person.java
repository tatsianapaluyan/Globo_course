package lections.com.globoforce.homework;

import lections.com.globoforce.homework.award.Award;
import lections.com.globoforce.homework.nominator.Nominator;
import lections.com.globoforce.homework.nominee.Nominee;
import lections.com.globoforce.homework.util.RecieveAward;

public class Person {

    private String name;
    private String lastName;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void recieveAward(Award award) {
        System.out.println("User recieves Award with value " + award.getValue());
    }

    public void recieveAward(Award award, Nominee nominee) {
        System.out.println(("User recieves Award with value " + award.getValue()+nominee.getName() + getLastName()));
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

    //override defaul constructor and call from it a parametrized, Person object s created with th name "No name"
    public Person() {
        this("No name");

        System.out.println("Person object created using default constructor");
    }



}
