<%@  page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/toppage.css">
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/animate.min.css">
<script src="../js/playerFormVali.js"></script>
<title>運ゲーすごろく</title>
</head>
<body>
    <%@ include file="header.jsp" %>
    <!-- プレイヤー人数選択(2~4)) -->
    <main>
        <form action="/Test/Test" method="post" name="id_forms">
                <span id="name_error" class="error_m"></span>
                <ul class="playersList animated bounceInLeft">
                    <li class="player">
                        <label for="name" class="tagu">プレイヤー名</label>
                        <input type="text" name="playerName"  maxlength="10" size="40">
                    </li>
                    <li class="player">
                        <label for="name" class="tagu">プレイヤー名</label>
                        <input type="text" name="playerName" maxlength="10" size="40">
                    </li>
                    <li class="player">
                        <label for="name" class="tagu">プレイヤー名</label>
                        <input type="text" name="playerName" maxlength="10" size="40">
                    </li>
                    <li class="player">
                        <label for="name" class="tagu">プレイヤー名</label>
                        <input type="text" name="playerName" maxlength="10" size="40">
                    </li>
                </ul>
                <p>
                    <input type="submit" value="参加" onclick="validation(); return false;" class="button">
                </p>
        </form>
    </main>
</body>
</html>