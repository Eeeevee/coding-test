import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                if(keypad.containsKey(c)){
                    int n = keypad.get(c);
                    keypad.put(c, Math.min(n, j + 1));
                }
                else {
                    keypad.put(c, j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int cnt = 0;
            boolean flag = true;
            for(char c : target.toCharArray()){
                if(keypad.containsKey(c)){
                    cnt += keypad.get(c);
                }
                else{
                    flag = false;
                    break;
                }
            }
            answer[i] = flag == false ? -1 : cnt;
        }
        return answer;
    }
}