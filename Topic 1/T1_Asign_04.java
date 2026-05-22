import java.util.*;

public class T1_Asign_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > largest){
                secondlargest = largest;
                largest = arr[j];
            }
            else if(arr[j]> secondlargest && arr[j] !=largest){
                secondlargest = arr[j];
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(secondlargest);
        }
    }
}
