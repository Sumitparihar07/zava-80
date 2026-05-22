package Assignment;
import java.util.*;
public class T1_Asign_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] songs = new int[n];
        for(int i = 0; i<n; i++){
            songs[i]=sc.nextInt();
        }
        int start = 0;
        int end = n - 1;
        while(start < end){
            int temp = songs[start];
            songs[start] = songs[end];
            songs[end] = temp;

            start++;
            end--;
        }
        for(int i =0; i<n; i++) {
            System.out.print(songs[i]+" ");
        }
    }
}
