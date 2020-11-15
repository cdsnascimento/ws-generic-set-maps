package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    
    public static void main(String[] args) {
    
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);


        //Number x = myNums.get(0);// tempos o princípio de contravariância, quando o metodo put esta disponíve e o metodo get não

        //Object x = myNums.get(2);

        //System.out.println(x);

    }

}
