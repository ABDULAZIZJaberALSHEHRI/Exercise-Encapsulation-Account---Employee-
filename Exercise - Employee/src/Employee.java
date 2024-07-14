public class Employee {
    private String id;
    private String name;
    private static int salary;
    private static double annualSalary;
    public Employee(){

    }
    public Employee (String id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAnnualSalary(int AnnualSalary){
        this.annualSalary=annualSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary(){
        annualSalary = salary*12;
        return (int) annualSalary;
    }

    public static double raisedSalary(double precent){
        annualSalary = annualSalary*precent;
        salary = (int) (annualSalary+salary);
        return salary;
    }

    @Override
    public String toString() {

        return "Name: "+name +"\n"+ "ID: "+id+"\nSalary: "+salary+"\nAnnual salary: "+annualSalary;
    }
}
