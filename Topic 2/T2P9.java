import java.util.Scanner;
public class T2P9 {
    public static int binarySearch(int[] tail, int left, int right, int target) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (tail[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int[] tail = new int[n];
        int size = 0;
        for (int num : scores) {
            int index = binarySearch(tail, 0, size, num);
            tail[index] = num;
            if (index == size) {
                size++;
            }
        }
        System.out.println(size);
        sc.close();
    }
}