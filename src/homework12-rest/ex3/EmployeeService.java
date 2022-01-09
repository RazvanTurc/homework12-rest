package homework12;

import ro.fasttrackit.curs12.homework12.ex2.Person;

import java.util.*;

public class EmployeeService {

   private final List<Employee> employees;

    public EmployeeService(Collection<Employee> employees) {
        this.employees = employees == null ?
                new ArrayList<>() :
                new ArrayList<>(employees);
    }

   // 3.1
   public List<Person> greaterSalary(int salary) {
       List<Person> result = new ArrayList<>();

       for( Employee employee : employees) {
           if(employee.getSalary() >= salary) {
               result.add(new Person(employee.getName(), employee.getAge(), employee.getHairColour()));
           }
       }
       return result;
   }

    // 3.2
   public Map<String, List<Person>> byCompany() {
       Map<String, List<Person>> result = new HashMap<>();

       for(Employee employee : employees) {
           List<Person> companyEmployees = result.get(employee.getCompany());
           if(companyEmployees == null) {
                companyEmployees = new ArrayList<>();
                result.put(employee.getCompany(), companyEmployees);
           }
           companyEmployees.add(new Person(employee.getName(), employee.getAge(), employee.getHairColour()));
       }
       return result;
   }

   // 3.3
    public long calculateAllSalaries() {
       long salaries = 0;

       for (Employee employee : employees) {
           salaries += employee.getSalary();
       }
       return salaries;
    }

    // 3.4
    public String bigBully() { // referinta din Texas Holdem
        int maxSalary = 0;
        String company = "";

        for (Employee employee : employees) {
            if(employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                company = employee.getCompany();
            }
        }
        return company;
    }
}
