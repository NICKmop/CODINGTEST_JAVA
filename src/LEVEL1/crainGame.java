package LEVEL1;
public class crainGame {
    public int solution(int[][] board, int[] moves) {
        

        for (int i = 0; i < moves.length; i++) {
            move(moves[i], board, i);
        }

        int answer = 0;
        return answer;
    }
    static int move(int moves, int[][] board, int movesCount){
        StringBuilder result = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < movesCount; i++) {
            cnt++;
        }
        
        if (moves == 1) {
            result.append(String.valueOf(board[moves-1][cnt]));
            cnt++;
        }else if(moves == 3){
            result.append(String.valueOf(board[moves-1][cnt]));
            cnt++;
        }else if(moves == 4){
            result.append(String.valueOf(board[moves-1][cnt]));
            cnt++;
        }else if(moves == 5){
            result.append(String.valueOf(board[moves-1][cnt]));
            cnt++;
        }else if(moves == 2){
            result.append(String.valueOf(board[moves-1][cnt]));
            cnt++;
        }

        System.out.println(result);
        return 0;
    }

    public static void main(String[] args) {
        crainGame cr = new crainGame();
        int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] moves = {1,5,3,5,1,2,1,4};
        // {0,0,0,0,0} - 0 0 0
        // {0,0,1,0,3} - 0
        // {0,2,5,0,1} - 0
        // {4,2,4,4,2} - 4
        // {3,5,1,3,1} - 3 5 
        
        cr.solution(board, moves);
    }
}
