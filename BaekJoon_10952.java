import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_10952 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        do{
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }while(x.get(x.size()-1) != 0 && y.get(y.size()-1) != 0);

        for(int i = 0; i < x.size()-1; i++){
            System.out.println(x.get(i) + y.get(i));
        }
    }
}
