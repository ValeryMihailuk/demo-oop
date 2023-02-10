package by.itacademy.valerymihailuk.javabasics.oop;

public class Book {
    int id;
    String authors;
    String name;
    String publish;
    int price;
    int year;
    int pages;

    public void setId(int newId) {
        if (newId > 0) {
            id = newId;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public void setAuthors(String newAuthor) {
        if (newAuthor != " ") {
            authors = newAuthor;
        } else {
            System.out.println("Invalid Author");
        }
    }

    public void setName(String newName) {
        if (newName != " ") {
            name = newName;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public void setPublish(String newPublish) {
        if (newPublish != " ") {
            publish = newPublish;
        } else {
            System.out.println("Invalid Publish");
        }
    }

    public void setPrice(int newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        } else {
            System.out.println("Invalid Price");
        }
    }

    public void setYear(int newYear) {
        if (newYear > 0) {
            year = newYear;
        } else {
            System.out.println("Invalid Year");
        }
    }

    public void setPages(int newPages) {
        if (newPages > 0) {
            pages = newPages;
        } else {
            System.out.println("Invalid Pages");
        }
    }

    public int getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublish() {
        return publish;
    }

    public int getPrice() {
        return price;
    }
}
