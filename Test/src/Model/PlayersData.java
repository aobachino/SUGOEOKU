package Model;

import java.util.ArrayList;

public class PlayersData {

	public String name;
	public int itemCount = 0;
	public int money = 100000;
	public int progressCount = 0;
	public int playOrder = 0;
	public boolean orderFlg = false;
	public boolean goalFlg = false;
	private ArrayList<String> logs = new ArrayList<>();

	public PlayersData(String playerName, int order, boolean firstFlg) {
		name = playerName;
		playOrder = order;
		orderFlg = firstFlg;
	}

	public PlayersData(String playerName) {
		name = playerName;
	}

	public ArrayList<String> getLogs() {
		return logs;
	}

	public void setLogs(String log) {
		this.logs.add(log);
	}

	public void clearLogs() {
		this.logs.clear();
	}

	public void diceProgress(int diceValue) {

		this.progressCount += diceValue;
		this.setLogs(this.name + "は" + diceValue + "マス進んだ。");
	}

}
