package org.java.ops;

public class Customer {

    private String name ;
    private Address address;
    private int age;

    public Customer(String name, Address address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", age=" + age +
                '}';
    }
}

