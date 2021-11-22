package com.Employee;

import java.util.ArrayList;


public class EmployeeService  {
     public static ArrayList<Employee> employees=new ArrayList<Employee>();
     Comparator c=new Comparator();

    public void register(Employee a){

        employees.add(a);
    }
    public void register(Employee a, Employee b, Employee c, Employee d, Employee e){
        employees.add(a);
        employees.add(b);
        employees.add(c);
        employees.add(d);
        employees.add(e);

    }
    public void display(){
        for(Employee e:employees){
            System.out.print(e.getEmployeeName()+"--"+e.getEmployeeNumber()+"--"+e.getDob()+"--"+e.getAddress()+"--"+e.getDesignation()+"--"+e.getOrganisation()+"\n");
        }

    }
    public void displayAfterSorting(){
        c.displaySort(employees);
        display();
    }


    public void update(int index){
        Employee e=new Employee();
        e=employees.get(index);
        e.setDesignation(Designation.PROJECT_LEADER);
        employees.set(index,e);

        System.out.println("________________________________________________________\nDetails after updation");
        display();

    }
    public void remove(int index){
        employees.remove(index);
        System.out.println("________________________________________________________\ncom.company.Employee details after removing an employee of index "+index);
        display();
    }


}
