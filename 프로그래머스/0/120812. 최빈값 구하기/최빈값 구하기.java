import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        int max = array[array.length - 1];
        // cnt 배열의 크기 설정
        int[] cnt = new int[max + 1];
        
        // array[i]의 값에 해당하는 인덱스에 cnt++
        for(int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }
        
        max = cnt[0];
        
        for(int i = 1; i < cnt.length; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
                answer = i;
            } else if (max == cnt[i]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}