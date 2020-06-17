/*
 * @program: 2020614
 * @description
 * 加入队列就绪是确定的，什么时候被调度到cpu不确定，什么时候被从cpu上调度下来不确定（随机-理论上）
 * 为什么现象上看起来固定？
 * 主线程现在能创建两个线程，代表主线程占据着cpu，任何代码执行的前提，都是该线程拥有cpu
 *     主线程创建两个线程+打印诗词main需要的时间远远小于时间片，
 *     所以可以认为时间片耗尽之前，主线程可以把所有事情干完
 * //只有main执行结束放弃cpu，A和B才有资格抢cpu--先就绪的的先被调度（大概率）
 * @author: mrs.yang
 * @create: 2020 -06 -14 18 :41
 */

public class WHoFirst {
    static class printA extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("A");
            }
        }
    }
    static class printB  extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("B");
            }
        }
    }

    public static void main(String[] args) {
        printA a=new printA();
        printB b=new printB();
        a.start();
        b.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main");
        }
    }
}
