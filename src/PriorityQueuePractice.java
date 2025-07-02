import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    Integer a;
    String c;
    Pair(Integer a,String c)
    {  this.c=c;
        this.a=a;
    }
}

public class PriorityQueuePractice {
    public static void  main(String [] args){
        PriorityQueue<Integer>pq= new PriorityQueue<>();

        pq.offer(1);
        pq.add(2);
        pq.offer(3);
        for(Integer el:pq)
        {
            System.out.println(el);
        }
        while (!pq.isEmpty())
        {
            System.out.println(pq.poll());
        }
        Comparator<Pair>cp=(Pair p1,Pair p2)->{
//            if(p1.a==p2.a)
//            {
//                return p1.c.compareTo(p2.c);
//
            return p2.a-p1.a;
        };
        PriorityQueue<Pair> ppq=new PriorityQueue<Pair>(cp);

        Pair p=new Pair(1,"amar");
        ppq.offer(p);
        p=new Pair(2,"jeet");
        ppq.offer(p);
        p= new Pair(4,"kit");

        ppq.offer(p);
        ppq.offer(new Pair(7,"tamar"));
         p=new Pair(2,"amar");
         ppq.offer(p);
        while (!ppq.isEmpty())
        {
            System.out.println(ppq.peek().c+" "+ppq.peek().a);
            ppq.poll();
        }
    }
}
