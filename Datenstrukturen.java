import java.util.*;

public class Datenstrukturen {
    public static void main(String[] args) {

        Integer[] a = {49, 30, 14, 47, 13, 2, 12, 29, 19, 11, 15, 39, 43, 45, 34};
        Integer[] b = {39, 33, 38, 14, 4, 32, 40, 25, 17, 46, 35, 6, 2, 12, 49};
        Integer[] c = {41, 12, 5, 35, 42, 28, 47, 20, 26, 24, 50, 40, 14, 17, 10};
        Set setA = new HashSet(Arrays.asList(a));
        Set setB = new HashSet(Arrays.asList(b));
        Set setC = new HashSet(Arrays.asList(c));

        System.out.println("Liste A: " + setA);
        System.out.println("Liste B: " + setB);
        System.out.println("Liste C: " + setC);
        System.out.println();
        System.out.println("A∧(B/C): " + getUnionSet(setA, getIntersectionSet(setB,setC)));
        //System.out.println(getUnionSet(setA, getIntersectionSet(setB, setC, getDifferenceSet(setC))));

        System.out.println(getUnionSet(setA, getIntersectionSet(setB, setC)));
        System.out.println(getDifferenceSet(getUnionSet(setA, getIntersectionSet(setB, setC)), setC));
    }


    public static Set getUnionSet(Set one, Set two){
        Set<Integer> getUnionSet = new HashSet<Integer>();
        getUnionSet.addAll(one);
        getUnionSet.addAll(two);
        return getUnionSet;
    }

    public static Set getIntersectionSet(Set one, Set two){
        Set<Integer> getIntersectionSet = new HashSet<Integer>();
        getIntersectionSet.addAll(one);
        getIntersectionSet.retainAll(two);
        return getIntersectionSet;
    }

    public static Set getDifferenceSet(Set one, Set two){
        Set<Integer> getDifferenceSet = new HashSet<Integer>();
        getDifferenceSet.addAll(one);
        getDifferenceSet.removeAll(two);
        return getDifferenceSet;
    }
}