package by.itacademy.valerymihailuk.javabasics.oop;

public class Person extends Student {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIncome() {
        return salary + getGrant();
    }
}