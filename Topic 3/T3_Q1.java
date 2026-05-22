import java.util.Scanner;

public class T3_Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.print("Enter number of rows : ");
        m=sc.nextInt();
        System.out.print("Enter number of columns ");
        n=sc.nextInt();

        int[][] matrix= new int [m][n];
        System.out.print("enter values : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int[][] transpose=new int[n][m];
        System.out.println("Transpose of a Matrix is : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[i][j]=matrix[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
