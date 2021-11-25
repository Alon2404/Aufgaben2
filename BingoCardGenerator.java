import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class BingoCardGenerator {

    public static void printBingo(int[][] bingo){
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.printf("|%2d",bingo[j][i]);
            }
            System.out.println();
        }
    }
    public static ArrayList<Integer> initColumn(ArrayList<Integer> list) {
        list.clear();
        for (int i=1; i<= 15; i++) {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args){
            int[][] bingo = new int[5][5];
            ArrayList<Integer> column = new ArrayList<>();
            int c = 0;
            Random ran = new Random();
            column = initColumn(column);
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    int rand = (int)(Math.random() * (column.size()-1));
                    int r = column.get(rand)+15*i;
                    column.remove(rand);
                    bingo[i][j] = r;
                }
                column = initColumn(column);
            }
            printBingo(bingo);
    }
}