package LEVEL2;

public class NumberList {
    public boolean Solution(String [] data){
        for (int i = 0; i < data.length; i++) {
            if(i >= 1){
                if (data[i].contains("1")) {
                    System.out.println("TRUE");
                }else{
                    System.out.println("FALSE");
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        NumberList nl = new NumberList();
        // String [] data = {"123","456","789"};
        String [] data = {"119", "97674223", "1195524421"};
        nl.Solution(data);
    }
// # solution(phone_book=["123","456","789"]);
// # ["119", "97674223", "1195524421"]	false
// # ["123","456","789"]	true
// # ["12","123","1235","567","88"]	false
}
