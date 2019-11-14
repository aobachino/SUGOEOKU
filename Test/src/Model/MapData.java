package Model;

public class MapData {

	public int[] mapArea = new int[41];
	static AdditionMoneyEvent plusEvent = new AdditionMoneyEvent();
	static SubtractionMoneyEvent minusEvent = new SubtractionMoneyEvent();
	static ProgressEvent progressEvent = new ProgressEvent();

	public MapData() {
		// MEMO : 数字は以下の通り
		// START:0
		// 所持金加算  :1 18マス
		// 所持金2倍   :2 2マス
		// 所持金減算  :3 6マス
		// 所持金0     :4 2マス
		// アイテム購入:5 4マス
		// 進行マス    :6 3マス
		// 退行マス    :7 3マス
		// ゴール      :8

		mapArea[0] = 0;
		mapArea[1] = 1;
		mapArea[2] = 1;
		mapArea[3] = 3;
		mapArea[4] = 6;
		mapArea[5] = 7;
		mapArea[6] = 1;
		mapArea[7] = 3;
		mapArea[8] = 1;
		mapArea[9] = 1;
		mapArea[10] = 5;
		mapArea[11] = 1;
		mapArea[12] = 3;
		mapArea[13] = 1;
		mapArea[14] = 1;
		mapArea[15] = 2;
		mapArea[16] = 6;
		mapArea[17] = 4;
		mapArea[18] = 1;
		mapArea[19] = 1;
		mapArea[20] = 7;
		mapArea[21] = 5;
		mapArea[22] = 1;
		mapArea[23] = 6;
		mapArea[24] = 1;
		mapArea[25] = 1;
		mapArea[26] = 3;
		mapArea[27] = 4;
		mapArea[28] = 7;
		mapArea[29] = 1;
		mapArea[30] = 1;
		mapArea[31] = 5;
		mapArea[32] = 2;
		mapArea[33] = 3;
		mapArea[34] = 1;
		mapArea[35] = 1;
		mapArea[36] = 5;
		mapArea[37] = 1;
		mapArea[39] = 3;
		mapArea[40] = 8;
	}

	public PlayersData mapRun(PlayersData player) {
		if (player.progressCount >= 40) {
			progressEvent.GoalEvent(player);
			return player;
		}
		switch (mapArea[player.progressCount]) {
		case 1:
			plusEvent.IncreaseMoneyEvent(player);
			break;

		case 2:
			plusEvent.DoubleMoneyEvent(player);
			break;

		case 3:
			minusEvent.LoseMoneyEvent(player);
			break;

		case 5:
			minusEvent.BuyItemEvent(player);
			break;

		case 4:
			minusEvent.NoMoneyEvent(player);
			break;

		case 6:
			progressEvent.moveOnEvent(player);
			break;

		case 7:
			progressEvent.RetreatEvent(player);
			break;

		default:
			progressEvent.GoalEvent(player);

		}
		return player;
	}
}
