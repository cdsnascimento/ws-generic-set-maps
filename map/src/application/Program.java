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
        cookies.put("phone", "99771133"); // como o Map não aceita repetições o valor inserido, sera sobrescrito ao original

        System.out.println("BEFORE REMOVE EMAIL");

        for ( String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone numbre: " + cookies.get("phone")); // trazer o valor contido na chave email

        System.out.println("Email: " + cookies.get("email")); // como nao exite a chave email o valor de retorno será nulo
        System.out.println("Size: " + cookies.size()); // retorna o total de valores contidos na estrutura

    }
    
}
