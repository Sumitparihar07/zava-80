import java.util.*;

public class T5_Asign_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            total += nums[i];
        }
        int lsum = 0;
        int pivot = -1;
        for(int i = 0; i < n; i++) {
            int rsum = total - lsum - nums[i];
            if(lsum == rsum) {
                pivot = i;
                break;
            }
            lsum += nums[i];
        }
        System.out.println(pivot);
    }
}
