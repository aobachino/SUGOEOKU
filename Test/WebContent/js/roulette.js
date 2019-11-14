var roulette = 0;
var idx = 0;

// ルーレットを開始
function start() {
	if(roulette == 0){
		roulette = setInterval(function() {
		    // 1〜6の範囲でランダムな数値を作成
		    idx = Math.floor( Math.random() * 6 ) + 1;
		    // ルーレット
		    document.getElementById("roulette").innerHTML = idx;
		}, 100);
	}
	return false;
}

// ルーレットを停止
function stop() {
if(roulette) {
    clearInterval(roulette);
    if(idx != 0){
    	dice = document.getElementById("roulette").textContent;
    	//dice = document.getElementById("roulette");
        sendPost(dice);
    }


	}
}

function sendPost(dice){
    var url = "/Test/Game";
    var req = new XMLHttpRequest();
    req.open('POST',url);
    req.setRequestHeader('content-type', 'application/x-www-form-urlencoded;charset=UTF-8');
	req.send(dice);
	window.location.reload();
}