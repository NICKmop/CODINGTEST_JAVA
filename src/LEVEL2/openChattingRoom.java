package LEVEL2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class openChattingRoom {
    
    
    public String[] solution(String[] record) {
        HashMap<String, String> hm = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        for (String s : record) {
            StringTokenizer st = new StringTokenizer(s);
            String userState = st.nextToken();
            String uid = st.nextToken();

            String name = userState.equals("Leave") ? "" : st.nextToken();

            switch (userState) {
                case "Enter":
                    hm.put(uid, name);
                    arr.add(uid + "님이 들어왔습니다.");
                    break;
                case "Changes":
                    hm.put(uid, name);
                    break;
                case "Leave":
                    hm.put(uid, name);
                    arr.add(uid + "님이 나갔습니다..");
                    break;
                default:
                    break;
            }
        }
        String[] answer = new String[arr.size()];
        for(int i = 0; i < answer.length; i++){
            // 현재 문자열에서 uid 추출
            String uid = arr.get(i).substring(0, arr.get(i).indexOf("님"));
            // 해당 uid로 HashMap에서 이름을 찾아 replace로 변경
            answer[i] = arr.get(i).replace(uid, hm.get(uid));
        }
        return answer;
        
    }

    public static void main(String[] args) {
        openChattingRoom op = new openChattingRoom();
        String [] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo","Change uid4567 Ryan"};
        op.solution(record);
    }
}
