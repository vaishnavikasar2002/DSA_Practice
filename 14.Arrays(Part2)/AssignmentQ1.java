public class AssignmentQ1 {

    //example Qs 1
    // public static boolean containsDuplicate1(int nums[]){

    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if (nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
           
    //     }
    //     return false;
    // }

    // public static void main(String[] args) {
    //     int nums[] = {1,2,3,1};
    //     System.out.println("duplicate array = " +(containsDuplicate1(nums)));
    // }


    //example 2

    // public static boolean containsDuplicate2(int nums[]){

    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] == nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     int num[] = {1,2,3,4};
    //     System.out.println("contains Duplicate is = " + containsDuplicate2(num));
    // }


    //example 3

    public static boolean containsDuplicate3(int nums[]){

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("contains duplicate is:" +containsDuplicate3(nums));
    }
}


// dry run qs 1 same as qs 2 n 3
// Outer loop (i) iterates from 0 to nums.length - 1
//     •    Inner loop (j) starts from i + 1 and checks for duplicates. Iteration 1 (i = 0)
//     •    nums[i] = 1
//     •    Inner loop starts with j = 1
//     •    nums[0] (1) != nums[1] (2) → No duplicate
//     •    nums[0] (1) != nums[2] (3) → No duplicate
//     •    nums[0] (1) == nums[3] (1) → Duplicate found!
//     •    Return true (Exit function) 
// Final Output:
// True