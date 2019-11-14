package Test1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.AdditionMoneyEvent;
import Model.MapData;
import Model.PlayersData;
import Model.ProgressEvent;
import Model.SubtractionMoneyEvent;

@WebServlet("/Game")
public class Game extends HttpServlet {

	static Random random = new Random();
	static AdditionMoneyEvent plusEvent = new AdditionMoneyEvent();
	static SubtractionMoneyEvent minusEvent = new SubtractionMoneyEvent();
	static ProgressEvent progressEvent = new ProgressEvent();
	static MapData mapEvent = new MapData();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		Enumeration<String> diceStr = request.getParameterNames();
		int dice = Integer.parseInt(diceStr.nextElement());
		HttpSession session = request.getSession();
		List<String> playerNames = new ArrayList<String>();
		playerNames = (List<String>) session.getAttribute("playerName");

		List<PlayersData> playersList = new ArrayList<PlayersData>();
		for (int i = 0; i < playerNames.size(); i++) {
			playersList.add((PlayersData) session.getAttribute(playerNames.get(i)));
		}

		gameExecute(playersList.stream().filter(p -> p.orderFlg == true).findFirst().get(), dice);

		int currentNum = playersList.stream().filter(p -> p.orderFlg == true).findFirst().get().playOrder;
		session.setAttribute("logs", playersList.get(currentNum).getLogs());
		// MEMO 順番フラグを書き換えます。

		playersList.get(currentNum).orderFlg = false;

		for (int i = 0; i < playersList.size(); i++) {
			currentNum++;
			if (currentNum >= playersList.size())
				currentNum = 0;

			if (playersList.get(currentNum).goalFlg == false) {
				playersList.get(currentNum).orderFlg = true;
				break;
			}
		}

		for (int i = 0; i < playersList.size(); i++) {
			session.setAttribute(playerNames.get(i), playersList.get(i));
		}
		response.setContentType("text/html");
		String url = "jsp/amazing.jsp";
		RequestDispatcher dispatch = request.getRequestDispatcher(url);
		dispatch.forward(request, response);

	}

	public void gameExecute(PlayersData currentPlayer, int diceValue) {
		currentPlayer.clearLogs();
		currentPlayer.diceProgress(diceValue);
		mapEvent.mapRun(currentPlayer);
	}

}
