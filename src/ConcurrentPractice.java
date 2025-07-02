import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentPractice {

    public  static  void main(String[] args) throws  Exception {
        ExecutorService executer = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> {
            int a = 5;
            int b = 10;
            System.out.println("Caclulating sum rn");
            return a + b;
        };
        Future<Integer> future = executer.submit(task);
        System.out.println("Doing other work");
        Integer result=future.get();
        System.out.println("Sum result"+result);
        executer.shutdown();
    }
}
