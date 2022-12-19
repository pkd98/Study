
public class Client {

	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);

		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		scoreRecord.attach(dataSheetView3);
		scoreRecord.attach(dataSheetView5);

		scoreRecord.attach(minMaxView);
		
		for (int index = 1; index <= 5; index++) {
			int score = index*10;
			System.out.println("Adding " + score);
			//10 20 30 40 50을 추가함, 추가할 떄마다 최대 3개의 점수만 출력
			scoreRecord.addScore(score);
		}
	}

}
