package Assignment;
import java.util.*;

public class T1_Asign_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int maxSum = nums[0];
        int currSum = nums[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for(int i = 1; i< n; i++) {
            if(currSum + nums[i] < nums[i]) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum +=nums[i];
            }
            if(currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end= i;
            }
        }
        System.out.println(maxSum);
    }
}
