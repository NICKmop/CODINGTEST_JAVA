public class NUmberWordAndengWords {

    public int solution(String s) {
        int answer = checkWord(s);
        return answer;
    }

    static int checkWord(String Number){
        String conCatStr = "";
        String attachBox = "";

        String an = "";
        String an2 = "";

        boolean isNumeric = false;
        for (int i = 0; i < Number.length(); i++) {

            conCatStr = String.valueOf(Number.charAt(i));
            attachBox = attachBox.concat(conCatStr);

            switch (attachBox) {
                case "zero": an = attachBox;
                    an2 = an;

                    converter(an2);
                    attachBox ="";
                    continue;
                case "one": an = attachBox;
                    an2 = an;

                    converter(an2);
                    attachBox ="";
                    continue;
                case "two": an = attachBox;
                    an2 = an;

                    converter(an2);
                    attachBox ="";
                    continue;
                case "three": an = attachBox;
                    an2 = an; 
                    
                    converter(an2);
                    attachBox ="";
                    continue;
                case "four": an = attachBox;
                    an2 = an;
                    
                    converter(an2);
                    attachBox ="";
                    continue;
                case "five": an = attachBox;
                    an2 = an;
                    
                    converter(an2);
                    attachBox ="";
                    continue;
                case "six": an = attachBox;
                    an2 = an;

                    converter(an2);
                    attachBox ="";    
                    continue;
                case "seven": an = attachBox;
                    an2 = an;
                    
                    converter(an2);
                    attachBox ="";
                    continue;
                case "eight": an = attachBox;
                    an2 = an;

                    converter(an2);
                    attachBox ="";    
                    continue;
                case "nine": an = attachBox;
                    an2 = an;
                    
                    converter(an2);
                    attachBox ="";    
                    continue;
                default:
                    isNumeric = attachBox.matches("[+-]?\\d*(\\.\\d+)?");
                    if (isNumeric) {
                        an = attachBox;
                        // an2 += attachBox;
                    }else {
                        break;
                    }
                    break;
                }
        }
        return 0;
    }
    static int converter(String str){
        String compareStr = str;
        if (compareStr == str) {
            System.out.println("cchck");
            str = "1";
            int strtoNumber = Integer.parseInt(str);
            System.out.println(strtoNumber);
            return strtoNumber; 
        }
        return 0;
    }
    //      "one4seveneight"	1478
    //      "23four5six7"	234567
    //      "2three45sixseven"	234567
    //      "123"	123
    public static void main(String[] args) {
        NUmberWordAndengWords nu = new NUmberWordAndengWords();
        
        nu.solution("one4seveneight");
    }
}