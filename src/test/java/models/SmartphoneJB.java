package models;

// JavaBean
public class SmartphoneJB {

    private int ram;
    private String company;

    public SmartphoneJB() {}

    public SmartphoneJB(int ram, String company) {
        this.company = company;
        this.ram = ram;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
