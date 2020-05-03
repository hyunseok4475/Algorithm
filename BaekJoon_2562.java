import java.util.Scanner;

public class BaekJoon_2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] b = new int[9];
        int max = 0, cnt = 0;
        for(int i = 0; i < 9; i++){
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < 9; i++){
            if(b[i] > max){
                max = b[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}
