import java.util.Scanner;

public class BaekJoon_1157 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        Integer[] alphabet = new Integer[26];

        for(int i = 0; i < 26; i++){
            alphabet[i] = 0;
        }

        String word = stdIn.next();

            for(int i = 0; i < word.length(); i++) {
                char C = word.charAt(i);
                C = Character.toUpperCase(C);
                alphabet[(int)C - 'A']++;
            }

        Integer max = -1;
        int locate = -1;
        boolean wrongFlag = false;

        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i].equals(max)){
                if(max == 0){
                    continue;
                }
                else{
                    wrongFlag = true;
                }
            }
            else if(alphabet[i] >= max){
                max = alphabet[i];
                locate = i;
                wrongFlag = false;
            }

        }

        if(wrongFlag == true){
            System.out.print("?");
        }
        else{
            locate += 'A';
            System.out.print((char)locate);
        }

    }
}
