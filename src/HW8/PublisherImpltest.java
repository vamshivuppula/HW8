package HW8;
import junit.framework.*;
public class PublisherImpltest {
	
	@Test
	void testSubscriberadd() {
		PublisherImpl p = new PublisherImpl();
		Subscriber odd = new SubscriberOdds();
		Subscriber even = new SubscriberEven();
		Subscriber three = new SubscriberThrees();
		p.registerSubscriber(odd);
		p.registerSubscriber(even);
		p.registerSubscriber(three);
		assertEqual([odd,even,three],p.subscribers);
		
	}
	@Test
	void testSubscriberremove() {
		PublisherImpl p = new PublisherImpl();
		Subscriber odd = new SubscriberOdds();
		Subscriber even = new SubscriberEven();
		Subscriber three = new SubscriberThrees();
		p.unregisterSubscriber(odd);
		p.unregisterSubscriber(even);
		p.unregisterSubscriber(three);
		assertEqual([],p.subscribers);
		
	}

}
