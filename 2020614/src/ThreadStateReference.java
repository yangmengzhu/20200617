import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @program: 2020614
 * @description
 * @author: mrs.yang
 * @create: 2020 -06 -16 19 :16
 */

public class ThreadStateReference {
    static class SubThread extends Thread{
        @Override
        public void run() {
            Scanner scan=new Scanner(System.in);
            scan.nextLine();
            System.out.println("子线程即将退出");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread p=new SubThread();
        System.out.println(p.getState());
        p.start();
        while(p.isAlive()){
            System.out.println(p.getState());
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(p.getState());
    }
}
