public class que7 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5}
        };

        int maxCols = 0;

        for (int i = 0; i < arr.length; i++) {
            maxCols = Math.max(maxCols, arr[i].length);
        }

        int[][] trans = new int[maxCols][arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < trans.length; i++) {

            for (int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + " ");
            }

            System.out.println();
        }
    }
}
