import  java.util.*;
public class LoopList {
    public static void main(String [] args)
    {
//        List<Integer> il= new ArrayList<>(Arrays.asList(6,7,8));
//        for(int i=0;i<il.size();i++)
//        {
//            System.out.print(il.get(i));
//            System.out.println(il.contains(4));
//        }
//        System.out.println("\n");
//        for(int el:il)
//            System.out.print(el);
        try {
            ArrayList<String> fruits = new ArrayList<>(Arrays.asList("mango"));
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Kiwi");
            System.out.println(fruits.get(2));
            fruits.set(2, "strawberry");
            System.out.println(fruits);
            fruits.remove(0);
            System.out.println(fruits);
            fruits.clear();
        }
        catch (IndexOutOfBoundsException io)
        {
            System.out.println(io);

        }

    }
}
