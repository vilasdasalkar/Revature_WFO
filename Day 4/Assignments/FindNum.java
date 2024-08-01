import java.util.*;

public class FindNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();
        int count=0;
        for(int i=0;i<10;i++){
            if(num[i]==key){
                count++;
            }
            
        }
        if(count>=1){
             System.out.println("Number is present in Array ");
        }else{
            System.out.println("Number is not present in Array");
        }
    }
        
       
    }        