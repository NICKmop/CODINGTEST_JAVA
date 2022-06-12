package LEVEL1;
public class innerEnemy {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
           res = a[i] * b[i];
           answer += res;    
        }

        System.out.println(answer);

        return answer;
    }
    public static void main(String[] args) {
        innerEnemy inn = new innerEnemy();
        
        int [] a = {1,2,3,4};
        int [] b = {-3,-1,0,2};
        
        inn.solution(a, b);
    }
}
