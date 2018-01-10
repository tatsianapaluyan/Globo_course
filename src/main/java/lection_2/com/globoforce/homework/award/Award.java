package lection_2.com.globoforce.homework.award;

public class Award {


    static {
        System.out.println("Static initalization of Award class ");
    }

    {
        System.out.println("Award Instance initialization " + this.getValue());
    }


    private final int value;
    private double soli;

    /**
     * @param soli  - soli value, taking into account for Nomination with Soli
     * @param value - value of the Award
     */
    public Award(double soli, int value) {
        this.soli = soli;
        this.value = value;
    }

    /**
     * @param value - value of the Award
     */
    public Award(int value) {
        this.value = value;
        System.out.println("constructor initialisation " + this.value);
    }


    public int getValue() {
        return value;
    }


    public void setSoli(double soli) {
        this.soli = soli;
    }


    public double getSoli() {
        return soli;
    }
}
