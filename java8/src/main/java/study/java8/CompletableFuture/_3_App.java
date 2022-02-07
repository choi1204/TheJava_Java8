package study.java8.CompletableFuture;

import java.util.concurrent.*;

/**
 * 15강 Callable과 Future
 * Callabe : Runnable과 비슷하지만 리턴값을 가질 수 있다.
 */

public class _3_App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(20000L);
            return "Hello";
        };

        Future<String> submit = executorService.submit(hello);
        System.out.println(submit.isDone());
        System.out.println("Started!");

        submit.get();
        System.out.println(submit.isDone());
        System.out.println("End!");
        executorService.shutdown();

        //invokeAll -> 동시에 실행한 작업중에 제일 오래 걸리는 작업만큼 시간이 걸림.
        //invokeAny() -> 가장 빨리 끝나는 작업만큼 시간이 걸림 블록킹
    }
}
