package HW8;

public class SubscriberThrees implements Subscriber {
	private int eventsHandled =0;
	private int turnOffThreshold;
	int threshold = 10;
	public SubscriberThrees() {}
	
	
	@Override
	public boolean notifysubscriber(Event e) {
		if (e.getEventDataValue() % 3 == 0) {
			eventsHandled ++;
			if(eventsHandled <= threshold) {
				System.out.println("SubscriberThrees Event " + e.getEventSeqNum() + " is divisible by 3: " + e.getEventDataValue());
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
