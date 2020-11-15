package application;

import entities.Client;

public class Program {
    
    public static void main(String[] args) {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println("hashCode de: " + c1.getName() + " = " + c1.hashCode());
        System.out.println("hashCode de: " + c2.getName() + " = " + c2.hashCode());
        System.err.println("Equal de: " + c1.getName() + " e " + c2.getName() + " = " + c1.equals(c2));
        System.out.println();
 
        System.out.println("Comparando: " + c1.getName() + " e " + c2.getName() + " = " + (c1 == c2));
        System.out.println("Comparando: " + s1 + " e " + s2 + " = " + (s1 == s2));

    }
}
