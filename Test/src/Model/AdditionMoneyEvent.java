package Model;

import java.util.Random;

public class AdditionMoneyEvent {

	public PlayersData DoubleMoneyEvent(PlayersData playerData){
		playerData.money *= 2;
		playerData.setLogs(playerData.name+"の所持金が2倍になった。");

		return playerData;
		// 所持金がマイナスのときの処理が考慮できてなかった
	}

	public PlayersData IncreaseMoneyEvent(PlayersData playerData) {
		Random random = new Random();
		int increaseMoney = (random.nextInt(10)+1)*10000;
		playerData.money += increaseMoney;
		playerData.setLogs(playerData.name+"の所持金が"+increaseMoney+"円増えた。");

		return playerData;
	}

}
