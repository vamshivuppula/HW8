package HW8;

public interface Publisher {
	public void registerSubscriber(Subscriber s);
	public void unregisterSubscriber(Subscriber s);
	public void notifySubscribers();
	void notifySubscribers(Event e);
}
