package HW8;

public class Event {
	private int EventSequenceNum;
	private int EventDataValue;
	
	public Event(int eventNum, int eventDataVal) {
		EventSequenceNum = eventNum;
		EventDataValue = eventDataVal;
    }
	
	public int getEventSeqNum(){
		
		return EventSequenceNum;
		
	}
	
	public int getEventDataValue() {
		return EventDataValue;
		
	}

}
