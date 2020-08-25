package creational.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeesList;

    public Employees(){
        this.employeesList = new ArrayList<String>();
    }
    public Employees(List<String> employeesList) {
        this.employeesList = employeesList;
    }

    public void setEmployeesList(List<String> employeesList) {
        this.employeesList = employeesList;
    }

    public List<String> getEmployeesList() {
        return employeesList;
    }

    public void loadData(){
        this.employeesList.add("Steve");
        this.employeesList.add("Mike");
        this.employeesList.add("Jason");
    }

    public void add(String name){
        this.employeesList.add(name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for(String employee : this.employeesList){
            temp.add(employee);
        }
        return new Employees(temp);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeesList=" + employeesList +
                '}';
    }
}
