import java.util.Scanner;

public class NotenUebersetzen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte gib deine Note ein:");
        int mark = sc.nextInt();

        if (mark == 1){
            System.out.println("Sehr Gut");
        } else if (mark == 2){
            System.out.println("Gut");
        } else if (mark == 3){
            System.out.println("Befriedigend");
        } else if (mark == 4){
            System.out.println("Genügend");
        } else {
            System.out.println("Nitch Genügend");
        }
    }
}
