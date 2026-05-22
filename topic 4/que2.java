public class que2 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2},
                {3, 4, 5},
                {6}
        };

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            result[i] = sum;
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

