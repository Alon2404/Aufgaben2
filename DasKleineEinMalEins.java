public class DasKleineEinMalEins {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        int solution;

        for (num1 = 1; num2 <= 10; num1++) {
            if (num1==1){
                System.out.println(num2 + "er Reihe:");
            }
            solution = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + solution);
            if (num1 == 10) {
                num2++;
                num1=0;
            }
        }
    }
}