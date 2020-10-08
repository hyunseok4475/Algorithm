import java.util.Scanner;

public class BaekJoon_1259 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        StringBuffer check = new StringBuffer();

        while(true){
            String word = stdIn.next();

            if(word.equals("0")){
                break;
            }
            else{
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(word);
                String rword = String.valueOf(stringBuffer.reverse());

                if(rword.equals(word))
                    check.append("1");
                else
                    check.append("0");
            }
        }


        for(int i = 0; i < check.length(); i++){
            char C = check.charAt(i);

            if(C == '1')
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
