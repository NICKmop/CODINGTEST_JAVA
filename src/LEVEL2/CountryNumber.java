package LEVEL2;

public class CountryNumber {
    
    /**
     * InnerCountryNumber
     */
    public int InnerCountryNumber(int number) {
        int [] nara = {1,2,4};
        String ans = "";
        String result = infiniteNumber(number, nara, ans);
        System.out.println("result : " + result);
      return 0;  
    }

    String infiniteNumber(int answer, int [] nara, String ans) {
        int Number = 0;

        while (true) {
            if (Number <= 0) return ans;
            
            Number -= 1;
            ans = (nara[Number%3] + ans);
            Number /= 3;

            return ans;
        }
    }
    
    public static void main(String[] args) {
        CountryNumber co = new CountryNumber();
        
        int number = 4;
        co.InnerCountryNumber(number);
    }
}