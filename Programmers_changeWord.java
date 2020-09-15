public class Programmers_changeWord {

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        char[] charBegin = begin.toCharArray();
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(target.charAt(i) == word.charAt(i) && charBegin[i] != word.charAt(i)){
                    answer++;
                    charBegin[i] = word.charAt(i);
                    System.out.println(charBegin);
                    break;
                }
            }
            if(target.equals(String.valueOf(charBegin))) break;
        }
        if(target.equals(String.valueOf(charBegin))) return answer;
        else return 0;
    }

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        Programmers_changeWord pcw = new Programmers_changeWord();
        System.out.println(pcw.solution(begin,target,words));

    }
}
