package HW8;
import java.util.ArrayList;
import java.util.Random;


public class PublisherImpl implements Publisher {

	private ArrayList<Subscriber> subscribers= new ArrayList<Subscriber>();
	
	public PublisherImpl() {}
	
	@Override
	public void registerSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscribers.add(s);
	}

	@Override
	public void unregisterSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscribers.remove(s);
	}

	@Override
	public void notifySubscribers(Event e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < subscribers.size(); i++) {
            subscribers.get(i).notifysubscriber(e);
        }
	}
	
	private Event generateEvent(int eventNum, int eventDataVal) {
		Event eve = new Event(eventNum, eventDataVal);
		return eve;	
		
	}
	public void runSimulation(int numEvents) {
		for (int i = 1; i <= numEvents; i++) {
            Random rand = new Random();
            int randInt = rand.nextInt(200);
            Event e = generateEvent(i, randInt);
            
         }
    }

	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		
	}
        
	
	

}
