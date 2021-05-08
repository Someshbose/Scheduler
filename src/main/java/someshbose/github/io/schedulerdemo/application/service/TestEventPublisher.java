package someshbose.github.io.schedulerdemo.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class TestEventPublisher {

    private ApplicationEventPublisher publisher;

    @Autowired
    TestEventPublisher(ApplicationEventPublisher publisher){
        this.publisher=publisher;
    }

    public void publishEvnt(TestEvent testEvent){
        publisher.publishEvent(testEvent);
    }
}
