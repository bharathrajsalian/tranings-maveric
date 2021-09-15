package training.daytwo.streams;

import java.sql.DriverManager;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee empOne = new Employee(1,"Mani",28,150000,"Manager","IT");
        Employee empTwo = new Employee(2,"Binay",29,160000,"Senior Associate","IT");
        Employee empThree = new Employee(4,"Rahul",32,170000,"Senior Manager","Marketing");
        Employee empFour = new Employee(3,"Abhishek",24,80000,"Associate","Finance");
        Employee empFive = new Employee(5,"Rajesh",38,250000,"Director","IT");
        Employee empSix = new Employee(6,"Venkat",29,100000,"Associate","Admin");
        Employee empSeven = new Employee(4,"Ram",32,140000,"Senior Manager","Marketing");
        Employee empEight= new Employee(3,"Robert",24,110000,"Associate","Finance");

        ArrayList<Employee> emps = new ArrayList<Employee>();

        emps.add(empOne);
        emps.add(empTwo);
        emps.add(empThree);
        emps.add(empFour);
        emps.add(empFive);
        emps.add(empSix);
        emps.add(empSeven);
        emps.add(empEight);

        Map<String, List<Employee>> emp1 = emps.stream().collect(Collectors.groupingBy(Employee::getJobTitle));
        System.out.println(emp1);

        Map<String, List<Employee>> emp2 = emps.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(emp2);
//        Map<String, List<Employee>> emp3 = emps.stream().collect(Collectors.groupingBy(Employee::getDept));
//        System.out.println(emp3);
        Optional<Employee> emp4 = emps.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(emp4);

        emps.stream().filter(o -> o.getJobTitle().equals("Director")).forEach(System.out::println);

//        for (Map.Entry<String,String> entry : mapJobtitke.entrySet())
//            Optional<String> checknull= Optional.ofNullable(entry);
//    }

        Optional<List<Employee>> empList = Optional.of(new ArrayList<Employee>());

        boolean allMatch = emps.stream().anyMatch(o->o.getJobTitle().equals("Director"));
        System.out.println(" all Match - " + allMatch);

        Stream<Employee> empStream = emps.stream().filter(o->o.getDept().equals("IT"));
        System.out.println(empStream);
        empStream.anyMatch(o -> o.getJobTitle().equals("Executive"));

//        Optional<Employee> employeesOp = emps.stream().filter(o->o.getJobTitle().equals("Executive")).findAny().ifPresent(System.out::println);
//        System.out.println(employeesOp);

        Supplier<Stream<Employee>> testEmp = (Supplier<Stream<Employee>>) emps.stream().filter(o->o.getDept().equals("IT"));
        Stream<Employee> supp = testEmp.get();
    }

}
