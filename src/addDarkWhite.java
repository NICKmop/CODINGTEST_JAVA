import java.util.ArrayList;

import javax.swing.plaf.TreeUI;

// absolutes = 1 <= 1000 every number
// signs this value same the absolutes
// signs[i] treu  == absolutes[i] +
// signs[i] treu  != absolutes[i] -
public class addDarkWhite {
    public ArrayList<Integer> solution(int[] absolutes, boolean[] signs) {

        ArrayList<Integer> answer = new ArrayList<>();;

        for (int i = 0; i < absolutes.length; i++) {

            if (signs[i]) {
                answer.add(Math.abs(absolutes[i]));
            }else{
                if (absolutes[i] < 0){
                    answer.add(absolutes[i]);
                }else{
                    answer.add(absolutes[i] * -1);
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        addDarkWhite wd = new addDarkWhite();

        int [] absolutes = {-4,-7,12};
        boolean [] signs = {true,false,false};

        wd.solution(absolutes, signs);
    }
}
