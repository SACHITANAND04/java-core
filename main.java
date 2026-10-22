public class main {
    public static void main(String[] args) {

        Employee e1;

        e1 = new FullTimeEmployee();
        e1.calculateSalary();
        e1.showDetails();

        e1 = new PartTimeEmployee();
        e1.calculateSalary();
        e1.showDetails();

        e1 = new TemporaryEmployee();
        e1.calculateSalary();
        e1.showDetails();
    }
}

class Employee {
    double salary = 10000;
    String name = "Pratik";

    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    void showDetails() {
        System.out.println("Employee: " + name);
    }
}

class FullTimeEmployee extends Employee {
    double bonus = 3000;

    @Override
    void calculateSalary() {
        salary = salary + bonus;
    }

    @Override
    void showDetails() {
        System.out.println("Full-Time Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hours = 5;
    double rate = 200;

    @Override
    void calculateSalary() {
        salary = hours * rate;
    }

    @Override
    void showDetails() {
        System.out.println("Part-Time Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}

class TemporaryEmployee extends Employee {
    double payment = 5000;

    @Override
    void calculateSalary() {
        salary = payment;
    }

    @Override
    void showDetails() {
        System.out.println("Temporary Employee: " + name);
        System.out.println("Salary: " + salary);
    }
}
