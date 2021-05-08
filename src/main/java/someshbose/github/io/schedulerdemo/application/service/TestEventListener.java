package someshbose.github.io.schedulerdemo.application.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestEventListener {

    @EventListener
    public void handleTestEvent(TestEvent event){
        System.out.println("Event consumed-"+event.getName());
    }
}
