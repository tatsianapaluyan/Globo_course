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

    public Award(int i, int id, String type, int value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    /**
     * @param value - value of the Award
     */
    public Award(int value) {
        this.value = value;
        System.out.println("constructor initialisation " + this.value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Award award = (Award) obj;

        if (value != award.value) return false;
        if (type != award.type) return false;
        if (soli != award.soli) return false;
        if (getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        return type.equals(award.type);


//       return  id == award.id
//               || (type == award.type
//               || (type != null && type.equals(award.getType())));
    }


    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result +type.hashCode();
        return result;

//        return type.hashCode();
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
