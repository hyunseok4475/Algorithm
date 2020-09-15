import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class 등굣길 {

    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] map = new int[m][n];
        for(int i = 0 ; i < puddles.length; i++){
            map[puddles[i][0]][puddles[i][1]] = -1;
        }
        map[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0 ; j < n; j++){
                if(map[i][j] == -1){
                    map[i][j] =0;
                    continue;
                }
                if(i != 0){
                    map[i][j] += map[i-1][j] % 1000000007;
                }
                if(j != 0){
                    map[i][j] += map[i][j-1] % 1000000007;
                }
            }
        }
        answer = map[m-1][n-1] % 1000000007;
        return answer;
    }

    public static void main(String[] args) {

    }
}
