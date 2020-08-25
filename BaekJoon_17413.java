import java.util.Scanner;

public class BaekJoon_17413 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String sentence = stdIn.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer tmpStringBuffer = new StringBuffer();

        int location = 0;
        char C;

        while (location < sentence.length()) {
            C = sentence.charAt(location);

            if(C == ' '){
                stringBuffer.reverse();
                tmpStringBuffer.append(stringBuffer);
                tmpStringBuffer.append(sentence.charAt(location));
                stringBuffer.setLength(0);
                location++;
            }
            else if(C == '<'){
                stringBuffer.reverse();
                tmpStringBuffer.append(stringBuffer);
                stringBuffer.setLength(0);
                do{
                    tmpStringBuffer.append(sentence.charAt(location));
                }while(sentence.charAt(location++) !='>');
            }
            else{
                stringBuffer.append(C);
                location++;
            }
        }

        stringBuffer.reverse();
        tmpStringBuffer.append(stringBuffer);
        stringBuffer.setLength(0);

        System.out.println(tmpStringBuffer);
    }
}
