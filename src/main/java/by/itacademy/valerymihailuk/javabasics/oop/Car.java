package by.itacademy.valerymihailuk.javabasics.oop;

public class Car {
    int id;
    String model;
    String name;
    String color;
    String regNumber;
    int year;
    int price;

    public void setId(int newId) {
        if (newId > 0) {
            id = newId;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void setModel(String newModel) {
        if (newModel != " ") {
            model = newModel;
        } else {
            System.out.println("Invalid Model");
        }
    }

    public void setName(String newName) {
        if (newName != " ") {
            name = newName;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public void setColor(String newColor) {
        if (newColor != " ") {
            color = newColor;
        } else {
            System.out.println("Invalid Color");
        }
    }

    public void setRegNumber(String newRegNumber) {
        if (newRegNumber != " ") {
            regNumber = newRegNumber;
        } else {
            System.out.println("Invalid Register Number");
        }
    }

    public void setYear(int newYear) {
        if (newYear > 0) {
            year = newYear;
        } else {
            System.out.println("Invalid Year");
        }
    }

    public void setPrice(int newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        }
        System.out.println("Invalid Price");
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getRegNumber() {
        return regNumber;
    }
}