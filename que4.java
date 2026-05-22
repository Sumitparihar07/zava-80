import java.util.Scanner;

public class que4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int cols = sc.nextInt();

            arr[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int overallMax = Integer.MIN_VALUE;
        int rowPos = 0;
        int colPos = 0;

        for (int i = 0; i < arr.length; i++) {

            int rowMax = Integer.MIN_VALUE;

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > rowMax) {
                    rowMax = arr[i][j];
                }

                if (arr[i][j] > overallMax) {
                    overallMax = arr[i][j];
                    rowPos = i;
                    colPos = j;
                }
            }

            System.out.println("Row " + i + " Max = " + rowMax);
        }

        System.out.println("Overall Max = " + overallMax);
        System.out.println("Position = (" + rowPos + "," + colPos + ")");

        sc.close();
    }
}
