import java.util.ArrayList;
import java.util.Scanner;

public class BerechnungDesMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text;
        String q = "q";
        int j=0;
        int num=0;
        int biggest=0;
        ArrayList<Integer> num1 =new ArrayList<>();

        for (int i = 0; j == i; i++) {
            System.out.println("Please enter a number, if you are done just press [q]");
            text = sc.nextLine();
            if (text.equals(q)){
                continue;
            }
            /*while (text.equals(Integer.parseInt(text))){
                System.out.println("Bitte nur Zahlen");
                text = sc.nextLine();
            }*/
            try{
                 num = Integer.parseInt(text);
            } catch (NumberFormatException ex){
                ex.printStackTrace();
            }
            num1.add(num);
            if (num1.get(i)>biggest){
                biggest=num1.get(i);
            }
            j++;
        }
        System.out.println("Your biggest number is: "+biggest);
    }
}