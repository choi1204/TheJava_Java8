package study.java8.CompletableFuture;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 14강 Executors
 * Thread와 같은 low Level Api가 아닌 쓰레드를 만들고 관리한느 작업을 고수준의 api에 위임.
 * Executors가 쓰레드를 생성하고 관리 실행함.
 * 우리는 Runnable만 만들어서 해야할일만 주면 됨.
 */
public class _2_App {

    public static void main(String[] args) {

        /*
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //executorService는 작업을 실행 후에 다음 작업이 들어올때까지 대기를 함. 명시적으로 종료 필요.
        executorService.execute(() -> System.out.println("Thread: " + Thread.currentThread().getName()));

        //shutdown은 쓰레드가 현재 진행중인 작업 종료후에 종료.
        executorService.shutdown();

        //shutdownNow는 바로 종료.
        executorService.shutdownNow();

         */

        /*
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(getRunnable("Hello"));
        executorService.submit(getRunnable("Hell"));
        executorService.submit(getRunnable("Hel"));
        executorService.submit(getRunnable("He"));
        executorService.submit(getRunnable("H"));
         */

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(getRunnable("Hello"), 3, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(getRunnable("Hello"), 1, 2, TimeUnit.SECONDS);

    }

    private static Runnable getRunnable(String message) {
        return () -> System.out.println(message + Thread.currentThread().getName());
    }
}
