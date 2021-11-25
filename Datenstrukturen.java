import java.util.*;

public class Datenstrukturen {
    public static void main(String[] args) {

        Integer[] f = {49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34};
        Integer[] b = { 39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49};
        Integer[] c = { 41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10};

        Set<Integer> a = new HashSet<Integer>();

        a.addAll(Arrays.asList(f));
        a.addAll(Arrays.asList(b));
        a.addAll(Arrays.asList(c));


        a.removeAll(Arrays.asList(b));
        a.removeAll(Arrays.asList(c));

        System.out.println("Die Differenz Menge von f: "+a);



        //list1 = new ArrayList<Integer>(49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34);

        //getUnionList(a, getIntersectionList(b,c));
    }
}
