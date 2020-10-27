package HW8;
import junit.framework.*;

public class SubscriberEvenstest {

	@Test
	void test_underThreshold() {
		Event e = new Event(1,4);
		SubscriberEven s = new SubscriberEven();
		assertEquals(true,s.notifysubscriber(e));
	}
	
	@Test
	void test_overthreshold() {
		Event e = new Event(1,4);
		SubscriberEven s = new SubscriberEven();
		s.setEventsHandled(100);
		assertEquals(false,s.notifysubscriber(e));
	}
	
	@Test
	void test_overthreshold() {
		Event e = new Event(1,4);
		SubscriberEven s = new SubscriberEven();
		s.setEventsHandled(40);
		assertEquals(true,s.notifysubscriber(e));
	}
	
	
	}

