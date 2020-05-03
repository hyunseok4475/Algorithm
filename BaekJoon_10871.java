import java.util.Scanner;

public class BaekJoon_10871 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int[] list = new int[a];

        for(int i = 0; i < a; i++){
            list[i] = stdIn.nextInt();
        }

        for(int i =0; i < a; i++){
            if(list[i] < b){
                System.out.print(list[i]);
                System.out.print(" ");
            }
        }
    }
}
