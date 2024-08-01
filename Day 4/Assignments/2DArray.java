import java.util.Scanner;

public class 2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[][] array = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

      
    }
}
