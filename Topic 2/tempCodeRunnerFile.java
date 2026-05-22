import java.util.Scanner;
public class T2P1 {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         int[] nums = new int[n];
         int [] result = new int[n];

         for (int i = 0; i < n; i++) {
             nums[i] = sc.nextInt();
         }
         int sum = 0;
         for(int i = 0; i< n ; i++){
             sum += nums[i];
             result[i] = sum;
         }
         for (int i = 0;i < n ; i++){
            System.out.print(result[i] + " ");
         }
         sc.close();
     }
}