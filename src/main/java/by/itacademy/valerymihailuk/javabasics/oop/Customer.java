package by.itacademy.valerymihailuk.javabasics.oop;

public class Customer {

    int id;
    String surname;
    String name;
    String patronymic;
    String address;
    int creditCardNumber;
    int personalAccountNumber;

    public void setId(int newId) {
        if (newId > 0) {
            id = newId;
        }
        System.out.println("Invalid ID");
    }

    public void setSurname(String newSurname) {
        if (newSurname != " ") {
            surname = newSurname;
        }
        System.out.println("Invalid Surname");
    }

    public void setName(String newName) {
        if (newName != " ") {
            name = newName;
        }
        System.out.println("Invalid Name");
    }

    public void setPatronymic(String newPatronymic) {
        if (newPatronymic != " ") {
            patronymic = newPatronymic;
        }
        System.out.println("Invalid Patronymic");
    }

    public void setAddress(String newAddress) {
        if (newAddress != " ") {
            address = newAddress;
        }
        System.out.println("Invalid Address");
    }

    public void setCreditCardNumber(int newCreditCardNumber) {
        if (newCreditCardNumber > 0) {
            creditCardNumber = newCreditCardNumber;
        }
        System.out.println("Invalid CreditCardNumber");
    }

    public void setPersonalAccountNumber(int newPersonalAccountNumber) {
        if (newPersonalAccountNumber > 0) {
            personalAccountNumber = newPersonalAccountNumber;
        }
        System.out.println("Invalid PersonalAccountNumber");
    }

    public int getId() {
        return id;
    }
    public int getPersonalAccountNumber() {
        return personalAccountNumber;
    }
    public int getCreditCardNumber() {
        return creditCardNumber;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getAddress() {
        return address;
    }
}