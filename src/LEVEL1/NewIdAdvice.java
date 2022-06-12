package LEVEL1;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
// 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
// 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
public class NewIdAdvice {
    public String solution(String new_id) {
        String answer = changeWord(new_id);
        return answer;
    }
    static String changeWord(String value){
        ArrayList<String> ar = new ArrayList<>();

        String attachbox ="";
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String ch = value.toLowerCase();
        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        Pattern pa = Pattern.compile("[a-z0-9-_.]+");
        Matcher ma = pa.matcher(ch);

        while (ma.find()) {
            String mafind = ma.group();
            ar.add(mafind);
        }
        for (int i = 0; i < ar.size(); i++) {
            attachbox += ar.get(i); 
            // System.eWout.println(attachbox);
        }
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.m
        String pacomaRemove = Pattern.compile("(([.])\\2{1,})").matcher(attachbox).replaceAll(".");
        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        for (int i = 0; i < pacomaRemove.length(); i++) {
            if (pacomaRemove.charAt(0) == '.') {
                attachbox = sbfn(pacomaRemove, 0);
                return attachbox;
            }
            if (i == pacomaRemove.length() - 1) {
                // sb.deleteCharAt(pacomaRemove.length() - 1);
                System.out.println(attachbox);
            }
        }
        // attachbox = sb.toString();
        return attachbox;
    }
    static String sbfn(String str, int number){
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.deleteCharAt(number);
        return sb.toString();
    }
    public static void main(String[] args) {
        NewIdAdvice ne = new NewIdAdvice();
        // test data
        // "...!@BaT#*..y.abcdefghijklm"
        // "z-+.^."
        // "123_.def"
        ne.solution("...!@BaT#*..y.abcdefghijklm.");
    }
}
