import java.util.Scanner;

public class EigenschaftenEinerZahl {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int favnum = 7;

            System.out.println("Gibt Irgend eine Zahl ein: ");
            int input = sc.nextInt();


            if (favnum==input){
                System.out.println("Was ein zufall das du genau meine Glueckszahl gewählt. Vielleicht haben wir mehr gemeinsam als gedacht ;P ! Kappa");
            }


            if (input%10==0){
                System.out.println("Es ist eine runde Zahl");
            }
            if (input%2==0){
                System.out.println("Es ist eine gerade Zahl");
            }
            if (input >= 10){
                System.out.println("Es ist eine zweistellige Zahl");
            }
        }
}