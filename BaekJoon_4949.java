import java.util.Scanner;

public class BaekJoon_4949 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String sentence;
        StringBuffer stringQueue = new StringBuffer("");
        StringBuffer answerQueue = new StringBuffer("");
        boolean smallParenthesis;
        boolean largeParenthesis;
        boolean wrongflag = false;
        char C;

        while (true) {
            sentence = stdIn.nextLine();
            smallParenthesis = false;
            largeParenthesis = false;
            wrongflag = false;
            stringQueue.setLength(0);

            if (sentence.charAt(0) == '.') {
                break;
            } else {
                for (int i = 0; i < sentence.length(); i++) {
                    C = sentence.charAt(i);
                    if (C == '[' || C == ']' || C == '(' || C == ')') {
                        stringQueue.append(C);
                    }
                }

                for (int i = 0; i < stringQueue.length(); i++) {
                    C = stringQueue.charAt(i);
                    if (C == '[')
                        largeParenthesis = true;

                    else if (C == '(')
                        smallParenthesis = true;

                    else if (C == ']') {
                        if (largeParenthesis == true && smallParenthesis == false)
                            largeParenthesis = false;
                        else if(largeParenthesis == false || (largeParenthesis == true && smallParenthesis == true)) {
                            wrongflag = true;
                            break;
                        }
                    } else if (C == ')') {
                        if (smallParenthesis == true && largeParenthesis == false)
                            smallParenthesis = false;
                        else if(smallParenthesis == false || (smallParenthesis == true && largeParenthesis == true)){
                            wrongflag = true;
                            break;
                        }
                    }

                }

                if (wrongflag == false)
                    answerQueue.append('0');
                else
                    answerQueue.append('1');
                System.out.println(largeParenthesis + " + " + smallParenthesis);
            }
        }
        for (int i = 0; i < answerQueue.length(); i++) {
            if (answerQueue.charAt(i) == '0')
                System.out.println("yes");
            else if (answerQueue.charAt(i) == '1')
                System.out.println("no");
        }
    }
}
