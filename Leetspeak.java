import java.util.Scanner;

public class Leetspeak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String txt;
        char leetspeak = 'a';
        char[] ran = {'@', '8', '(', '3', '6', '#', '!', '1', '0', '$', '7', '2'};
        char[] letter = {'A', 'B','C','E','G','H','I','L','O','S','T','Z'};

        System.out.println("Bitte geben Sie Ihren gewünschten Text ein");
        txt=sc.nextLine();
        txt=txt.toUpperCase();

//        for (int i=0; i<txt.length();i++){
//            txt.toUpperCase();
//            leetspeak = txt.charAt(i);
//        }

        for (int i=0; i<txt.length(); i++){

            leetspeak = txt.charAt(i);

            for(int j=0; j < letter.length; j++){
                if(leetspeak == letter[j]){
                    leetspeak = ran[j];
                }
            }
            System.out.print(leetspeak);
        }
    }
}


//            if (leetspeak == 'A' ){
//                leetspeak = ran[0];
//            } else if (leetspeak == 'B'){
//                leetspeak = ran[1];
//            }else if (leetspeak == 'C'){
//                leetspeak = ran[2];
//            }else if (leetspeak == 'E'){
//                leetspeak = ran[3];
//            }else if (leetspeak == 'G'){
//                leetspeak = ran[4];
//            }else if (leetspeak == 'H'){
//                leetspeak = ran[5];
//            }else if (leetspeak == 'I'){
//                leetspeak = ran[6];
//            }else if (leetspeak == 'L'){
//                leetspeak = ran[7];
//            }else if (leetspeak == 'O'){
//                leetspeak = ran[8];
//            }else if (leetspeak == 'S'){
//                leetspeak = ran[9];
//            }else if (leetspeak == 'T'){
//                leetspeak = ran[10];
//            }else if (leetspeak == 'Z'){
//                leetspeak = ran[11];
//            }


