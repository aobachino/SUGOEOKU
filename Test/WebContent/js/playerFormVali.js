function validation (){
	// 初期化
	var formId = document.getElementById("name_error");
	var msgObj = document.getElementById("error_msg");
	if(msgObj != null){
		var throwawayNode = formId.removeChild(msgObj);
	}


	// バリデーションチェック
	var forms = document.getElementsByName("playerName");
	var cnt = 0;
	for(i=0;i<forms.length;i++) {
	    if(forms[i].value != ""){
			sendGet(forms);
	        break;
	    }else{
	        cnt++;
	        continue;
	    }
	}

	// 要素作成
	if(cnt == 4){
		var objP = document.createElement("p");
		var msg = document.createTextNode("プレイヤー名を入力してください");
		objP.setAttribute("id", "error_msg");
		objP.appendChild(msg);
		formId.appendChild(objP);
	}
	return false;
}

// リクエスト送信
function sendGet(formDatas){
    var url = "/Test/Test";
    var req = new XMLHttpRequest();
    req.setRequestHeader('content-type', 'application/x-www-form-urlencoded;charset=UTF-8');
    req.open('POST',url);
	req.send(formDatas);

}
