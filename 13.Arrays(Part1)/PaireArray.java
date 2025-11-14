
public class PaireArray {

    public static void print_paires(int number[]) {
        int tp = 0; //calculate for total paire
        for (int i = 0; i < number.length; i++) {
            int curr = number[i]; //2,4,6,8,10/2,4,6,8,10
            for (int j = i + 1; j < number.length; j++) { //2 =(i+1)(0+1)= start index 1 pasun
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }

    
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        print_paires(number);
    } 
}

