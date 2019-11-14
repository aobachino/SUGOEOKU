package Model;

import java.util.Random;

public class SubtractionMoneyEvent {

	Random random = new Random();

	public PlayersData NoMoneyEvent(PlayersData playerData){
		playerData.money = 0;
		playerData.setLogs(playerData.name+"の所持金が0になった。");

		return playerData;
	}

	public PlayersData LoseMoneyEvent(PlayersData playerData) {
		int loseMoney = (random.nextInt(10)+1)*10000;
		playerData.money -= loseMoney;
		playerData.setLogs(playerData.name+"の所持金が"+ loseMoney +"円減った。");

		return playerData;
	}

	public PlayersData BuyItemEvent(PlayersData playerData) {
		int itemValue = (random.nextInt(10)+1)*10000;

		if(playerData.money >= itemValue) {
			playerData.money -= itemValue;
			playerData.itemCount++;
			playerData.setLogs(playerData.name+"は"+itemValue+"円のアイテムを1つ購入した。");
		}
		else {
			playerData.setLogs(playerData.name+"は所持金不足でアイテムを購入できなかった。");
		}

		return playerData;
	}
}
