public class keypadClick {

    public String solution(int[] numbers, String hand) {
        String result = "";
        
        String left = "*";
        String right = "#";

        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 ){
                result += "L";
                left = String.valueOf(numbers[i]);
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                result += "R";
                right = String.valueOf(numbers[i]);
            }else{
                String mid = midValue(numbers[i],right, left, hand);
                result += mid;
            }
            // System.out.println(result);
        }
        System.out.println(hand);
        String answer = "";
        return answer;
    }

    static String midValue(int value, String right, String left, String hand){
        System.out.println( value);
        System.out.println( right);
        System.out.println( left);
        System.out.println( hand);
        return "";
    }


    public static void main(String[] args) {
        keypadClick ke = new keypadClick();
        int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hands = "right";
        ke.solution(numbers, hands);
    };    
};
