import java.util.List;
import java.util.Scanner;

public class BaekJoon_1152 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String words = stdIn.nextLine();

        int word = 0;
        boolean flag = true;

        for (int i = 0; i < words.length(); i++) {
            if(words.charAt(i) == ' '){
                flag = true;
            }
            else{
                if(flag == true){
                    word++;
                    flag = false;
                }
            }
        }

        System.out.println(word);
    }
}
