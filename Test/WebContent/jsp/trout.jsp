<%@
	page language="java"
	contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8" session="false"
	import="Model.PlayersData"
	import="javax.servlet.http.HttpSession"
	import="Model.PlayersData"
	import="java.util.ArrayList"
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="../css/trout.css">
    <script src="https://cdn.jsdelivr.net/npm/leader-line@1.0.1/leader-line.min.js"></script>
    <title>Document</title>
</head>
<body>
    <section>
        <article class="line1">
            <div id="0" class="start" align="center">
                <p>Start</p>
            </div>
            <div id="1" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="2" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="3" class="minus" align="center">
            	<p>-\</p>
            </div>
            <div id="4" class="progress" align="center">
            	<p>+</p>
            </div>
            <div id="5" class="progress" align="center">
            	<p>-</p>
            </div>
            <div id="6" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="7" class="minus" align="center">
            	<p>-\</p>
            </div>
        </article>
        <article class="line2">
            <div id="15" class="plus" align="center">
            	<p>\×2</p>
            </div>
            <div id="14" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="13" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="12" class="minus" align="center">
            	<p>-\</p>
            </div>
            <div id="11" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="10" class="buy" align="center">
            	<p>購入</p>
            </div>
            <div id="9" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="8" class="plus" align="center">
            	<p>+\</p>
            </div>
        </article>
        <article class="line2">
            <div id="16" class="progress" align="center">
            	<p>+</p>
            </div>
            <div id="17" class="minus" align="center">
            	<p>\0</p>
            </div>
            <div id="18" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="19" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="20" class="progress" align="center">
            	<p>-</p>
            </div>
            <div id="21" class="buy" align="center">
            	<p>購入</p>
            </div>
            <div id="22" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="23" class="progress" align="center">
            	<p>+</p>
            </div>
        </article>
        <article class="line3">
            <div id="31" class="buy" align="center">
            	<p>購入</p>
            </div>
            <div id="30" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="29" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="28" class="progress" align="center">
            	<p>-</p>
            </div>
            <div id="27" class="minus" align="center">
            	<p>\0</p>
            </div>
            <div id="26" class="minus" align="center">
            	<p>-\</p>
            </div>
            <div id="25" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="24" class="plus" align="center">
            	<p>+\</p>
            </div>
        </article>
        <article class="line4">
            <div id="32" class="plus" align="center">
            	<p>\×2</p>
            </div>
            <div id="33" class="minus" align="center">
            	<p>-\</p>
            </div>
            <div id="34" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="35" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="36" class="buy" align="center">
            	<p>購入</p>
            </div>
            <div id="37" class="plus" align="center">
            	<p>+\</p>
            </div>
            <div id="38" class="minus" align="center">
            	<p>-\</p>
            </div>
            <div id="39" class="start" align="center">
                <p>Goal</p>
            </div>
        </article>
    </section>
     <script type="text/javascript" src="../js/progress.js"></script>
    <script src="../js/arrows.js"></script>
</body>
</html>