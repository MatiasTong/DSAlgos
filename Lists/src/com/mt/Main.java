package com.mt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Array List have a default capacity of ten, see add implementation
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mary", "Smith", 25));

        employeeList.forEach(employee -> System.out.println(employee));

        //constant time because array is actually backing the Array List so random access is O(1)
        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());

        //also constant time O(1)
        employeeList.set(1, new Employee("John", "Adams", 4568));
        System.out.println(employeeList.size());

        //you can also add at a specified position, worst case is O(n) linear time
        employeeList.add(1, new Employee("John", "Adams", 4568));

        Object[] employeeArray1 = employeeList.toArray();
        System.out.println(employeeArray1);

        //declaring an array of a certain length
        int[] array = new int[20];

        //to array takes in as argument the array to store the values in, the reverse to change an array to a list use
        //Arrays.asList(intArray)
        Employee[] employeeArray2 = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray2){
            System.out.println(employee);
        }
        //this prints our false because it is comparing the instances,
        // they are structurally the same but are two different instances
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Adams", 4568)));

        //array lists are backed by an array and good for random access or iterating though list, are not so good for
        // inserting (except at the end),removing, or accessing item in the list if you don't have an index
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
