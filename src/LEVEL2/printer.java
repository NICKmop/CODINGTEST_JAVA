package LEVEL2;

import java.util.HashMap;

public class printer {

    public int solution(int[] priorities, int location) {
        HashMap<String,Integer> hs = new HashMap<>();
        char Nb = 97;
        int tmp = 0;
        for (int i = 0; i < priorities.length; i++) {
            
            char word = Nb++;
            String wordString = Character.toString(word);  

            hs.put(wordString,priorities[i] );
        }
        
        hs.forEach((strKey, strValue) -> {
            System.out.println( strKey +":"+ strValue );
            if (tmp < strValue){
                System.out.println("if tmp : " +  tmp);
            }
        });
        int answer = 0;
        return answer;
    }
    public static void main(String[] args) {
        printer pr = new printer();

        int [] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        pr.solution(priorities, location);
    }
}
