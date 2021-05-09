package someshbose.github.io.schedulerdemo.application.service;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class TestEventListener {

    @EventListener
    @Async
    public void handleTestEvent(TestEvent event) throws InterruptedException{
        System.out.println("Event consumed-"+event.getName()+"by"+Thread.currentThread().getName());
        Thread.sleep(5000L);
        System.out.println("Event consumed task complete!!");
    }
}
