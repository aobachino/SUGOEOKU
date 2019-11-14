package Model;

import java.util.List;
import java.util.Random;

public class ProgressEvent {

	public PlayersData moveOnEvent(PlayersData playerData) {
		Random random = new Random();
		int moveCount = (random.nextInt(3) + 1);
		playerData.progressCount += moveCount;
		playerData.setLogs(playerData.name + "は進行マスに止まり、さらに" + moveCount + "マス進んだ。");

		return playerData;
	}

	public PlayersData RetreatEvent(PlayersData playerData) {
		Random random = new Random();
		int moveCount = (random.nextInt(3) + 1);
		playerData.progressCount -= moveCount;
		playerData.setLogs(playerData.name + "は退行マスに止まり、" + moveCount + "マス戻った。");

		return playerData;
	}

	public PlayersData GoalEvent(PlayersData playerData) {
		playerData.goalFlg = true;
		playerData.setLogs(playerData.name + "がゴールしました。");
		playerData.progressCount = 40;

		if (playerData.itemCount >= 1) {
			playerData.money += (30000 * playerData.itemCount);
			playerData.setLogs(playerData.name + "はアイテムを" + playerData.itemCount + "個売り、"
					+ "所持金が" + playerData.money + "になった。");
		}

		return playerData;

	}

	public boolean assertAllGoalFlg(List<PlayersData> playersData) {

		if (playersData.stream().allMatch(players -> players.goalFlg == true))
			return true;
		else
			return false;

	}
}
