import java.util.*;

public class T2P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] items = new int[n];

        for (int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.put(items[i], freq.getOrDefault(items[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        sc.close();
    }
}

