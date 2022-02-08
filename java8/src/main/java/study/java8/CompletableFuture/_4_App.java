package study.java8.CompletableFuture;

import java.util.Locale;
import java.util.concurrent.*;

/**
 * 16강 CompletableFuture
 * 자바에서 비동기를 가능하게 하는 인터페이스(자바8부터 지원)
 * -Future 단점
 * 1.예외처리 안됨
 * 2.Future들을 조합할 수 없다.
 */
public class _4_App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        //기존 방법
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Future<String> future = executorService.submit(() -> "hello");

        future.get();

         */


        /*
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.complete("choi");
       한번에 가능.
        CompletableFuture<String> completableFuture1 = CompletableFuture.completedFuture("choi");
        */

        /*
        실제 작업을 실행할때
        리턴이 없으면 runAsync로 실행.
        리턴이 있으면 supplyAsync사용
         */

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
        });
        future.get();

        CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        }).thenApply((s) -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        });

        System.out.println(future.get());




    }
}
