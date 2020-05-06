package Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Add elements to arraylist:
        ArrayList<String> list=new ArrayList<String>();
        list.add("Muhammad");
        list.add("Mehboob");
        list.add("Hamid");
        list.add("Umer");
        list.add("Maqsood");
        System.out.println(list);
        //To change elements in arraylist:
        list.set(2,"Shehzad");
        System.out.println(list);
        //To remove element in arraylist:
        list.remove(2);
        System.out.println(list);
       //To find size of arraylist:
        list.size();
        for (String str:list) {
            System.out.println(str);
        }
        //How to sort arraylist:
        Collections.sort(list);
        System.out.println("After sorting arraylist:");
        System.out.println(list);
        
    }
}
