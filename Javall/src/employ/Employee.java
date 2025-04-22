package employ;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){}

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id=id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
