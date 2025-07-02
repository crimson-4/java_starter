import  java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedThreadPractice {
    public static  void main(String [] args )
    {
        ExecutorService executer= Executors.newFixedThreadPool(3);

        for(int i=0;i<=5;i++)
        {
            int taskId=i;
            executer.submit(()->{
                System.out.println("Task with "+taskId+"is running");
                try{
                    Thread.sleep(2000);
                }
                catch (Exception e){
                    Thread.currentThread().interrupt();
                }
            });


        }
        executer.shutdown();

    }
}
