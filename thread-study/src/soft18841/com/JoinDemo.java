package soft18841.com;

import jdk.nashorn.internal.ir.IfNode;

public class JoinDemo extends Thread {
    public void run(){
        for (int i = 10;i>-1;i--){
            System.out.println(i);
            if (i <= 0 ){
                System.out.println("节目开始");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("开始倒数");
        Thread thread = new Thread();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JoinDemo joinDemo = new JoinDemo();
        joinDemo.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
