
public class AssQ2SelectionSort {

    public static void selection(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        selection(arr);
        printArr(arr);
    }

}
