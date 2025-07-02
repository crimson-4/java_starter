import java.util.LinkedList;
import java.util.Queue;


public class Pq{
    int a;
    Pq(int a)
    {
        this.a=a;
    }
}

void main() {
       Pq at= new Pq(10);
       System.out.println("vaue: "+at.a);
        Queue<String> q=new LinkedList<>();
        q.add("first");
        q.add("Second");
        q.add("Third");
        System.out.println("Current qeueu :"+q);
        System.out.println(q.element());
        q.remove();
        System.out.println(q);

}