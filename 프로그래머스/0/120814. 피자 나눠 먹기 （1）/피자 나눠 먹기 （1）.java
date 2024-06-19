class Solution {
    
    public int solution(int n) {
        
        double answer = (double) n / 7;
        
        if ((double) n % 7 > 0) {
            answer += 1;
        }
        
        return (int) answer;
    }
}