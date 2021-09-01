package models.valueobjects;

// Ram - класс представляющий объект-значение ОП.
public class Ram {

    private int ram;

    public Ram() {};

    // конструктор класса с проверкой
    public Ram(int ram) {
        if (ram > 0) {
            this.ram = ram;
        } else {
            throw new IllegalArgumentException("Значение ОП не может быть меньше 0");
        }
    }

    public int getRam() {
        return this.ram;
    }

    // переопределенный метод сравнения
    public boolean equals(Ram otherRam) {
        return this.ram == otherRam.ram;
    }
}
