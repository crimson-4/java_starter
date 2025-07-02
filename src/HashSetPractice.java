import java.util.ArrayList;
import  java.util.HashSet;
import  java.util.Set;
public class HashSetPractice {
    public static  void main(String [] args)
    {
        Set<String> set= new HashSet<>();
        set.add("temp");
        set.add("banana");
        set.add("arctic");
        set.remove("banana");
        for(String s:set)
            System.out.println(s);
        System.out.println(set.contains("banana"));
        System.out.println(set.isEmpty());
        ArrayList<String> al=new ArrayList<>(set);
        for(String el:al)
            System.out.print(el+"\n");


    }
}
