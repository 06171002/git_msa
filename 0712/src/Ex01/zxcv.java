package Ex01;

import java.util.Arrays;

public class zxcv {

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int SIZE = board.length;
        boolean[][] visit = new boolean[SIZE][SIZE];
        int[] dx = {1,0,-1,0,1,1,-1,-1};
        int[] dy = {0,1,0,-1,1,-1,1,-1};
        int nx,ny,x,y;

        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(visit[i],true);
        }

        for(int i = 0; i< SIZE; i++){
            for(int j = 0; j <SIZE;j++){
                if(board[i][j]==1) {
                    x = j;
                    y = i;
                    visit[y][x] = false;
                    for(int k = 0; k<8; k++) {
                        nx = x + dx[k];
                        ny = y + dy[k];
                        if(nx>=0 && ny>=0 && nx < SIZE && ny< SIZE){
                            visit[ny][nx] = false;
                        }
                    }
                }
            }
        }

        for (boolean[] e : visit)
            System.out.println(Arrays.toString(e));
    }
}
