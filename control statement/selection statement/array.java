
public class array {
    public static void main(String[] args) {
        int[] num = {10, 20, 30};
 
        int arr[] = new int[5];

        arr[0] = 20;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 10;

        System.out.println(arr.length);

        for (int value : arr) {
            System.out.println(value);
        }
    }
}
