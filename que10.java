import java.util.*;

public class que10 {

    static class Node {
        int r, c, d;

        Node(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 0},
                {0, 1, 0, 0},
                {0, 0}
        };

        Queue<Node> q = new LinkedList<>();

        boolean[][] visited = new boolean[grid.length][];

        for (int i = 0; i < grid.length; i++) {
            visited[i] = new boolean[grid[i].length];
        }

        q.add(new Node(0, 0, 0));
        visited[0][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            Node cur = q.poll();

            if (cur.r == grid.length - 1 &&
                cur.c == grid[grid.length - 1].length - 1) {

                System.out.println(cur.d);
                return;
            }

            for (int i = 0; i < 4; i++) {

                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (nr >= 0 &&
                    nr < grid.length &&
                    nc >= 0 &&
                    nc < grid[nr].length &&
                    grid[nr][nc] == 0 &&
                    !visited[nr][nc]) {

                    visited[nr][nc] = true;
                    q.add(new Node(nr, nc, cur.d + 1));
                }
            }
        }

        System.out.println(-1);
    }
}
