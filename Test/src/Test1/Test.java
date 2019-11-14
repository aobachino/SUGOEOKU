package Test1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

@WebServlet("/Test")
public class Test extends HttpServlet {

	static Random random = new Random();
	static AdditionMoneyEvent plusEvent = new AdditionMoneyEvent();
	static SubtractionMoneyEvent minusEvent = new SubtractionMoneyEvent();
	static ProgressEvent progressEvent = new ProgressEvent();
	static MapData mapEvent = new MapData();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String[] names = request.getParameterValues("playerName");

		HttpSession session = request.getSession();

		int playerNumbers = 0;
		// もらったプレイヤーの名前を確保してset
		List<String> playerNames = new ArrayList<String>();

		for (int i = 0; i < names.length; i++) {
			if (!(names[i].equals(""))) {
				playerNumbers++;
				playerNames.add(names[i]);
			}
		}

		session.setAttribute("playerName", playerNames);

		// もらった名前でプレイヤーのデータを初期化してset
		List<PlayersData> playersList = new ArrayList<PlayersData>();

		for (int i = 0; i < playerNames.size(); i++) {
			if (i == 0)
				playersList.add(new PlayersData(playerNames.get(i), i, true));
			else
				playersList.add(new PlayersData(playerNames.get(i), i, false));
		}

		for (int i = 0; i < playerNumbers; i++) {
			session.setAttribute(playerNames.get(i), playersList.get(i));
			session.setAttribute("logs", playersList.get(i).getLogs());
		}

		String url = "jsp/amazing.jsp";
		response.sendRedirect(url);
	}

}
