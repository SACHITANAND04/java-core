public class operators {
    public static void main(String[] args) {

        // Operators
        // int num1 = 10;
        // int num2 = 3;

        // System.out.println(num1 + num2);
        // System.out.println(num1 - num2);
        // System.out.println(num1 * num2);
        // System.out.println(num1 / num2);
        // System.out.println(num1 % num2);

        // Relational operators
        // System.out.println(num1 > num2);
        // System.out.println(num1 >= num2);
        // System.out.println(num1 < num2);
        // System.out.println(num1 <= num2);

        // Logical operators
        // boolean a = true;
        // System.out.println(!a);

        // int num = 7;
        // int result = num;

        // System.out.println(result);
        // System.out.println(num);

        //INCREMENT CODE
        //PRE INCREMENT

        // int num = 3;
        // int result = ++num + num++;
        
        // System.out.println(num);
        // System.out.println(result);
      
        //POST INCREMENT

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int result = num1++ + ++num2 * num3++ - --num1 + num2--;

        System.out.println(result); //12
    }
}