import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class EinfacheRechenaufgaben {
    public static void main(String[] args) {

        double num1;
        double num2;
        double total;
        double difference;
        DecimalFormat df = new DecimalFormat("#.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihre erste Wunschzahl ein: ");
        num1 = sc.nextDouble();
        System.out.println("Bitte geben Sie Ihre zweite Wunschzahl ein: ");
        num2 = sc.nextDouble();


        total = num1+num2;
        System.out.println("Your total to " + df.format(num1) + " + " + df.format(num2) +" is [" + df.format(total) + "].");

        total = num1 * num2;
        System.out.println("Your total to " + df.format(num1) + " * " + df.format(num2) +" is [" + df.format(total) + "].");

        total = num1 / num2;
        System.out.println("Your total to " + df.format(num1) + " / " + df.format(num2) +" is [" + df.format(total) + "].");

        if (num1<num2){
            total = num2 - num1;
        } else {
            total = num1 - num2;
        }
        System.out.println("The difference between " + df.format(num1) + " and " + df.format(num2) +" is [" + df.format(total) + "].");

    }
}