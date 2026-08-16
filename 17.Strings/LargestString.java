public class LargestString {

    public static void main(String[]args){
        String fruits[] = {"apple", "banana", "watermelon", "grape", "strawberry"};

        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }

        System.out.println("The largest string is: " + largest);

    }
}

// -----------------------------------------------------------------------------------------------------------------------


// Dry Run Table
// 🔹 Iteration 1
// i = 1
// fruits[i] = "banana"

// "apple".compareTo("banana") → negative


// ✔️ condition true
// ➡️ largest = "banana"

// 🔹 Iteration 2
// i = 2
// fruits[i] = "watermelon"

// "banana".compareTo("watermelon") → negative


// ✔️ true
// ➡️ largest = "watermelon"

// 🔹 Iteration 3
// i = 3
// fruits[i] = "grape"

// "watermelon".compareTo("grape") → positive


// ❌ false
// ➡️ largest unchanged

// 🔹 Iteration 4
// i = 4
// fruits[i] = "strawberry"

// "watermelon".compareTo("strawberry") → positive


// ❌ false
// ➡️ largest unchanged