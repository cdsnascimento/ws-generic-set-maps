package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {
        
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "9971112");

        System.out.println("ALL COOKIES:");

        for ( String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println();

        cookies.remove("email");

        System.out.println("BEFORE REMOVE EMAIL");

        for ( String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
    
}
