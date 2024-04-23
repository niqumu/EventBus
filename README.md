## EventBus

This project is an extremely tiny and fast Java EventBus, originally written for Minecraft modding, but applicable to any Java application.

This EventBus operates on the simple concept of *Event Subscribers* and *Event Handlers*. Event Subscribers are classes that subscribe an instance of themselves to receive posted events, and Event Handlers are methods within Event Subscribers 
annotated via ``@EventHandler`` that handle matching posted events. The EventBus API provides a base ``Event`` interface that custom events should implement for usage with the bus. Developers can write their own custom implementations of the 
``EventBus`` interface.

## Examples

Example of a custom event:

```java
import dev.niqumu.eventbus.api.Event;

public class DummyEvent implements Event {
    public final String dummyName;
    public final int dummyId;

    public DummyEvent(String name, int id) {
        this.dummyName = name;
        this.dummyId = id;
    }
}
```

Example of an event listen for the custom event:

```java
public class DummyEventListener {
    public DummyEventListener() {
        eventBus.registerSubscriber(this);
    }

    @EventHandler
    public void onDummyEvent(DummyEvent event) {
        // ...
    }
}
```

Example of posting a custom event:

```java
    DummyEvent event = new DummyEvent(name, id);
    eventBus.postEvent(event);
```
