function calc(){
	//	宣言
	var nameVal = document.getElementById("resName").value;
	var moneVal = document.getElementById("resMoney").value;
	var strName = nameVal.slice(1,nameVal.length - 1).split(", ");
	var strMoney = moneVal.slice(1,moneVal.length - 1).split(",");

	var money = [];
	for(i=0;i<strMoney.length;i++){
		money[i] = Number(strMoney[i])
	}
	money.sort();

	var sorted = [];
	for(i=0;i<strName.length;i++){
		 var result = {};
		 result["name"] = strName[i];
		 result["money"] = money[i];
		 sorted[i] = result;
	}

	console.log(sorted);

	sorted.sort(function(a, b) {

		return a.money < b.money ? 1 : -1;

	});

	var table = document.createElement("table");
	table.setAttribute("border",1);

	for(i=0;i<sorted.length;i++){
		var tr = table.insertRow( -1 );
		for(j=1;j<= Object.keys(result).length + 1;j++){
			var td = document.createElement("td");
			if(j==1){
				td.appendChild(document.createTextNode((i+1) + "位"));
				tr.appendChild(td);
			}else if(j==2){
				td.appendChild(document.createTextNode(sorted[i].name));
				tr.appendChild(td);
			}else{
				td.appendChild(document.createTextNode(sorted[i].money + "円"));
				tr.appendChild(td);
			}
		}
		tr.appendChild(td);
		table.appendChild(tr);
	}
	var div = document.getElementById("result");
	if(div.children.length == 0){
		div.appendChild(table);
	}





}

