package lection_2.com.globoforce.homework.nominator;


public class Nominator {
    private String name;
    private String currency = "EUR";
    private int nominatorAwardQuantityLimit;
    private double nominatorMaxAwardValue;

    /**
     * @param name     - Recipient's name
     * @param currency - currency of the Award
     */
    public Nominator(String name, String currency) {
        this.name = name;
        this.currency = currency;
    }

    /**
     * @param name                        - Nominator's name
     * @param nominatorAwardQuantityLimit - № of Nominations that Nominator can give
     * @param nominatorMaxAwardValue      - max value of the Award that Nominator can give
     */
    public Nominator(String name, int nominatorAwardQuantityLimit, double nominatorMaxAwardValue) {
        this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorMaxAwardValue = nominatorMaxAwardValue;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}



