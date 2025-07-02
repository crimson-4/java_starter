import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import  java.util.Set;
public class HashMapPractice {
    public static  void main(String [] args)
    {
        Map<Integer ,Integer> mp= new HashMap<>();
        mp.clear();
        mp.put(1,3);
        mp.put(5,8);
        mp.put(3,4);
        mp.put(1,4);
        System.out.println(mp.get(1));;

//        if(mp.containsKey(5))
//        {
            System.out.println(mp.getOrDefault(7,4));
//        }

        for(Map.Entry<Integer,Integer> enty:mp.entrySet())
        {
            System.out.println(enty.getKey()+"-->"+enty.getValue()+"-->"+enty.getClass());
        }
        mp.remove(1);
        for(int el:mp.values())
        {
            System.out.println(el);
        }
        mp.clear();
    }
}
