
public class Client {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		//3개 까지 점수 출력
		DataSheetView dataSHeetView = new DataSheetView(scoreRecord, 3);
		
		scoreRecord.setDataSheetView(dataSHeetView);
		
		for (int index = 1; index <= 5; index++) {
			int score = index*10;
			System.out.println("Adding " + score);
			//10 20 30 40 50을 추가함, 추가할 떄마다 최대 3개의 점수만 출력
			scoreRecord.addScore(score);
		}
	}

}
