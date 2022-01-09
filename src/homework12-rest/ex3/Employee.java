package homework12;

import ro.fasttrackit.curs12.homework12.ex2.Person;

import java.util.Objects;

// 3.0
public class Employee extends Person {
    private final int salary;
    private final String company;

    public Employee(String name, int age, String hairColour, int salary, String company) {
        super(name, age, hairColour);
        this.salary = salary;
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && company.equals(employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, company);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary: " + salary +
                " company: " + company + '\'' +
                '}';
    }
}
