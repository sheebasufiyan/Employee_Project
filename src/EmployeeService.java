import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class EmployeeService  {
    static ArrayList<Employee> employees=new ArrayList<Employee>();

    public void register(Employee a){
        employees.add(a);
    }
    public void display(){
        for(int i=0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }
//        System.out.println(employees);

    }
    public void displaySort(){
        employees.sort((o1, o2)
                -> o1.getEmployeeName().compareTo(
                o2.getEmployeeName()));

        System.out.println("_______________________________________________________");
        System.out.println("Employee list after sorting");
        for(int i=0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }
//        System.out.println(employees);
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
        System.out.println("________________________________________________________\nEmployee details after removing an employee of index "+index);
        display();
    }


    public static void main(String args[]){
        System.out.println("Employee list before sorting");
        EmployeeService es=new EmployeeService();
        es.display();
        System.out.println("_______________________________________________________");
        System.out.println("Employee list after sorting");
        es.displaySort();

    }




}
