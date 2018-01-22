package lections.com.globoforce.homework.nominator;


import lections.com.globoforce.homework.Person;
import lections.com.globoforce.homework.award.Award;

public class Nominator extends Person {
    //    private String name;
    private String currency = "EUR";
    private int nominatorAwardQuantityLimit;
    private double nominatorMaxAwardValue;

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
     * @param name                        - Nominator's name
     * @param nominatorAwardQuantityLimit - № of Nominations that Nominator can give
     * @param nominatorMaxAwardValue      - max value of the Award that Nominator can give
     */
    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorMaxAwardValue) {
        super(name);
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorMaxAwardValue = nominatorMaxAwardValue;
    }

    @Override
    public void recieveAward(Award award) {
        if (award.getType().equals("NonCash")) {
            System.out.println("User " + getName() + " recieves Award with value " + award.getValue() + " and type " + award.getType());
        } else {
            System.out.println("Do nothing");
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //override parent's method getName
    @Override
    public String getName() {
        return super.getName();
    }
}



