import java.util.Scanner;

/**
 * @program: 2020614
 * @description
 * @author: mrs.yang
 * @create: 2020 -06 -16 16 :11
 */

public class ThreadStop {
    static class B extends Thread{
        @Override
        public void run() {
            Thread t=Thread.currentThread();
            try{
                while(true){
                    System.out.println("正在挖煤");
                    Thread.sleep(1000);
                    // boolean interrupted = Thread.interrupted();
                    boolean interrupted= t.isInterrupted();
                    System.out.println("是否有人让我停止运行"+interrupted);
                    if(interrupted==true){
                        break;
                    }
                }
            }catch(InterruptedException e){
                System.out.println("有人让我停止运行，但正在sleep,所以受到了这个异常");
                return;
            }

        }
    }

    public static void main(String[] args) {
        B b=new B();
        b.start();
        Scanner scan=new Scanner(System.in);
        scan.nextLine();
        System.out.println("准备通知B线程停止");
        b.interrupt();//通知B停止
        System.out.println("已经通知B线程停止");
    }
}
