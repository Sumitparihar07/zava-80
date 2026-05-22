import java.util.Scanner;
public class T2P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ids = new int[n];

        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int k = 1;
        for (int i = 1; i < n; i++) {
           if (ids[i] != ids[k - 1]) {
                ids[k] = ids[i];
                k++;
            }
        }
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(ids[i] + " ");
        }
        sc.close();
    }
}


