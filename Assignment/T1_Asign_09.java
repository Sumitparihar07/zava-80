package Assignment;
import java.util.Scanner;

public class T1_Asign_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int l=0,r=n - 1,lmax=0,rmax=0;
        long water=0;

        while(l<r){
            if(arr[l] < arr[r]) {
                lmax = Math.max(lmax, arr[l]);
                water += lmax - arr[l++];
            } else {
                rmax = Math.max(rmax, arr[r]);
                water += rmax - arr[r--];
            }
        }
        System.out.println(water);
    }
}
