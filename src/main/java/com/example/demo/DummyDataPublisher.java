package com.example.demo;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.eventhandling.GenericEventMessage;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
class DummyDataPublisher {

    private final EventStore eventStore;

    @Autowired
    DummyDataPublisher(EventStore eventStore) {
        this.eventStore = eventStore;
    }

    @Scheduled(fixedRate = 1000)
    void publishEvent() {
        eventStore.publish(GenericEventMessage.asEventMessage(new Object()));
    }

    @EventHandler
    void handle(final Object event) {

    }
}
