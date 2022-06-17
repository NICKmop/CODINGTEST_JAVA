package LEVEL2;

import java.util.ArrayList;
import java.util.Arrays;

public class soSpicy {

    public int solution(int[] scoville, int K) {
        ArrayList<Integer> ar = new ArrayList<>();;
        
        int answer = 0;
        Arrays.sort(scoville);

        while (true) {
            if (scoville[0] >= 7) {
                break;
            }else{
                answer ++;

                scoville[0] = scoville[0] + (scoville[1] * 2);
                if(scoville[0] < scoville[1] ){
                    Arrays.sort(scoville);
                    ar.remove(scoville[1]);
                }else{
                    for (Integer i : scoville) {
                        System.out.println(i);
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        soSpicy so = new soSpicy();
        int [] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        so.solution(scoville, K);
    }
}
