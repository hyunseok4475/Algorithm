import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_5543 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int burger[] = new int[3];
        int drink[] = new int[2];

        for(int i = 0; i< burger.length; i++) burger[i] = sc.nextInt();
        for(int i = 0; i< drink.length; i++) drink[i] = sc.nextInt();

        Arrays.sort(burger);
        Arrays.sort(drink);

        System.out.println(burger[0]+drink[0]-50);

    }
}
