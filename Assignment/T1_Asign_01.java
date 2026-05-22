package Assignment;
import java.util.*;
public class T1_Asign_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for(int i = 0; i<n; i++){
            price[i]=sc.nextInt();
        }
        int min = price[0];
        int profit = 0;
        for(int i = 1; i<price.length; i++){
            if(price[i]<min){
                min = price[i];
            }
            if(price[i] - min > profit){
                profit = price[i] - min;
            }
        }
        System.out.println(profit);
    }
}
