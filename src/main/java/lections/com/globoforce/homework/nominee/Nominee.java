package lections.com.globoforce.homework.nominee;

import lections.com.globoforce.homework.Person;
import lections.com.globoforce.homework.award.Award;

public class Nominee extends Person {

    private int numberOfRecievedAwards;


    public Nominee(String name) {
        super(name);
    }

    public Nominee(String name, int awardQuantityLimit, double maxAwardValue, int numberOfRecievedAwards) {
        super(name, awardQuantityLimit, maxAwardValue);
        this.numberOfRecievedAwards = numberOfRecievedAwards;
    }

    @Override
    public void recieveAward(Award award) {
        if (award.getType().equals("Cash")) {
            System.out.println("User " + getName() + " recieves Award with value " + award.getValue() + " and type " + award.getType());
        } else {
            System.out.println("Do nothing");
        }
    }

    public boolean getInfo() {
        if (getName() == null) {
            System.out.println("Expired");
            return false;
        } else {
            System.out.println("Active");
            return true;
        }
    }

    @Override
    public boolean isLimitReached(double currentValue, double limit) {
        return currentValue <= limit;
    }

    public int getNumberOfRecievedAwards() {
        return numberOfRecievedAwards;
    }

    public void setNumberOfRecievedAwards(int numberOfRecievedAwards) {
        this.numberOfRecievedAwards = numberOfRecievedAwards;
    }

}


