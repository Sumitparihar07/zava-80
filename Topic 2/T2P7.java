import java.util.Scanner;
public class T2P7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] votes = new int[n];

        for (int i = 0; i < n; i++) {
            votes[i] = sc.nextInt();
        }
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = votes[i];
            }
            if (votes[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(candidate);
        sc.close();
    }
}


