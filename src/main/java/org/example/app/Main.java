package org.example.app;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vakarenko Nikita");
        Address address = new Address("Shevchenko 10", "Kyiv", "01001");

        user.setAddress(address); // User отримує адресу

        // Вивід адреси через User (User відповідає за доступ до Address)
        System.out.println(user.getName() + " address: " + user.getAddress());
    }
}