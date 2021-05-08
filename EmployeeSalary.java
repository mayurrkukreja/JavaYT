/*
 * Practice Session - Module 05
 * 
 * Problem stament - Write a java program to display the employee details of all
 * the employees having salary > 35000 Access Data from private variables using
 * constructor.
 * 
 */
class Employee {
    private int id;
    private String name;
    private float salary;

    Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary; 
    }

    //Getters
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    float getSalary() {
        return this.salary;
    }

    //display
    void display() {
        System.out.println("Employee Details Having salary > 35K : ");
        System.out.println("Name : " +name);
        System.out.println("ID -> " +id);
        System.out.println("Salary = " +salary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        int id[] = {1, 2, 3, 4, 5};
        String name[] = {"Jonas", "Mikkel", "Martha", "Joey", "Phoebe"};
        float salary[] = {50000, 40000, 30000, 25000, 55000};

        Employee employee[] = new Employee[5];

        for(int i = 0; i<employee.length; i++) {
            employee[i] = new Employee(id[i], name[i], salary[i]);
        }

        for(int i = 0; i<employee.length; i++) {
            if(employee[i].getSalary()>35000) {
                employee[i].display();
            }
        }
    }
}