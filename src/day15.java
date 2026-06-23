import java.time.Duration;

public class day15 {
    static void main() throws InterruptedException{
        Runnable chefTask=() ->{
            String[] item={"Burger","pizza","Shawarma"};
            for (int i=0;i<item.length;i++){
                System.out.println("cooking item:"+item[i]);
                try {
                Thread.sleep(5000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e){
                    };
                }
            }
        };
        Thread chefThread=new Thread(chefTask,"chef-thread");
                chefThread.start();
        chefThread.join();
    }
}
