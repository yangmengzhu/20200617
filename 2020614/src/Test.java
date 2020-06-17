/*
 * @program: 2020614
 * @description
 * @author: mrs.yang
 * @create: 2020 -06 -14 19 :51
 */

  public class Test {
      static class SubThread extends Thread{
          SubThread(){
              super("yang");
          }

          @Override
          public void run() {
              //为该线程指定要运行的任务
              try{
                  printThread();
                  Thread.sleep(100 * 1000);
              }catch(InterruptedException e){

              }
          }
      }
    public static void main(String[] args) throws InterruptedException {
       Thread t1=new SubThread();//创建线程对象，
        t1.start();//将线程加入就绪状态中
        Thread t2=new SubThread();//创建线程对象，
        t2.start();//将线程加入就绪状态中
        //打印主线程的信息
            printThread();
        Thread.sleep(100 * 1000);
    }

      private static void printThread() {
         Thread t=Thread.currentThread();
         long id=t.getId();
          System.out.println("线程的id "+id+" "+t.getId());
          System.out.println("线程的名字 "+id+" "+t.getName());
          System.out.println("线程的优先级 "+id+" "+t.getPriority());
          System.out.println("线程的状态 "+id+" "+t.getState() );
          System.out.println("线程是否存活 "+id+" "+t.isAlive() );
          System.out.println("线程是否是后台 "+id+" "+t.isDaemon());
      }
  }
