package study.java8.CompletableFuture;

/**
 * 13강 자바 Concurrent 프로그래밍
 *
 */
public class _1_App {

    public static void main(String[] args) {

        /*
        //현재 쓰레드는 main쓰레드
        System.out.println(Thread.currentThread().getName());

        //쓰레드의 순서는 보장하지 않는다. Hello가 먼저 출력될수도 Thread가 먼저 출력될수도 있다.
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello: " + Thread.currentThread().getName());

         */

        /*

        //다른쓰레드를 만드는 방법 2 : new Runnable사용
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: " + Thread.currentThread().getName());
            }
        });
        thread.start();

        System.out.println("Hello: " + Thread.currentThread().getName());
  */

        Thread thread = new Thread(() -> {
            try {
                //다른 스레드에 우선권
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                //sleep 동안 누군가가 깨울경우 catch문에 들어옴
                e.printStackTrace();
            }
            System.out.println("Thread: " + Thread.currentThread().getName());
        });
        thread.start();

        System.out.println("Hello: " + Thread.currentThread().getName());


    }

    //다른쓰레드를 만드는 방법 1 : Thread를 상속받아서 만듬
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }
}
