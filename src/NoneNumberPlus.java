import java.lang.Character.Subset;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

/**
 * NoneNumberPlus
 * [1,2,3,4,6,7,8,0]
 */
public class NoneNumberPlus {

    public int Solution(int [] numbers){
        HashSet<Integer> re = new HashSet<>();
        HashSet<Integer> re1 = new HashSet<>();
        int [] compare = {1,2,3,4,5,6,7,8,9,0};
        int ore = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            re.add(numbers[i]);
        }
        for (int i = 0; i < compare.length; i++) {
            re1.add(compare[i]);
        }
        
        HashSet<Integer> result = new HashSet<Integer>(re1);
        result.removeAll(re);
        for (Integer integer : result) {
            ore += integer;
        }

        return ore;
    }

    public static void main(String[] args) {
        NoneNumberPlus no = new NoneNumberPlus();
        int [] numbers = {1,2,3,4,6,7,8,0};
        no.Solution(numbers);
    }
}