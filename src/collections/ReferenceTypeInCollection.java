package collections;

import java.util.LinkedList;

public class ReferenceTypeInCollection {
    public static void main(String[] args) {
        LinkedList<Employee> emps = new LinkedList<>();
        emps.add(new Employee(1, "Jane", 18));
        emps.add(new Employee(2, "Ronald", 17));
        emps.add(new Employee(3, "Edmund", 18));

        for(Employee e:emps){
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println();
        }
    }
}
