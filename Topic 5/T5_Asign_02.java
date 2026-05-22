import java.util.*;

public class T5_Asign_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] fbed = new int[size];
        for(int i = 0; i < size; i++) {
            fbed[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int count = 0;
        for(int i= 0; i < size; i++) {
            if(fbed[i] == 0) {
                int left = (i == 0) ? 0 : fbed[i - 1];
                int right = (i == size - 1) ? 0 : fbed[i + 1];
                if(left == 0 && right == 0) {
                    fbed[i] = 1;
                    count++;
                }
            }
        }
        System.out.println(count >= n);
    }
}
