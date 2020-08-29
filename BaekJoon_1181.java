import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Word implements Comparable<Word>{

    String word;
    int wordLength;

    Word(String word){
        this.word = word;
        this.wordLength = this.word.length();
    }

    @Override
    public int compareTo(Word o) {

        if(this.wordLength > o.wordLength){
            return 1;
        }
        else if(this.wordLength == o.wordLength){
            return this.word.compareTo(o.word);
        }
        return -1;
    }
}


public class BaekJoon_1181 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int num = Integer.parseInt(br.readLine());
            Set getwords = new HashSet<String>();

            for(int i = 0; i < num; i++){
                getwords.add(br.readLine());
            }

            Object[] tmp = getwords.toArray();
            Word[] words = new Word[getwords.size()];

            for(int i = 0; i < getwords.size(); i++){
                words[i] = new Word(tmp[i].toString());
            }

            Arrays.sort(words);

            for(int i = 0; i < words.length; i++){
                bw.write(words[i].word);
                bw.newLine();
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
