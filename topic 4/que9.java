public class que9 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 0, 0},
                {-1, 0, 3}
        };

        int[][] B = {
                {7, 0, 0},
                {0, 0, 0},
                {0, 0, 1}
        };

        int[][] C = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {

            for (int k = 0; k < A[0].length; k++) {

                if (A[i][k] != 0) {

                    for (int j = 0; j < B[0].length; j++) {

                        if (B[k][j] != 0) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }
            }
        }

        for (int[] row : C) {

            for (int x : row) {
                System.out.print(x + " ");
            }

            System.out.println();
        }
    }
}
