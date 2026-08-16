public class PassingArray {

    // Q1 pass by value
    public static void update(int marks[]) {
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] ={56,89,64};
        update(marks);
        
        //print for marks
        for(int i=0;i<marks.length;i++){
           System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
//--------------------------------------------------------------------------------------------------------------------------------------------
    
    // Q2 pass by value
    // public static void doubleArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = arr[i] * 2; // modify array elements
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4};
    //     doubleArray(arr); // passing array to method

    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }

    // }

// ---------------------------------------------------------------------------------------------------------

    //Q1  by refrences 

    // public static void update(int marks[], int nonChangable) {
    //     nonChangable=10;
    //     for(int i=0;i<marks.length;i++){
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    // public static void main(String[] args) {
    //     int marks[] ={56,89,64};
    //     int  nonChangable=5;
    //     update(marks,nonChangable);
    //     System.out.println(nonChangable);

    //     //print for marks
    //     for(int i=0;i<marks.length;i++){
    //        System.out.print(marks[i]+" ");
    //     }
    //     System.out.println();
    // }
}


// ---------------------------------------------------------------------------------------------------------

// note

// pass by value and by refrences diff nhi samj aa raha

// 1 - Pass by Value

// A copy of the value is passed to the function.
// Changes made inside the function don’t affect the original variable.

// Example:

// void change(int a) {
//     a = 10; // only changes the copy
// }
// public static void main(String[] args) {
//     int x = 5;
//     change(x);
//     System.out.println(x); // Output: 5 (unchanged)
// }


// 2 - Pass by Reference

// The actual memory address (reference) is passed.
// Changes inside the function affect the original value.

// Java doesn’t truly have “pass by reference,” but when you pass objects or arrays, the reference value (address) is copied — so both point to the same object.

// Example - 
// void change(int[] arr) {
//     arr[0] = 10; // modifies original array
// }
// public static void main(String[] args) {
//     int[] a = {5, 6};
//     change(a);
//     System.out.println(a[0]); // Output: 10 (changed)
// }