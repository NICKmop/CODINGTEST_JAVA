package LEVEL2;

import java.util.ArrayList;

// "{{2},{2,1},{2,1,3},{2,1,3,4}}"	[2, 1, 3, 4]
// "{{1,2,3},{2,1},{1,2,4,3},{2}}"	[2, 1, 3, 4]
// "{{20,111},{111}}"	[111, 20]
// "{{123}}"	[123]
// "{{4,2,3},{3},{2,3,4,1},{2,3}}"	[3, 2, 4, 1]

public class tuple {
    public int[] solution(String s) {
        String [] tuso = s.split(",");
        for (String string : tuso) {
            System.out.print(string);
        }


        int[] answer = {};
        return answer;
    }
    public static void main(String[] args) {
        tuple tp = new tuple();
        
        String topl = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        
        tp.solution(topl);
    }
}
