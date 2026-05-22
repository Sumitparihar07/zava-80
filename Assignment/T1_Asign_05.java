package Assignment;
import java.util.*;
public class T1_Asign_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pixels = new int[n];
        for(int i = 0; i < n; i++) {
            pixels[i] = sc.nextInt();
        }
        int index = 0;
        for(int i = 0; i < n; i++) {
            if(pixels[i] != 0) {
                pixels[index] = pixels[i];
                index++;
            }
        }
        while(index < n) {
            pixels[index] = 0;
            index++;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(pixels[i] + " ");
        }
    }
}
