package lections.com.globoforce.homework.award;

import java.util.List;

public class Award {


    static {
        System.out.println("Static initalization of Award class ");
    }

    {
        System.out.println("Award Instance initialization " + this.getValue());
    }


    private final int value;
    private double soli;
    private String type;
    private int id;

    /**
     * @param soli  - soli value, taking into account for Nomination with Soli
     * @param value - value of the Award
     */
    public Award(double soli, int value, String type) {
        this.soli = soli;
        this.value = value;
        this.type = type;
    }

    public Award(int value, String type, int id) {
        this.value = value;
        this.type = type;
        this.id = id;
    }

    /**
     * @param value - value of the Award
     */
    public Award(int value) {
        this.value = value;
        System.out.println("constructor initialisation " + this.value);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
