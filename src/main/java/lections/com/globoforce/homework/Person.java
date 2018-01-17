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

    //переопределяем дефолтный конструктор и вызываем из него параметризированный, т.е. создается Person с именем Default
    public Person() {
        this("Default");

        System.out.println("PersonVO object created using default constructor");
    }
}
