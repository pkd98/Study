
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display road = new RoadDisplay();
		road.draw();
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay());
		roadWithLane.draw();
		
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
		roadWithTraffic.draw();
	}

}
