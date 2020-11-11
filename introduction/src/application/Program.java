package application;

import java.util.Scanner;


import services.PrintServiceGenericT;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        PrintServiceGenericT<String> ps = new PrintServiceGenericT<>();

        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
