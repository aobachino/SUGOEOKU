<%@
	page language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8" session="false"
	import="Model.PlayersData"
	import="javax.servlet.http.HttpSession"
	import="java.util.ArrayList"
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css/amazing.css">
    <link rel="stylesheet" href="../css/header.css">
    <link rel="stylesheet" href="../css/animate.min.css">
    <script type="text/javascript" src="../js/roulette.js"></script>
        <script type="text/javascript" src="../js/result.js"></script>
    <title>運ゲーすごろく</title>
</head>
<body>
	<%
		// 宣言
		HttpSession session = request.getSession();
		ArrayList<String> playerNames = new ArrayList<String>();
		ArrayList<Integer> playerMoneys = new ArrayList<Integer>();
		ArrayList<Integer> playerProgress = new ArrayList<Integer>();
		ArrayList<PlayersData> playerList = new ArrayList<PlayersData>();
		ArrayList<String> logs = new ArrayList<>();
		//アプリケーションスコープからインスタンスを取得
		playerNames = (ArrayList<String>)session.getAttribute("playerName");
		String name = "";
		for(String str:playerNames){
			PlayersData p = (PlayersData) session.getAttribute(str);
			playerList.add(p);
			playerMoneys.add(p.money);
			playerProgress.add(p.progressCount);
		}
		for(PlayersData data:playerList){
			if(data.orderFlg == true){
				name = data.name;
			}
		}
		//PlayersData p = (PlayersData) session.getAttribute(name);
		logs = (ArrayList<String>)session.getAttribute("logs");
	%>
	<%@ include file="header.jsp" %>
	<input type="hidden" value="<%=playerProgress%>" id="pProgress"/>
	<input type="hidden" value="<%=playerNames%>" id="pName"/>
	<div class="container">
	    <main class="main">
	    	<%if(name != ""){ %>
		    <h3 class="animated zoomIn" align="center"><%= name %>のターンです。</h3>
		    <%} else{ %>
		    <h3 class="animated heartBeat" align="center">ゲーム終了です</h3>
		    <%} %>
    		<section>
				<%@ include file="trout.jsp" %>
        	</section>
        </main>
	    <nav class="navigation">
	            <%if(name != ""){ %>
					<div class="outline">
	            		<div class="roulette" id="roulette">1</div>
	            		<br />
	            		<div class="inline">
			            	<input type="button" value="start" id="start" onclick="start();" class="button"/>
	       			    	<input type="button" value="stop" id="stop" onclick="stop();" class="button"/>
	     		    	</div>
	     		    </div>
	            <%} else{ %>
	            	<div class="outline">
	            		<input type="button" value="結果計算" onclick="calc();" class="button animated bounceInDown"/>
	            		<input type="hidden" value="<%=playerMoneys%>" id="resMoney"/>
	            		<input type="hidden" value="<%=playerNames%>" id="resName"/>
	            	</div>
	            <%} %>
	        <br />
			<table border="1"class="status">
				<%for(int i=0;i<playerList.size();i++){ %>
					<tr >
						<th><%= "P".concat(String.valueOf(i+1)) %></th>
						<td><%= playerList.get(i).name %></td>
						<td><%= playerList.get(i).money %>円</td>
						<td><%= playerList.get(i).progressCount %>マス</td>
					</tr>
				<%} %>
			</table>
			<%if(!logs.equals(null) ){ %>
				<table border="1"class="status animated flipInX">
					<%for(int i=0;i<logs.size();i++){ %>
						<tr>
							<td><%= logs.get(i) %></td>
						</tr>
					<% } %>
				</table>
			<% } %>
			<div id="result">

			</div>
			<br>
			<form action="/Test/Test">
		    	<input type="submit" value="戻る" id="retuen" class="button"/>
			</form>
	    </nav>
    </div>
</body>
</html>