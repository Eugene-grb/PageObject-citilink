package models.valueobjects;

// Company - класс представляющий объект-значение Производитель.
public class Company {

    private String company;

    public Company() {};

    public Company(String company) {
        if (!company.isBlank() || !company.isEmpty()) {
            this.company = company;
        } else {
            throw new IllegalArgumentException("Наименование производителя не может быть пустым!");
        }
    }

    public String getCompany() {
        return this.company;
    }

    public boolean equals(Company otherCompany) {
        return this.company.equals(otherCompany.company);
    }
}
