package application;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;


public class Program {
    public static void main(String[] args) {
 
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        System.out.println("Conjunto A: " + a);
        System.out.println("Conjunto B: " + b);

        System.out.println();

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("Usando o método union: " + c);
        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("Usando o método intersection: " + d);
        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("Usando o método difference: " + e);


    }
}
