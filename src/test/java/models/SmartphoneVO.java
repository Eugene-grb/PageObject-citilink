package models;

import models.valueobjects.Company;
import models.valueobjects.Ram;

public class SmartphoneVO {

    private Ram ram;
    private Company company;

    public SmartphoneVO () {}

    public SmartphoneVO(Ram ram, Company company) {
        this.company = company;
        this.ram = ram;
    }

    public Ram getRam() {
        return this.ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
