import java.util.Scanner;

public class BaekJoon_11021 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int[][] b = new int[a][2];

        for(int i = 0; i < a; i++){
            b[i][0] = stdIn.nextInt();
            b[i][1] = stdIn.nextInt();
        }

        for(int i = 0; i < a; i++){
            System.out.println("Case #"+(i+1)+": "+(b[i][0]+b[i][1]));
        }
    }
}
