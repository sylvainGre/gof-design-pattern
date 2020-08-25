package creational.prototype.test;

import creational.prototype.model.Employees;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        System.out.println("Employees init "+employees);

        Employees employeesClone = (Employees) employees.clone();
        employeesClone.add("testAdd");

        System.out.println("Employees clone "+employeesClone);

    }
}
