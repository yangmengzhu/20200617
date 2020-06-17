

/*
 * @program: 2020614
 * @description
 * @author: mrs.yang
 * @create: 2020 -06 -14 16 :53
 */

public class TestDemo {
    static class A extends Thread{
        @Override
        public void run() {
            System.out.println("我是A类");
        }
    }
    static class B implements Runnable{
        @Override
        public void run() {
            System.out.println("我是B类");
        }
     }
    public static void main(String[] args) {
        Thread thread;
        {
            A a = new A();
            thread = a;
            thread.start();
        }
        {
        B b=new B();
        thread=new Thread(b);
        thread.start();
        }
        {
            A a = new A();
            thread=new Thread(a);
            thread.start();
        }
    }
}
