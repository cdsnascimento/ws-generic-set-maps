package application;

import java.util.LinkedHashSet;
import java.util.Set;


public class Program {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        //System.out.println(set.contains("Notebook"));
        
        for (String p : set) {
            System.out.println(p);
        }

        System.out.println();

        System.out.println("Removendo um item atraves do comando: .remove: ");
        set.remove("Tablet");

        for (String p : set) {
            System.out.println(p);
        }

    }
}
