import java.util.*;

public class bubbleSort2 {
    
    public static void bubbleSortingEx2(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length - 1 ; j++) {
                if (arr[j] < arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSortingEx2(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}




