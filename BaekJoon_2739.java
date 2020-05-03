import java.util.Scanner;

public class BaekJoon_2739 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();

        for(int i = 1; i<=9; i++){
            System.out.println(a + " * " + i + " = "+a*i);
        }
    }
}
