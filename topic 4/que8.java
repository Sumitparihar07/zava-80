public class que8 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 2},
                {5}
        };

        int target = 2;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}