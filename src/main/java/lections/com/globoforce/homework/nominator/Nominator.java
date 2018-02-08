package lections.com.globoforce.homework.nominator;


import lections.com.globoforce.homework.Person;
import lections.com.globoforce.homework.award.Award;

public class Nominator extends Person {

    private String currency = "EUR";
    private int numberOfGivenAwards;

    /**
     * @param name     - Recipient's name
     * @param currency - currency of the Award
     */
    public Nominator(String name, String currency) {
        super(name); //   <--     вызывает нижний конструктор


        //this(name,5,2);
        this.currency = currency;
    }

    /**
     * @param name               - Nominator's name
     * @param awardQuantityLimit - № of Nominations that Nominator can give
     * @param maxAwardValue      - max value of the Award that Nominator can give
     */
    public Nominator(String name, int awardQuantityLimit, double maxAwardValue, int numberOfGivenAwards, boolean nominate) {
        super(name, awardQuantityLimit, maxAwardValue, nominate);
        this.numberOfGivenAwards = numberOfGivenAwards;
    }


    @Override
    public void recieveAward(Award award) {
        if (award.getType().equals("NonCash")) {
            System.out.println("User " + getName() + " recieves Award with value " + award.getValue() + " and type " + award.getType());
        } else {
            System.out.println("Do nothing");
        }
    }

    public boolean getInfo() {
        if (getName() == null) {
//            System.out.println("Expired");
            return false;
        } else {
//            System.out.println("Active");
            return true;
        }
    }

    //override parent's method getName
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isLimitReached(double currentValue, double limit) {
        if (getInfo()) {
            return currentValue <= limit;
        } else {
            return false;
        }
    }


    public int getNumberOfGivenAwards() {
        return numberOfGivenAwards;
    }

    public void setNumberOfGivenAwards(int numberOfGivenAwards) {
        this.numberOfGivenAwards = numberOfGivenAwards;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}



