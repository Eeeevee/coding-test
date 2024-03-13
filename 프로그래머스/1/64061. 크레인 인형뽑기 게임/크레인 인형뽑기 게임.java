import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> dolls = new ArrayList<>();
        
        for(int move : moves){
            for(int i = 0; i < board.length; i++){
                int doll = board[i][move - 1];
                board[i][move - 1] = 0;
                if(doll != 0){
                    if(dolls.size() == 0) dolls.add(doll);
                    else if(doll != dolls.get(dolls.size() - 1)) {dolls.add(doll);}
                    else { dolls.remove(dolls.size()-1); answer += 2;} 
                    break;
                }
            }
        }
        
        return answer;
    }
}