import java.util.Scanner;

public class BaekJoon_1316 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();
        String[] words = new String[num];

        for(int i = 0; i < num; i++){
            words[i] = stdIn.next();
        }

        int cnt = 0;

        for(int i = 0; i < num; i++){

            char[] alphabet = new char[26];
            boolean flag = true;

            for(int j = 1; j < words[i].length(); j++){
                if(alphabet[words[i].charAt(j)-'a'] != 0) flag = false;
                if(words[i].charAt(j-1) != words[i].charAt(j))
                    alphabet[words[i].charAt(j-1)-'a']++;
            }

            if(flag == true) cnt++;
        }

        System.out.println(cnt);
    }
}
