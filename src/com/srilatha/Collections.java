package com.srilatha;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

    public void demostrate(){

        Set<Employee> data = new HashSet<>();

        data.add(new Employee(1, "rajini"));
        data.add(new Employee(2, "kamal"));
        data.add(new Employee(3, "vidyuth"));
        data.add(new Employee(4, "vijay"));


        data.stream().forEach(elem-> System.out.println(elem));
Employee e = new Employee(1,"rajini");
System.out.println("new empl " + e);
        data.remove(e);
        System.out.println("============");

        data.stream().forEach(elem-> System.out.println(elem));



    }

    public static  void main(String s[]) {

      new Collections().demostrate();

    }


    class Employee{

        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Employee employee = (Employee) o;

            if (id != employee.id) return false;
            return name != null ? name.equals(employee.name) : employee.name == null;
        }

        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }

}
