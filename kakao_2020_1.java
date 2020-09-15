public class kakao_2020_1 {

    public String solution(String new_id) {
        String answer = new_id;

        answer = answer.toLowerCase();

        answer = answer.replaceAll("[^a-z1-9._-]","");

        while(answer.contains("..")){
            answer = answer.replace("..",".");
        }

        if(answer.startsWith(".")){
            answer = answer.substring(1);
        }

        if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }

        if(answer.length() == 0){
            answer = "a";
        }

        if(answer.length() > 15){
            answer = answer.substring(0,15);
            if(answer.endsWith(".")){
                answer = answer.substring(0,answer.length()-1);
            }
        }

        if(answer.length() <= 2){
            String lastChar = answer.substring(answer.length()-1);
            System.out.println(lastChar);
            while(answer.length() != 3){
                answer = answer.concat(lastChar);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String answer = "";

        answer = answer.toLowerCase();

        answer = answer.replaceAll("[^a-z1-9._-]","");

        while(answer.contains("..")){
            answer = answer.replace("..",".");
        }

        if(answer.startsWith(".")){
            answer = answer.substring(1,answer.length());
        }

        if(answer.endsWith(".")){
            answer = answer.substring(0,answer.length()-1);
        }

        if(answer.length() == 0){
            answer = "a";
        }

        if(answer.length() > 15){
            answer = answer.substring(0,15);
            if(answer.endsWith(".")){
                answer = answer.substring(0,answer.length()-1);
            }
        }

        if(answer.length() <= 2){
            String lastChar = answer.substring(answer.length()-1);
            while(answer.length() != 3){
                answer = answer.concat(lastChar);
            }
        }
        System.out.println(answer);
    }

}
