import java.util.Scanner;

public class BaekJoon_2941 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String word = stdIn.next();
        int cnt = 0;
        int location = 0;

        while (location != word.length()) {
            char C = word.charAt(location);
            switch (C) {
                case '=':
                    if (word.charAt(location - 1) == 'c' ||
                            word.charAt(location - 1) == 's' ||
                            word.charAt(location - 1) == 'z')
                        location++;
                    break;
                case '-':
                    if (word.charAt(location - 1) == 'c' ||
                            word.charAt(location - 1) == 'd')
                        location++;
                    break;
                case 'j':
                    if (word.charAt(location - 1) == 'l' ||
                            word.charAt(location-1) == 'n')
                        location++;
                    else{
                        cnt++;
                        location++;
                    }
                        break;
                case 'z':
                    if (word.charAt(location - 1) == 'd')
                        if(location+1 < word.length() && word.charAt(location+1) == '=')
                        location++;
                    else{
                        cnt++;
                        location++;
                    }
                    break;
                default:
                    cnt++;
                    location++;
                    break;
            }

        }

        System.out.println(cnt);

    }
}
