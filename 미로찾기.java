package Programmers;

import java.util.Scanner;
import java.util.Stack;

public class 미로찾기 {

    public static int search(int[][] map, Stack<Integer> x, Stack<Integer> y, int n, int m){
        //총길이
        int len = 0;

        while(x.peek() != m && y.peek() != n){
            //동쪽 탐색
            if((map[x.peek()+1][y.peek()] != 0 || map[x.peek()+1][y.peek()] != 2) && x.peek()+1 < m){
                x.push(x.peek()+1);
                y.push(y.peek());
            }
            //남쪽 탐색
            if((map[x.peek()][y.peek()+1] != 0 || map[x.peek()][y.peek()+1] != 2) && y.peek()+1 < n){
                x.push(x.peek());
                y.push(y.peek()+1);
            }
            //서쪽 탐색
            if((map[x.peek()-1][y.peek()] != 0 || map[x.peek()-1][y.peek()] != 2) && x.peek() - 1  > m){
                x.push(x.peek()-1);
                y.push(y.peek());
            }

            //북쪽 탐색
            if((map[x.peek()][y.peek()-1] != 0 || map[x.peek()][y.peek()-1] != 2) && y.peek() - 1 > n){

                x.push(x.peek());
                y.push(y.peek()-1);
            }
            //경로가 막혔을때
            if((map[x.peek()][y.peek()+1] == 0 || map[x.peek()][y.peek()+1] == 2) &&
                    (map[x.peek()][y.peek()-1] == 0 || map[x.peek()][y.peek()-1] == 2) &&
                    (map[x.peek()+1][y.peek()] == 0 || map[x.peek()+1][y.peek()] == 2) &&
                    (map[x.peek()-1][y.peek()] == 0 || map[x.peek()-1][y.peek()] == 2)){
                map[x.peek()][y.peek()] = 2;
                x.pop();
                y.pop();
            }
        }

        len = x.size();
        return len;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        //맵 크기 설정
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        int[][] map = new int[n][m];
        String line;

        //지도 그리기
        for(int i = 0; i < n; i++){
            line = stdIn.next();
            for(int j = 0; j < m; j++){
                map[i][j] = Character.getNumericValue(line.charAt(j)); // 문자열을 문자로 받아서 정수값으로 변환
            }
        }

        //움직인 좌표 스택
        Stack<Integer> x = new Stack<Integer>();
        Stack<Integer> y= new Stack<Integer>();

        //초기값 입력
        x.push(1);
        y.push(1);

        //탐색
        int len = search(map,x,y,n,m);
        System.out.println(len);
    }
}
