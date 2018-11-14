import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreamTests {

    private Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    @Test
    public void testCollectionFilter(){
        Stream<Employee> employees = Stream.of(arrayOfEmps);
        List<Employee> newList = employees.filter(e -> e.id > 2).collect(Collectors.toList());
        System.out.println("New Size: "+ newList.size());
    }

    @Test
    public void testIncrementSalary(){
        Stream<Employee> employees = Stream.of(arrayOfEmps);
        employees.filter(e -> e.id > 1).forEach(e -> e.addSalary(300.5));
        List<Employee> employees1 = Arrays.asList(arrayOfEmps);

        employees1.forEach(emp -> System.out.println(emp.salary));
    }

    @Test
    public void testMatchingPredicates(){
        Stream<Employee> arrayOfEmps = Stream.of(this.arrayOfEmps);
        arrayOfEmps.filter(e -> e.name.equals("Bill Gates")).forEach(emp -> System.out.println(emp.name));
    }

    @Test
    public void testFindMatchingAny(){
        Stream<Employee> arrayOfEmps = Stream.of(this.arrayOfEmps);
        Assert.check(arrayOfEmps.anyMatch(e -> e.name.equals("Jeff Bezos")), "Employee Not Found");
    }

    @Test
    public void testConvertToList(){
        Stream<Employee> arrayOfEmps1 = Stream.of(arrayOfEmps);
        List<Employee> list = arrayOfEmps1.collect(Collectors.toList());
        System.out.println("Array Size : "+ arrayOfEmps.length+" Size of List : "+ list.size());
    }

    private class Employee{
        private long id;
        private String name;
        private double salary;

        public Employee(long id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public void addSalary(double additionalSalary){
            this.salary = this.salary+additionalSalary;
        }
    }
}
