package by.itacademy.valerymihailuk.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setSurname("Sidorov");
        customer.setName("Sidr");
        customer.setPatronymic("Sidorovich");
        customer.setAddress("Sovetskaia,67");
        customer.setPersonalAccountNumber(766666666);
        customer.setCreditCardNumber(245623200);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setSurname("Ivanov");
        customer2.setName("Ivan");
        customer2.setPatronymic("Ivanovich");
        customer2.setAddress("Sovetskaia,34");
        customer2.setPersonalAccountNumber(0);
        customer2.setCreditCardNumber(245623243);

        System.out.println(customer2.getId());
        System.out.println(customer2.getSurname());
        System.out.println(customer2.getName());
        System.out.println(customer2.getPatronymic());
        System.out.println(customer2.getAddress());
        System.out.println(customer2.getPersonalAccountNumber());
        System.out.println(customer2.getCreditCardNumber());






    }

}
