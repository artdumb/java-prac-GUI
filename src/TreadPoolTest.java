import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyTask implements Runnable{
    private String name;
    public MyTask(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + name);
            Thread.sleep((long)(Math.random()*1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class TreadPoolTest {
    public static void main(String[] args){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        for (int i =1; i<=5;i++){
            MyTask tast = new MyTask("작업"+i);
            System.out.println("작업생성 : " + tast.getName());
            executor.execute(tast);

        }
        executor.shutdown();
    }
}
