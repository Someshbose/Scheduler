package someshbose.github.io.schedulerdemo.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import someshbose.github.io.schedulerdemo.application.service.TestEvent;
import someshbose.github.io.schedulerdemo.application.service.TestEventPublisher;

@Component
public class ScheduledJob {

    @Autowired
    private TestEventPublisher publisher;

    @Scheduled(fixedRate = 1000)
    public void fixedRateSch() {
        System.out.println("A job is scheduled!!!!");
        publisher.publishEvnt(new TestEvent("Somesh"));
    }
}
