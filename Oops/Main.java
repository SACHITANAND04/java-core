// package Oops;
//  //METHOD TOPIC

// // class Methods {
// //     void display() {
// //         System.out.println("Hello Java");
// //     }

// //     public static void main(String[] args) {
// //         Methods m = new Methods();
// //         m.display();
// //     }
// // }


//  //USER DEFINED METHOD :
// class sachit {

//     public static int add(int num1, int num2) {
//         return num1 + num2;
//     }
// }

    
    
// public class main {
//     public static void main(String[] args) {
//         System.out.println(sachit.add(100,500));
//     }
// }

//RECURSION....:


public class Main {
    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
