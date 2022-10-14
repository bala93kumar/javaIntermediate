package org.java.ops;

public class CustomerRunner {

    public static void main(String[] args) {

        Address home  = new Address("radha nagar", "India","600044");
        Customer cust1 = new Customer("bala", home, 29);


        System.out.println(cust1);

        Address home1 = new Address("radha nagar 1" , "India" , "60044");
        cust1.setAddress(home1);
        System.out.println(cust1);
    }
}
