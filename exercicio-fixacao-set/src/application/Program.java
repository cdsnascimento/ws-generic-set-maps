package application;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Students;

public class Program {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer totalStudents;
        Integer code;

        Set<Students> A =  new TreeSet<>();
        Set<Students> B =  new TreeSet<>();
        Set<Students> C =  new TreeSet<>();

        System.out.print("How many students for course A? ");
        totalStudents = sc.nextInt();

    
        for (int i = 0; i < totalStudents; i++){

            code = sc.nextInt();
            A.add(new Students(code));
        }

        System.out.println();

//-------------------------------------------------------------------------

        System.out.print("How many students for course B? ");
        totalStudents = sc.nextInt();


        for (int i = 0; i < totalStudents; i++){

            code = sc.nextInt();
            B.add(new Students(code));
        }

        System.out.println();
        
//-------------------------------------------------------------------------

        System.out.print("How many students for course C? ");
        totalStudents = sc.nextInt();


        for (int i = 0; i < totalStudents; i++){

            code = sc.nextInt();
            C.add(new Students(code));
        }

        System.out.println();
        
        Set<Students> D = new TreeSet<>(A);
        D.addAll(B);

        Set<Students> E = new TreeSet<>(D);
        E.addAll(C);

        System.out.println("Total Students: " + E.size());


        sc.close();

    }

}
