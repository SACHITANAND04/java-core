// public class main {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 3;
//         System.out.println(num1 + num2);
//         System.out.println(num1 - num2);
//         System.out.println(num1 * num2);
//         System.out.println(num1 / num2);
//          System.out.println(num1 % num2);
//         }
// }


//RECURSION :

// public class main {
//     static void countdown(int n) {
//         if (n == 0) {
//             System.out.println("Done!");
//         } else {
//             System.out.println(n);
//             countdown(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         countdown(5);
//     }
// }


//ENUM...:


// enum Day {
//     Monday,
//     Tuesday,
//     Wednesday,
//     Thursday,
//     Friday,
//     Saturday,
//     Sunday
// }

// public class main {
//     public static void main(String[] args) {
//         Day today = Day.Friday;
//         // System.out.println(today);
//         switch(today){
//             case Monday:
//                 System.out.println("Today is Monday");
//                 break;

//                  case Tuesday:
//                 System.out.println("Today is Tuesday");
//                 break;
//                  case Wednesday:
//                 System.out.println("Today is Wednesday");
//                 break;
//                  case Thursday:
//                 System.out.println("Today is Thurday");
//                 break;
//                  case Friday:
//                 System.out.println("Today is Friday");
//                 break;
//                  case Saturday:
//                 System.out.println("Today is Saturday");
//                 break;
//                 case Sunday:
//                 System.out.println("Today is Sunday");
//                 break;
//         }
//     }
// } 

//INHERIRANCE... :
// SINGLE INHERITANCE...:

// class Account {
//     String accountHolderName;
//     double balance;

//     void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited " + amount + " in " 
//                 + accountHolderName + "'s account. New balance: " + balance);
//     }
// }

// class SavingAccount extends Account {
//     double interestRate;

//     void applyInterest() {
//         double interest = balance * interestRate / 100;
//         balance += interest;

//         System.out.println("Interest added: " + interest 
//                 + ". New balance: " + balance);
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         SavingAccount obj = new SavingAccount();

//         obj.accountHolderName = "Pravin";
//         obj.balance = 1000;

//         obj.deposit(10000);

//         obj.interestRate = 5;
//         obj.applyInterest();
//     }
// }


//MULTILEVEL INHERITANCE...:


// class Account {
//     double balance = 1000;

//     void showBalance() {
//         System.out.println("Balance: " + balance);
//     }
// }

// class Shopping extends Account {
//     void purchase() {
//         balance = balance - 500;
//         System.out.println("Purchase: 500");
//     }
// }

// class Cashback extends Shopping {
//     void getCashback() {
//         balance = balance + 50;
//         System.out.println("Cashback received: 50");
//     }
// }

// public class main {
//     public static void main(String[] args) {
//         Cashback obj = new Cashback();

//         obj.showBalance();
//         obj.purchase();
//         obj.getCashback();
//         obj.showBalance();
//     }
// }


//MULTIPLE INHERTANCE...:



// public class main {
//     public static void main(String[] args) {
//         PremiumAccount obj = new PremiumAccount();

//         obj.accountHolderName = "Pratik Patil";
//         obj.deposit(1500);

//         obj.cashbackRate = 5;
//         obj.applyCashback();
//     }
// }

// class Account {
//     String accountHolderName;
//     double balance;

//     void deposit(double amount) {
//         balance += amount;

//         System.out.println("Deposited " + amount
//                 + " in " + accountHolderName
//                 + " account. New balance is " + balance);
//     }
// }

// class SavingAccount extends Account {
//     double interestRate;

//     void applyInterest() {
//         double interest = balance * interestRate / 100;
//         balance += interest;

//         System.out.println("Interest added: " + interest
//                 + ". New balance is " + balance);
//     }
// }

// class PremiumAccount extends Account {
//     double cashbackRate;

//     void applyCashback() {
//         double cashback = balance * cashbackRate / 100;
//         balance += cashback;

//         System.out.println("Cashback added: " + cashback
//                 + ". New balance is " + balance);
//     }
// }


//HIERARCHICAL INHERITANCE...:

// public class main {
//     public static void main(String[] args) {

//         SavingAccount s = new SavingAccount();
//         s.accountHolderName = "Pratik";
//         s.deposit(1500);
//         s.interestRate = 5;
//         s.applyInterest();

//         System.out.println("----------------");

//         PremiumAccount p = new PremiumAccount();
//         p.accountHolderName = "Rahul";
//         p.deposit(2000);
//         p.cashbackRate = 10;
//         p.applyCashback();
//     }
// }

// class Account {
//     String accountHolderName;
//     double balance;

//     void deposit(double amount) {
//         balance += amount;
//         System.out.println("Name: " + accountHolderName);
//         System.out.println("Balance: " + balance);
//     }
// }

// class SavingAccount extends Account {
//     double interestRate;

//     void applyInterest() {
//         double interest = balance * interestRate / 100;
//         balance += interest;
//         System.out.println("Interest: " + interest);
//         System.out.println("Final Balance: " + balance);
//     }
// }

// class PremiumAccount extends Account {
//     double cashbackRate;

//     void applyCashback() {
//         double cashback = balance * cashbackRate / 100;
//         balance += cashback;
//         System.out.println("Cashback: " + cashback);
//         System.out.println("Final Balance: " + balance);
//     }
// }

// class CurrentAccount extends Account {
//     double overdraftlimit;
//     void withdraw(double amount){

//         if (amount <= overdraftlimit + balance ){
//             balance -= amount;
//             System.out.println(accountHolderName + "account. New balance is " + balance);
//         }else{
//             System.out.println("Overdraft limit exced !!");
//         }
//     }
// }


//POLYMORPHISM...:
// 1.COMPILE TIME POLYMORPHISM...:
// a.METHOD OVERLOADING..:


// public class main {

//     public static void main(String[] args) {

//         Calculator obj = new Calculator();

//         System.out.println(obj.add(10, 10));
//         System.out.println(obj.add(10, 10, 10));
//         System.out.println(obj.add(10.5, 20.5));

//         obj.add(10, 10);
//         obj.add(10, 20);
//     }
// }

// class Calculator {

//     public int add(int a, int b) {
//         return a + b;
//     }

//     public int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     public double add(double a, double b) {
//         return a + b;
//     }
// }

//b.METHOD OVERRIDNG..:
// public class main {
//     public static void main(String[] args){
//         Calculator obj = new Calculator();

//         System.out.println(obj.add(10,10));
//         System.out.println(obj.add(10,10,10,10,10));
//         System.out.println(obj.add(10,10,10,10,10,10,10));
//         System.out.println(obj.add(10,10,10,10,10,10,10,10,10,10));
//     }

// }
// class Calculator {
//     public int add(int...numbers){
//         int sum = 0;
//         for(int num : numbers){
//             sum += num;
//         }
//         return sum;
//     }
// }




// public class main {
//     public static void main(String[] args) {

//         FullTimeEmployee obj = new FullTimeEmployee();
//         obj.baseSalary = 100;
//         obj.name = "Pratik";
//         obj.bonus = 300;
//         obj.CalculateSalary();
//         obj.showDetails();

//         PartTimeEmployee p = new PartTimeEmployee();
//         p.name = "Rahul";
//         p.baseSalary = 200;
//         p.hours = 5;
//         p.CalculateSalary();
//         p.showDetails();
//     }
// }

// class Employee {
//     String name;
//     double baseSalary;

//     public double CalculateSalary() {
//         return baseSalary;
//     }

//     public void showDetails() {
//         System.out.println("Employee: " + name +
//                 ", Salary: " + CalculateSalary());
//     }
// }

// class FullTimeEmployee extends Employee {
//     double bonus;

//     @Override
//     public double CalculateSalary() {
//         return baseSalary + bonus;
//     }

//     @Override
//     public void showDetails() {
//         System.out.println("Employee: " + name +
//                 ", Salary: " + CalculateSalary());
//     }
// }

// class PartTimeEmployee extends Employee {
//     int hours;

//     @Override
//     public double CalculateSalary() {
//         return baseSalary * hours;
//     }

//     @Override
//     public void showDetails() {
//         System.out.println("Part-Time Employee: " + name +
//                 ", Salary: " + CalculateSalary());
//     }
// }



// public class main {
//     public static void main(String[] args) {

//         Employee e1;

//         e1 = new FullTimeEmployee();
//         e1.calculateSalary();
//         e1.showDetails();

//         e1 = new PartTimeEmployee();
//         e1.calculateSalary();
//         e1.showDetails();

//         e1 = new TemporaryEmployee();
//         e1.calculateSalary();
//         e1.showDetails();
//     }
// }

// class Employee {
//     double salary = 10000;
//     String name = "Pratik";

//     void calculateSalary() {
//         System.out.println("Salary: " + salary);
//     }

//     void showDetails() {
//         System.out.println("Employee: " + name);
//     }
// }

// class FullTimeEmployee extends Employee {
//     double bonus = 3000;

//     @Override
//     void calculateSalary() {
//         salary = salary + bonus;
//     }

//     @Override
//     void showDetails() {
//         System.out.println("Full-Time Employee: " + name);
//         System.out.println("Salary: " + salary);
//     }
// }

// class PartTimeEmployee extends Employee {
//     int hours = 5;
//     double rate = 200;

//     @Override
//     void calculateSalary() {
//         salary = hours * rate;
//     }

//     @Override
//     void showDetails() {
//         System.out.println("Part-Time Employee: " + name);
//         System.out.println("Salary: " + salary);
//     }
// }

// class TemporaryEmployee extends Employee {
//     double payment = 5000;

//     @Override
//     void calculateSalary() {
//         salary = payment;
//     }

//     @Override
//     void showDetails() {
//         System.out.println("Temporary Employee: " + name);
//         System.out.println("Salary: " + salary);
//     }
// }



//ABSTRACTION METHOD...:
//INTERFACES..:



// abstract class Car{
//     abstract void start();
// }

// class BMW extends Car{
//     void start(){
//         System.out.println("BMW starts with a button");
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         BMW b = new BMW();
//         b.start();
//     }
// }


public class main {
    public static void main(String[] args) {
        Vehicle obj;
        obj = new Bike();
        obj.noOfWheels = 2;
        obj.displayTyre();
        obj.start();

        obj = new Car();
        obj.noOfWheels = 4;
        obj.displayTyre();
        obj.start();
        
    }
}

abstract class Vehicle{
    int noOfWheels;

    void displayTyre(){
        System.out.println("Vehicle has" + noOfWheels + "tyres");
    }
    abstract void start();
}

class Car extends Vehicle {
    void start(){
        noOfWheels = 4;
        System.out.println("Car Start With Key");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike Start With Kick");
    }
}