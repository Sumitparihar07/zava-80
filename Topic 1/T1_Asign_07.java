import java.util.*;

public class T1_Asign_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for(int i = 1; i < n; i++) {
            if(num[i] == num[i - 1]) {
                System.out.print(num[i] +" ");
            }
        }
    }

}
