
// package Oops;

// class Dog {
//     String name = "Rocky";

//     void bark() {
//         System.out.println(name + " Bark!!!");
//     }
// }

// class Constructor {
//     public static void main(String[] args) {
//         Dog obj = new Dog();
//         obj.bark();
//     }
// }


//DEFAULT CONSTRUCTOR



// package Oops;

// class Dog {
//     Dog() {
//         System.out.println("Constructor Called...");
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         Dog obj = new Dog();
//     }
// }


//PARAMETERIZED CONSTRUCTOR :

package Oops;

 
class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sachin", 21);
        Student s2 = new Student("Rahul", 22);

        s1.display();
        s2.display();
    }
}

