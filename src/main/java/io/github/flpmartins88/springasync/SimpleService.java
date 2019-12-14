package io.github.flpmartins88.springasync;

import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    private static final Logger log = LoggerFactory.getLogger(SimpleService.class);

    @Async
    public CompletableFuture<String> process(Integer processNumber) throws InterruptedException {
        log.info("processing");
        Thread.sleep(2 * 1000);
        log.info("done");
        return CompletableFuture.completedFuture("done " + processNumber);
    }

}
