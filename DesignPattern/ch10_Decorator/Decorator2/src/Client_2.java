
public class Client_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display roadWithLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
		roadWithLaneAndTraffic.draw();
	}

}
