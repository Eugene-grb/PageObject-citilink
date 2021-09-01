package models;

import models.valueobjects.Company;
import models.valueobjects.Ram;

public class Smartphone {
    private Ram ram;
    private Company company;
    private int rom;
    private String model;

    public Smartphone() {}

    public Smartphone(Ram ram, Company company) {
        this.ram = ram;
        this.company = company;
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

    public int getRom() {
        return this.rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
