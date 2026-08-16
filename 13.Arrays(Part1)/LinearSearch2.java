//self practice code for linear search in java

public class LinearSearch2 {

    public static void linearsearchEx(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("key is fount at index: " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        int arr[] = {10, 25, 30, 45};

        int key = 30;

        linearsearchEx(arr, key);

    }
}
