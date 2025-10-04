package org.example.app;

public class User {
    private String name;
    private Address address; // User є експертом з доступу до адреси

    public User(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}