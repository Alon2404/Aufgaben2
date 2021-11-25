import java.util.Scanner;

public class ArbeitOderFreizeit {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Bitte geben Sie Ihre Uhrzeit ein: ");
            int time = sc.nextInt();

            for (int x = 0; time>=24; x++) {
                System.out.println("Wie viel Stunden hat dein Tag? versuchs nochmal");
                time = sc.nextInt();
            }


            if (time>=8 && time<=16) {
                System.out.printf("Sie sind momentan in der Arbeitszeit! ");
                if (time >= 12 && time <= 13) {
                    System.out.println("Aber Sie sind in der Mittagspause");
                }
            } else {
                System.out.println("Sie haben Momentan keine Arbeitszeit");
            }

        }
}
