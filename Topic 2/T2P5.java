import java.util.Scanner;
public class T2P5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] belt = new int[n];

        for (int i = 0; i < n; i++) {
            belt[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        d = d % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = belt[(i + d) % n];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}





