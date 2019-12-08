package Programmers;

import org.omg.PortableInterceptor.INACTIVE;
import sun.font.CharToGlyphMapper;

import java.util.Scanner;
import java.util.Stack;

public class 미로탐색 {

    public static void Search(int[][] map, int n, int m, Stack<Integer> x, Stack<Integer> y) {

        map[x.peek()][y.peek()] = 2;

        /*
            동서남북 순서대로 탐색을 한다. 이때 탐색하려는 지역이 벽인 0과 이미 탐색한 구역인 2는 탐색하지 않는다.
            탐색하려는 구역은 미로 내부여야 한다.
            만약에 모든 구간을 탐색했다면 팝을 해서 전 위치로 돌아온다.
        */


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------");

        //동쪽 탐색
        if (y.peek() + 1 < m) {
            if(x.peek() == n-1 && y.peek() == m-1){
                return;
            }
            if (map[x.peek()][y.peek() + 1] != 0 && map[x.peek()][y.peek() + 1] != 2) {
                x.push(x.peek());
                y.push(y.peek() + 1);
                Search(map, n, m, x, y);
            }
        }

        // 남쪽 탐색
        if (x.peek() + 1 < n) {
            if(x.peek() == n-1 && y.peek() == m-1){
                return;
            }
            if (map[x.peek() + 1][y.peek()] != 0 && map[x.peek() + 1][y.peek()] != 2) {
                x.push(x.peek() + 1);
                y.push(y.peek());
                Search(map, n, m, x, y);
            }
        }

        //서쪽 탐색
        if (y.peek() - 1 >= 0) {
            if(x.peek() == n-1 && y.peek() == m-1){
                return;
            }
            if (map[x.peek()][y.peek() - 1] != 0 && map[x.peek()][y.peek() - 1] != 2) {
                x.push(x.peek());
                y.push(y.peek() - 1);
                Search(map, n, m, x, y);
            }
        }

        //북쪽 탐색
        if (x.peek() - 1 >= 0) {
            if(x.peek() == n-1 && y.peek() == m-1){
                return;
            }
            if (map[x.peek() - 1][y.peek()] != 0 && map[x.peek() - 1][y.peek()] != 2) {
                x.push(x.peek() - 1);
                y.push(y.peek());
                Search(map, n, m, x, y);
            }
        }

        
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        //미로 크기 설정
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        int[][] maze = new int[n][m];

        //미로 입력
        for (int i = 0; i < n; i++) {
            //한줄씩 입력
            String line = stdIn.next();
            for (int j = 0; j < m; j++) {
                //문자열을 문자로 받은뒤 정수로 변환
                maze[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        //미로 확인
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }

        //좌표축값 저장하는 스택
        Stack<Integer> x = new Stack<>();
        Stack<Integer> y = new Stack<>();

        //초기값 저장
        x.push(0);
        y.push(0);

        maze[0][0] = 2;

        Search(maze, n, m, x, y);

        System.out.println(x.size());
    }
}
