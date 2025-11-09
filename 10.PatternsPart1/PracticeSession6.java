public class PracticeSession6 {

    // QS1
    // public static void main(String[] args) {

    //     for (int i = 1; i <= 4; i++) {
    //         for (int j = 1; j <= 5; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // QS2
    // public static void main(String[] args) {
    //     int n = 5;
    //     int m = 3;
    //     int num = 1;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= m; j++) {
    //             System.out.print(num + " ");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

    // OR
    // public static void main(String[] args) {
    //     int num = 1;
    //     for (int i = 1; i <= 5; i++) {
    //         for (int j = 1; j <= 3; j++) {
    //             System.out.print(num + " ");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

    // QS3
    // public static void main(String[] args) {
    //     for (int i = 1; i <= 5; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // QS4
    // public static void main(String[] args) {
    //     int n = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= (n - i + 1); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // OR
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println(" ");
    //     }
    // }

    // Qs5
    // public static void main(String[] args) {
    //     int n = 6;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = 1; i <= 5; i++) {
    //         for (int j = i; j <= (n - 1); j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // QS6
    // public static void main(String[] args) {
    //     int n = 5;
    //     int m = 5;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= m; j++) {
    //             if (i == 1 || i == n || j == 1 || j == m)
    //                 System.out.print("*");
    //             else
    //                 System.out.print(" ");

    //         }
    //         System.out.println();

    //     }
    // }

    // QS7 Home work
    // public static void main(String[] args) {
    //     int n = 5;
    //     int num = 1;
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = i; j <= n - 1 + 1; j++) {

    //             System.out.print(num);
    //             num++;
    //         }
    //         System.out.println();
    //     }

    // }

    // QS 8 home work
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
