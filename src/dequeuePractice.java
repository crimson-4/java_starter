import java.util.ArrayDeque;
import java.util.Deque;

public class dequeuePractice {
    public static  void main(String [] args){
        Deque<String>dq=new ArrayDeque<>();
        dq.addFirst("amar");
        dq.addLast("jeet");
        dq.addFirst("where");
        for(String el:dq)
        {
            System.out.println(el);
        }
        System.out.println("Removed first:"+ dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
