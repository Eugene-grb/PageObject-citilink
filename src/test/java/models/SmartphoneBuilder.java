package models;

import models.valueobjects.Company;
import models.valueobjects.Ram;

public class SmartphoneBuilder {

    private final Ram ram;
    private final Company company;
    private int rom = 256;
    private String model = "Galaxy S20";

    public SmartphoneBuilder(Ram ram, Company company) {
        this.company = company;
        this.ram = ram;
    }

    public SmartphoneBuilder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public SmartphoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    // создание обьекта смартфон
    public Smartphone build() {
        Smartphone smartphone = new Smartphone();
        smartphone.setRam(this.ram);
        smartphone.setRom(this.rom);
        smartphone.setCompany(this.company);
        smartphone.setModel(this.model);
        return smartphone;
    }
}
