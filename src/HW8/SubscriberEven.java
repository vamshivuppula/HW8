package HW8;

public class SubscriberEven implements Subscriber {
	private int eventsHandled=0;
	private int turnOffThreshold;
	int threshold = 14;
	public SubscriberEven() {}
	
	
	@Override
	public boolean notifysubscriber(Event e) {
		if (e.getEventDataValue() % 2 == 0) {
			eventsHandled ++;
			if(eventsHandled <= threshold) {
				System.out.println("SubscriberEvens Event " + e.getEventSeqNum() + " is even: " + e.getEventDataValue());
				return true;
			}
            if (eventsHandled > threshold) {
            	if(eventsHandled % 40 == 0) {
            		eventsHandled = 0;
            	}            
            }	
            
        }
		return false;
	}
	
	private void setEventsHandled(int b) {
		eventsHandled = b;
		
	}

	private int getEventsHandled() {
		return 	eventsHandled;
	}

}
