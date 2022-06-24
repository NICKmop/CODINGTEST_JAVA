package LEVEL2;

import java.util.ArrayList;

public class newsClustering {
    
    static class Solution{
        public static int solution(String st1, String st2){
            // System.out.println(st1.length() + st2);

            st2 = st2.toUpperCase();

            ArrayList<String> st1ar = new ArrayList<>();
            ArrayList<String> st2ar = new ArrayList<>();

            String st1arext = "";
            String st2arext = "";

            for (int i = 0; i < st1.length(); i++) {
                st1arext += st1.charAt(i);
                st2arext += st2.charAt(i);

                if ( i % 2 == 1 ) {
                    st1ar.add(st1arext);
                    st2ar.add(st2arext);
                    st1arext = "";
                    st2arext = "";
                }
            }

            int answer = 0;
            return answer;
        }
    }

    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";
        Solution.solution(str1, str2);
    }
}
