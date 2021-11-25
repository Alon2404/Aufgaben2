import java.util.Random;

public class Gameoflife {
    static final int dimension=8;
    private static int one=1;

    public static void printBoard(int[][] arr) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.printf("|%1d", arr[j][i]);
            }
            System.out.println();
        }
    }
    public static void initBoard(int[][] arr) {
        for (int x = 0; x < dimension; x++) {
            for (int y = 0; y < dimension; y++) {
                Random rand = new Random();
                int answer = rand.nextInt(2);
                arr[x][y] = answer;
            }
        }
    }
    public static boolean isOnBoard(int x, int y){
        if ((x<0||x>=dimension) || (y<0||y>=dimension)) {
            return false;
        }
//        return this.printBoard(arr[x][y]);
          return true;
    }
    public static int domToretto(int[][] arr, int x, int y) {
        int count = 0;
        for (int i = x - 1; i < x + 1; i++) {
            for (int j = y - 1; j < y + 1; j++) {
                if (isOnBoard(i, j))
                    count += arr[i][j];
            }
        }
        return count-arr[x][y] ;
    }
    public static int[][] isAlive (int[][] arr){
        int[][] nextGen =  new int[dimension][dimension];
        for (int x = 0; x < dimension; x++) {
            for (int y = 0; y < dimension; y++) {
                int count = domToretto(arr, x, y);
                if (arr[x][y] == 0 && count == 3) {
                    nextGen[x][y] = 1;
                } else if (arr[x][y] == 1 && count < 2) {
                    nextGen[x][y] = 0;
                } else if (arr[x][y] == 1 && count > 3) {
                    nextGen[x][y] = 0;
                } else if (arr[x][y] == 1 && count==2||count==3){
                    nextGen[x][y] = 1;
                }
            }
        }
        return nextGen;
    }
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[dimension][dimension];
        initBoard(arr);
        for (int i = 0; i < 150; i++) {
            printBoard(arr);
            System.out.println("-----------------------------------");
            // Create new board
            arr = isAlive(arr);
        }
    }
}