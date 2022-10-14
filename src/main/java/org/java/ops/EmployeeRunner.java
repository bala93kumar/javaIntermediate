package org.java.ops;

public class EmployeeRunner {

    public static void main(String[] args) {

        Employee emp1 = new Employee("raju", "Analyst");

        emp1.setEmployer("tCs");
        emp1.setSalary(1000000);
//        emp1.setName("raju");
        emp1.setEmail("raju@tcs.com");


        System.out.println(emp1);
    }
}
