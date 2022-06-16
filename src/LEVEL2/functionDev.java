package LEVEL2;

import java.util.ArrayList;

public class functionDev {
    int[] solution(int [] progress, int [] speeds){
        ArrayList<Integer> in = new ArrayList<Integer>(); 
        ArrayList<Integer> test = new ArrayList<Integer>(); 
        ArrayList<Integer> test2 = new ArrayList<Integer>(); 
        
        int [] answer = {};
        int cnt = 1;

        for (int i = 0; i < progress.length; i++) {
            cnt = 0;
            if (progress[i] < 100 ) {
                while (true) {
                    cnt++;
                    progress[i] = progress[i] + speeds[i];
                    if (progress[i] >= 100) {
                        break;
                    };
                }
            }
            in.add(cnt);
        }
        //    1     2   3   1    2
        // [5 <  10 > 1 > 1 < 20 < 1]
        cnt = 1;
        int leng = in.size();
        for (int i = 0; i < leng - 1; i++) { // 0 ~ 5
            if (in.get(0) > in.get(0 + 1)) {
                cnt++;
                test.add(cnt);
                in.remove(0 + 1);
            }else{
                cnt = 1;
                test.add(cnt);
                in.remove(0);
            }
        }
        System.out.println(test);
        return answer;
    }
    public static void main(String[] args) {
        functionDev fn = new functionDev();

        int [] progress = {95, 90, 99, 99, 80, 99};
        int [] speeds = {1, 1, 1, 1, 1, 1};

        fn.solution(progress, speeds);
    }
}
