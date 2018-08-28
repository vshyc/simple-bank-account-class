package Darek;

public class VipCostumer {
    private String name;
    private double creditLimit;
    private String eMailAdress;

    public VipCostumer() {
        this("Name",1000.0,"eMail");
    }

    public VipCostumer(String name, String eMailAdress) {
        this(name,1000.0,eMailAdress);

    }

    public VipCostumer(String name, double creditLimit, String eMailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMailAdress = eMailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMailAdress() {
        return eMailAdress;
    }
}
