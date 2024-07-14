//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Employee 1:");
        Employee employee1 = new Employee();
        employee1.setId("1001");
        employee1.setName("Abdulaziz Alshehri");
        employee1.setSalary(10000);
        employee1.setAnnualSalary(employee1.getAnnualSalary());

        System.out.println(employee1.toString());
        System.out.println("Raised salary: "+Employee.raisedSalary(0.005));

        System.out.println("===============================================================");

        //Employee 2 ------------------------------------------------------------------------
        System.out.println("\nEmployee 2:");
        Employee employee2 = new Employee();
        employee2.setName("Khalid Alzahrani");
        employee2.setId("1002");
        employee2.setSalary(12000);
        employee2.setAnnualSalary(employee2.getAnnualSalary());

        System.out.println(employee2.toString());
        System.out.println("Raised salary: "+Employee.raisedSalary(0.005));

        System.out.println("===============================================================");

        //Employee 3 ------------------------------------------------------------------------
        System.out.println("\nEmployee 3:");
        Employee employee3 = new Employee();
        employee3.setName("Ali Alqarni");
        employee3.setId("1003");
        employee3.setSalary(9000);
        employee3.setAnnualSalary(employee3.getAnnualSalary());

        System.out.println(employee3.toString());
        System.out.println("Raised salary: "+Employee.raisedSalary(0.005));



        System.out.println("===============================================================");


    }
}