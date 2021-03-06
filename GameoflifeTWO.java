

public class GameoflifeTWO {
    int width;
    int height;
    int[][] board;

    public GameoflifeTWO(int width, int height) {
        this.width = width;
        this.height = height;
        this.board=new int[width][height];
    }

    public void printBoard(){
        for (int y = 0; y < height; y++) {
            String line ="|";
            for (int x = 0; x < width; x++) {
                if (this.board[x][y]==0){
                    line+=".";
                } else {
                    line+="*";
                }
            }
        }
    }
    public void setAlive(int x,int y){
        this.board[x][y]=1;
    }
    public void setDead(int x,int y){
        this.board[x][y]=0;
    }

    public static void main(String[] args) {

    }
}