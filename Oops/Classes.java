package Oops;

class Employee {
    String name;
    double salary;

    // Normal Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Constructor Called");
    }

    // Copy Constructor
    Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Copy Constructor Called");
    }

    void details() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class Classes {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 25000);
        Employee e2 = new Employee("sachit",30000);

        e1.details();
        e2.details();
        e2.name ="sachit";
    }
}



// class Methods {
//     // METHOD CREATION
//     void display() {
//         System.out.println("Hello Java");
//     }

//     public static void main(String[] args) {
//         // OBJECT CREATION
//         Methods m = new Methods();

//         // METHOD CALLING
//         m.display();
//     }
// }
