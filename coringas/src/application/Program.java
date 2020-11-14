package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        // ? representa o tipo curinga
        List<?> myObj = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObj = myNumbers;

        Object obj;
        Integer x =10;
        obj = x;

    }
}
