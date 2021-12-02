import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char [][] board = new char[3][3];
        int input;
        printBoard(board);
        Scanner sc = new Scanner(System.in);


        //Player 1
        System.out.println("Spieler 1 gewünschtes Feld eingeben (1-9): ");
        input = sc.nextInt();

        //Player 2
        System.out.println("Spieler 2 gewünschtes Feld eingeben (1-9): ");
    }

    public static void printBoard(char[][] board){
        boolean win = false;
        while (!win) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf(" ", board[j][i]);
                    if (j > 0 && j < 3) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
        
    }


}


/* Idee

Als erstes soll ein 3x3 Großes Feld ausgegeben werden.
Der Spieler 1 wird gefragt welches Feld er beanspruchen möchte.
Das neue Feld wird ausgegeben mit dem Beanspruchten Feld und so geht das Spiel dann weiter
das Programm prüft vor jeder nächsten eingabe ob einer schon gewonnen hat (3 in einer reihe)
falls das der fall ist hat der Spieler gewonnen und das spiel geh zu ende (Mit einer For-loop oder ***while anforderung***.
checken ob ein spieler gewonnen hat. "Keine if Anweisung für jede einzelen gewinn möglichkeit zu viele if´s".
2D-Array Abfragen ob schon 3 in einer Reihe sind. für die 2 schräg gewinn möglichkeiten extra if´s.


 */