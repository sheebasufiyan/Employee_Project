import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeController {
    public static void main(String args[]) {
        HashMap<String,Integer> org=new HashMap<String,Integer>();
        org.put("Robosoft",1);
        org.put("Infosys",2);
        org.put("MindTree",3);


        Employee e1=new Employee("Raj",empNum(),"12/06/1999","bengaluru",Designation.SYSTEM_ENGINEER,org.get("Robosoft"));
        Employee e2=new Employee("Adam",empNum(),"19/08/1999","bengaluru",Designation.TRAINEE,org.get("Infosys"));
        Employee e3=new Employee("Seema",empNum(),"12/07/1966","Udupi",Designation.PROJECT_LEADER,org.get("MindTree"));
        Employee e4=new Employee("Ameer",empNum(),"23/06/1976","Manglore",Designation.SYSTEM_ENGINEER,org.get("Robosoft"));
        Employee e5=new Employee("Sheeba",empNum(),"23/07/1997","bengaluru",Designation.SYSTEM_ENGINEER,org.get("MindTree"));
        EmployeeService es=new EmployeeService();
        es.register(e1);
        es.register(e2);
        es.register(e3);
        es.register(e4);
        es.register(e5);
        System.out.println("Employee list before sorting");
        Employee e6=new Employee();
        e6.setEmployeeName("Rabindranath");
        e6.setEmployeeNumber(empNum());
        e6.setdob("13/09/1987");
        e6.setAddress("Chikmagaluru");
        e6.setDesignation(Designation.TRAINEE);
        e6.setOrganisation(3);

        Employee e7=new Employee();
        e7.setEmployeeName("Bharath");
        e7.setEmployeeNumber(empNum());
        e7.setdob("15/12/1987");
        e7.setAddress("Chikmagaluru");
        e7.setDesignation(Designation.TRAINEE);
        e7.setOrganisation(3);

        Employee e8=new Employee();
        e8.setEmployeeName("Shabnum");
        e8.setEmployeeNumber(empNum());
        e8.setdob("15/02/1990");
        e8.setAddress("Mysuru");
        e8.setDesignation(Designation.TRAINEE);
        e8.setOrganisation(1);

        Employee e9=new Employee();
        e9.setEmployeeName("Dhara");
        e9.setEmployeeNumber(empNum());
        e9.setdob("15/12/1987");
        e9.setAddress("Chitradurga");
        e9.setDesignation(Designation.PROJECT_LEADER);
        e9.setOrganisation(2);

        Employee e10=new Employee();
        e10.setEmployeeName("Raavi");
        e10.setEmployeeNumber(empNum());
        e10.setdob("01/12/1987");
        e10.setAddress("Chikmagaluru");
        e10.setDesignation(Designation.TRAINEE);
        e10.setOrganisation(1);

        es.register(e6);
        es.register(e7);
        es.register(e8);
        es.register(e9);
        es.register(e10);

        es.display();

        es.update(6);

        es.remove(9);

        es.displaySort();

    }
    public static int empNum(){
        int min=1000, max=1999;
        int num = (int)Math.floor(Math.random()*(max-min+1)+min);
        return num;
    }

}
