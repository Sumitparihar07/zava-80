import java.util.*;
public class T1_Asign_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = new int[n];
        for(int i = 0; i<n; i++){
            temp[i]=sc.nextInt();
        }
        int min = temp[0];
        int max = temp[0];
        for(int i =1; i<n; i++){
            if(temp[i]<min){
                min = temp[i];
            }
            if(temp[i]>max) {
                max = temp[i];
            }
        }
        System.out.println("max = "+max+" ,min = "+min);
    }
}
