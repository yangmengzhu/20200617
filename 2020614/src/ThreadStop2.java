

import java.util.Scanner;

/**
 * @program: 2020614
 * @description
 * @author: mrs.yang
 * @create: 2020 -06 -16 16 :39
 */

public interface ThreadStop2 {
   // private static volatile boolean isInterrupted=false;
    static class B extends Thread{
        B(){
            super("B");
        }
        @Override
        public void run() {
            while(true){
                try{
                    System.out.println("正在挖煤");
                    Thread.sleep(60000);
                    //System.out.println("是否有人让我停止运行"+isInterrupted);
                }catch(InterruptedException e){

                }

            }

        }
    }

    public static void main(String[] args) {
        B b=new B();
        b.start();
        Scanner scan=new Scanner(System.in);
        scan.nextLine();
        System.out.println("准备通知B线程停止");
       //isInterrupted=true;
        System.out.println("已经通知B线程停止");
    }
}
