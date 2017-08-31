package com.srilatha;

public class Threads {
    static int count = 0;

    public static void main(String s[]){



        Thread t = new Thread("mythread"){
            public void run(){
                count++;
                System.out.println(this.getName() + count);

            }
        };
  Thread t1 = new Thread("thread1 "){
            public void run(){
                count++;
                System.out.println(this.getName() + count);

            }
        };
  Thread t2 = new Thread("thread2 "){
            public void run(){
                count++;
                System.out.println(this.getName() + count);

            }
        };

        Thread t3 = new Thread("thread2 "){
            public void run(){
                count++;
                System.out.println(this.getName() + count);

            }
        };

            t.start();
            t1.start();
            t2.start();
            t3.start();

            System.out.println(Thread.currentThread().getName() + count);

    }
}
