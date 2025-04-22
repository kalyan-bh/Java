package employ;

import java.util.*;

public class EmployeeMain {
    

public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    HashMap<Integer, Employee>  employMap=new HashMap<>();
    EmployeeMain e=new EmployeeMain();
    System.out.println("Enter no of employs");
    int n = sc.nextInt();
    for (int i=0;i<n;i++){
        System.out.println("Enter employ id,name,salary");
        int empId=sc.nextInt();
        String empName=sc.next();
        double empSalary=sc.nextDouble();
        Employee emp=new Employee(empId,empName,empSalary);
        e.add(emp,employMap);
    }

    System.out.println(e.employList(employMap));

    System.out.println("Employees list after sorting: "+e.getEmpBySalarySort(e.empList));


    //search by name
    System.out.println("Enter employ name to be searched");
    String search=sc.next();
    System.out.println(e.getEmployeesByName(employMap,search));

    //remove by id
    System.out.println("Enter employee id to be removed");
    int id=sc.nextInt();
    System.out.println(e.removeEmployee(employMap,id));

    //after removing
    System.out.println("Employee details after removing");
    System.out.println(employMap);

    System.out.println("Enter salary range: ");
    int minRange = sc.nextInt();
    int maxRange = sc.nextInt();
    System.out.println("Employees in the range are:"+countEmployeesSalaryOfGivenRange(minRange,maxRange,e.empList));

    sc.close();
}

    //for adding
    public void add(Employee em, HashMap<Integer,Employee> map){
        map.put(em.getId(),em);
    }


    //adding employees to the list from map
    ArrayList<Employee> empList=new ArrayList<>();
    public ArrayList<Employee> employList(HashMap<Integer,Employee> map){
        for(Employee e: map.values()){
            empList.add(e);
        }
        return empList;
    }

    public List<Employee> getEmpBySalarySort(ArrayList<Employee> empList){
        Collections.sort(empList, Comparator.comparing((Employee emp)->emp.getSalary()));
        return empList;
    }


    //for searching
    public List<Employee> getEmployeesByName(HashMap<Integer,Employee> map, String name){
    List<Employee> searchEmp =new ArrayList<>();
    for(Employee e: map.values()){
        if(e.getName().equals(name)){
            searchEmp.add(e);
        }
    }
    return searchEmp;
    }

    //for removing
    public boolean removeEmployee(HashMap<Integer,Employee> map,int id) {
        for (Employee e : map.values()) {
            if (e.getId() == id) {
                map.remove(e.getId());
                return true;
            }
        }
        return false;
    }

    public static int countEmployeesSalaryOfGivenRange(int minRange,int maxRange,ArrayList<Employee> empDetails)
    {
        int count =0;
        for(Employee i : empDetails)
        {
            if(i.getSalary()>=minRange && i.getSalary()<=maxRange)
            {
                count++;
            }
        }
        return count;
    }






}
