import java.util.Scanner;
public class T2P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] codes = new int[n];

        for (int i = 0; i < n; i++) {
            codes[i] = sc.nextInt();
        }
        boolean isSorted = true;

        for (int i = 1; i < n; i++) {
            if (codes[i] < codes[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
        sc.close();
    }
}





