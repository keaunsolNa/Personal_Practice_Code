package queue;

public class SimClient implements Client{
	int id, arrivalTime = -1, startTime = -1, stopTime = -1;

	public SimClient(int id, int t) {
		this.id = id;
		arrivalTime = t;
		System.out.println(this + " arrived at time " + t);
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public int getStopTime() {
		return stopTime;
	}
	
	@Override
	public void setStartTime(int t) {
		startTime = t;
	}

	@Override
	public void setStopTime(int t) {
		stopTime = t;
	}
	
	public String toString() {
		return "Client " + id;
	}
	
	
}
