package HW8;
public class HWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PublisherImpl pub = new PublisherImpl();
		
		Subscriber odd = new SubscriberOdds();
		Subscriber even = new SubscriberEven();
		Subscriber three = new SubscriberThrees();
		
		pub.registerSubscriber(odd);
        pub.registerSubscriber(even);
        pub.registerSubscriber(three);

        int howManySims = 200;
        pub.runSimulation(howManySims);

	}

}
