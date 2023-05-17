package reactive;

import reactor.core.publisher.Mono;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        final Mono<String> mono = Mono.just("hello ");
        Thread thr = new Thread(() -> mono
                .map(msg -> msg + "thread")
                .subscribe(v -> System.out.println(v + Thread.currentThread().getName())));
        thr.start();
        thr.join();
    }
}
