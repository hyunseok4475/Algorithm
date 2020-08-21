import java.util.Scanner;

public class BaekJoon_10809 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int[] alphabet = new int[26];

        for(int i = 0; i < alphabet.length; i++){
            alphabet[i] = -1;
        }

        String word = stdIn.next();

        for(int asc = 97; asc <= 122; asc++){
            for(int i = 0; i < word.length(); i++){
                if(asc == word.charAt(i)){
                    if(alphabet[asc-97] == -1){
                        alphabet[asc-97] = i;
                    }
                    if(alphabet[asc-97] > i){
                        alphabet[asc-97] = i;
                    }
                }
            }
        }

        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i]+" ");
        }

    }
}
