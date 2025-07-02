public class volatileClass {

    public static void main(String [] args) throws  Exception{
            Flag flag= new Flag();
            Thread t1= new Thread(()->{
                while (flag.running)
                {
                    System.out.println("running until manually stopped");
                }
            });
            Thread t2= new Thread(()->{
                try {
                    Thread.sleep(2000);
                    System.out.println("Gonna mark the flag false");
                    flag.stop();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
    }
}

class  Flag{
    volatile boolean running=true;
    void stop(){
        running=false;
    }
    void run(){
        while (running){
            System.out.println("latest changes");
        }
    }
}
