package LEVEL1;
import java.util.*;

public class lottoRanking {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int lowRank = -1;
        int highRank = -1;
        
        Set<Integer> lottosSet = new HashSet<>();
        Set<Integer> winSet = new HashSet<>();
        
        for(int i = 0; i < lottos.length; i++){
            lottosSet.add(lottos[i]);
            winSet.add(win_nums[i]);
        }
        
        int sameNums = numberOfSame(lottosSet, winSet);
        int zeroNums = numberOfZero(lottos);
        
        lowRank = lottoRank(sameNums);
        highRank = lottoRank(sameNums + zeroNums);
        
        answer[0] = highRank;
        answer[1] = lowRank;
        
        return answer;
    }
    static int lottoRank(int num){
        //num은 일치하는 번호의 개수
        if(num > 6)
            return -1;
        
        int rank = 0;
        switch(num){
            case 6:
                rank = 1;
                break;
            case 5:
                rank = 2;
                break;
            case 4:
                rank = 3;
                break;
            case 3:
                rank = 4;
                break;
            case 2:
                rank = 5;
                break;
            default:
                rank = 6;
                break;
        }
        
        return rank;
    }
    //Set 교집합 개수 구하는 함수
    static int numberOfSame(Set<Integer> set1, Set<Integer> set2){
        int count = 0;
        for(Integer e : set2){
            if(set1.contains(e))
                count++;
        }
        return count;
    }
    //로또 번호의 0의 개수 구하기
    static int numberOfZero(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        lottoRanking es = new lottoRanking();
        int [] lottos = { 44, 1, 0, 0, 31, 25};
        int [] win_nums = { 31, 10, 45, 1, 6, 19 };

        es.solution(lottos, win_nums);
    }
}