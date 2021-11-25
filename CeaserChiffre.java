import java.util.Scanner;
public class CeaserChiffre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        char fuq;
        System.out.println("Geben Sie einen Text ein: ");
        input = sc.nextLine();
        System.out.println("Um wie viele Stellen verschieben?");
        int key = sc.nextInt();
        String space = "";
        int x=0;
        //char[] ch = new char[input.length()];
        for (int i=0; i<input.length(); i++){
            fuq = input.charAt(i);
             if (fuq == 32){
                 System.out.print(" ");
             }else {
                 fuq += key;
                 System.out.print(fuq);
             }
        }
    }
}