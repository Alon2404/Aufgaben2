public class arbeitenMitString {
    public static void main(String[] args) {

        String hW = " Hello World! ";
        char[] hWParts = hW.toCharArray();


        for (int x=0; x<hWParts.length;x++){
            hWParts[x] = hWParts[x];
        }

        System.out.println(hW + " ist genau " + hWParts.length + " Zeichen lang.");

        for (int x=0; x<hWParts.length;x++){
            System.out.print(Character.toLowerCase(hWParts[x]));
        }
        System.out.println();
        for (int x=0; x<hWParts.length;x++){
            System.out.print(Character.toUpperCase(hWParts[x]));
        }
        System.out.println();

        String replace = hW.replace("World", "Codersbay");
        System.out.println(replace);

        String replace2 = hW.replaceFirst(" ", "");
        System.out.println(replace2);


        for (int x=0; x<=hW.length(); x++){
            System.out.println(hW);
        }

    }
}