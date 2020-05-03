import java.util.Scanner;

public class BaekJoon_1110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum;
        int result = a;
        int cycle = 0;
        int f,s;

        do{
            sum = result % 10 + result / 10;

            f = result % 10;
            s = sum % 10;

            result = f*10 + s;
            cycle++;
        }while(result != a);

        System.out.print(cycle);
    }
}
