package com.ds.coreJava.keyConcepts;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;

public class HashCode_Equals_Contract {
    public static void main(String[] args) {
        Employee anu1 = new Employee("1", "ANU", 24);
        Employee anu2 = new Employee("1", "ANU", 24);
        Employee anu3 = new Employee("1", "ANU", 24);
        HashSet<Employee> employees = new HashSet<>();
        employees.add(anu1);
        employees.add(anu2);
        employees.add(anu3);
        System.out.println(anu1.hashCode());
        System.out.println(anu2.hashCode());
        System.out.println(anu3.hashCode());
        System.out.println(employees);
    }
}

@Data
@AllArgsConstructor
class Employee {
    private String id;
    private String name;
    private Integer age;

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return age != null ? age.equals(employee.age) : employee.age == null;
    }*/

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
