package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>(); // Foi utilizado hashset, por se tratar apenas de um contagem de elementos, logo a ordem não é relevante.

            String line = br.readLine();

            String userName;
            Date moment;
            String[] fields;

            while (line != null) {

                fields = line.split(" ");
                userName = fields[0];
                moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(userName, moment));

                line = br.readLine();
                
            }

            System.out.println("Total users: " + set.size());

        } catch (IOException e){
            System.out.println( "Error: " + e.getMessage());
        }

        sc.close();

    }

}
