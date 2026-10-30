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


// public class main {
//     public static void main(String[] args) {
//         Vehicle obj;
//         obj = new Bike();
//         obj.noOfWheels = 2;
//         obj.displayTyre();
//         obj.start();

//         obj = new Car();
//         obj.noOfWheels = 4;
//         obj.displayTyre();
//         obj.start();
        
//     }
// }

// abstract class Vehicle{
//     int noOfWheels;

//     void displayTyre(){
//         System.out.println("Vehicle has" + noOfWheels + "tyres");
//     }
//     abstract void start();
// }

// class Car extends Vehicle {
//     void start(){
//         noOfWheels = 4;
//         System.out.println("Car Start With Key");
//     }
// }
// class Bike extends Vehicle{
//     void start(){
//         System.out.println("Bike Start With Kick");
//     }
// }


//INTERFACES..:

// public class main {
//     public static void main(String[] args) {
//         Car c = new BMW();

//         c.start();
//         c.stop();
//     }
// }

// interface Car {
//     void start();
//     void stop();
// }

// class BMW implements Car {

//     public void start() {
//         System.out.println("Car is starting..");
//     }

//     public void stop() {
//         System.out.println("Car is stopping..");
//     }
// }


//SCANNER...:

// import java.util.Scanner;

// public class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your name:");
//         String name = sc.nextLine();

//         System.out.println("Your name is:" +name);
//         sc.close();


//         System.out.println("Enter your age:");
//         int age = sc.nextInt();

//         System.out.println("your age is : " + age);

//         sc.close();

//         System.out.println("Enter your salary:");
//         double salary = sc.nextDouble();

//         System.out.println("Your salary is: " + salary);
//         sc.close();
//     }
// }


//DATE: 24OCT 2026 
//INTERFACE ABOUT PAYMENT METHOD..:

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         PaymentService service = new PaymentService();

//         System.out.println(" PAYMENT SYSTEM");
//         System.out.println("1. Credit Card");
//         System.out.println("2. UPI");
//         System.out.println("3. Net Banking");

//         System.out.print("Choose payment method: ");
//         int choice = sc.nextInt();

//         System.out.print("Enter amount: ");
//         double amount = sc.nextDouble();
//         sc.nextLine();

//         switch (choice) {

//             case 1:
//                 CreditCardPayment card = new CreditCardPayment();

//                 System.out.print("Enter card number: ");
//                 card.cardNumber = sc.nextLine();

//                 service.makePayment(card, amount);
//                 break;

//             case 2:
//                 UpiPayment upi = new UpiPayment();

//                 System.out.print("Enter UPI ID: ");
//                 upi.upiId = sc.nextLine();

//                 service.makePayment(upi, amount);
//                 break;

//             case 3:
//                 NetBankingPayment bank = new NetBankingPayment();

//                 System.out.print("Enter bank name: ");
//                 bank.bankName = sc.nextLine();

//                 service.makePayment(bank, amount);
//                 break;

//             default:
//                 System.out.println("Invalid payment choice!");
//         }

//         sc.close();
//     }
// }

// interface IPayment {
//     void paymentProcess(double amount);
//     void generateReceipt();
// }

// class CreditCardPayment implements IPayment {
//     String cardNumber;

//     public void paymentProcess(double amount) {
//         System.out.println("Processing Credit Card Payment: Rs. " + amount);
//         System.out.println("Card Number: " + cardNumber);
//         System.out.println("Payment Successful!");
//     }

//     public void generateReceipt() {
//         System.out.println("Credit Card Receipt Generated.");
//     }
// }

// class UpiPayment implements IPayment {
//     String upiId;

//     public void paymentProcess(double amount) {
//         System.out.println("Processing UPI Payment: Rs. " + amount);
//         System.out.println("UPI ID: " + upiId);
//         System.out.println("Payment Successful!");
//     }

//     public void generateReceipt() {
//         System.out.println("UPI Receipt Generated.");
//     }
// }

// class NetBankingPayment implements IPayment {
//     String bankName;

//     public void paymentProcess(double amount) {
//         System.out.println("Processing Net Banking Payment: Rs. " + amount);
//         System.out.println("Bank: " + bankName);
//         System.out.println("Payment Successful!");
//     }

//     public void generateReceipt() {
//         System.out.println("Net Banking Receipt Generated.");
//     }
// }

// class PaymentService {
//     void makePayment(IPayment payment, double amount) {
//         payment.paymentProcess(amount);
//         payment.generateReceipt();
//     }
// }



//ACCESS MODIFIERS...:
//PUBLIC CLASS..:

// public class main{
//     public static void main(String[] args){
//         Student S = new Student();
      
//         S.name = "Ambikaa";
//         S.display();
//     }
// }

// class Student{
//     public String name;
//     public void display(){
//         System.out.println("Name : " + name);
//     }
// }


// PRIVATE ACCESS MODIFIERS..:
// public class main{
//     public static void main(String[] args){
//         Student S = new Student();

//         S.display();
//     }
// }

// class Student{
//     private int age = 21;
//     public void display(){
//         System.out.println("Age:" + age);
//     }
// }


//PROTECTED ACCESS MODIFIERS..:

// public class main{
//     public static void main(String[] args){
//         Student S = new Student();
//         S.display();
//     }
// }

// class person{
//     protected String name = "Ambikaa";
// }

// class Student extends person{
//     public void display(){
//         System.out.println("Name :" + name);
//     }
// }


//DEFAULT ACCESS MODIFIERS..:

// public class main {
//     public static void main(String [] args){
//         Student S = new Student();
//         S.display();

//     }
// }

// class Student{
//     int age = 21;
//     void display(){
//         System.out.println("Age :" + age);
//     }
// }



//DATE : 27 OCT 2026..:
//ENCAPSULATION..:
//Learned Encapsulation in Java using BankAccount..:

// public class main {
//     public static void main(String[] args) {

//         BankAccount obj = new BankAccount("12345", 1000);

//         obj.deposit(1000);
//         obj.withdraw(1050);

//         System.out.println("Account Number: " + obj.getAccountNumber());
//         System.out.println("Final Balance: " + obj.getBalance());
//     }
// }

// class BankAccount {
//     private double balance;
//     private String accountNumber;

//     public BankAccount(String accountNumber, double balance) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }

//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Insufficient balance!");
//         }
//     }
// }


//DATE: 29 OCT 2026..

//WRAPPER CLAASES...:

// public class main{
//     public static void main(String[] args){
//         int num = 100;
//         Integer wnum = Integer.valueOf(num);

//         String age = "100";
//         int res = Integer.parseInt(age);
//         System.out.println(res);
//         System.out.println(wnum);


//     }
// }


//STRING...:
//STRING CONCATENATION..:

// public class main{
//     public static void main(String[] args) {
//         String str = "Sachit";
//         str.concat("Ambulgekar");
//         System.out.println(str.concat("Ambulgekar"));
//     }
// }


 //STRING METHODS..:

 public class main {
    public static void main(String[] args) {
        String name = "  sachit";

        // System.out.println(name.charAt(2));
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.trim());

        // System.out.println(name.length());

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('a', 'o'));

        System.out.println(name.startsWith("tr"));


        String s = "Geeks for Geeks";
        String[] arr = s.split(" ");
        for(String str : arr){
        System.out.println(str);
        }
    }
}