(function() {
	var iProg = document.getElementById("pProgress").value;
	var iName = document.getElementById("pName").value;

	var strName = iName.slice(1,iName.length - 1).split(", ");
	var strProg = iProg.slice(1,iProg.length - 1).split(", ");

	console.log(strName);
	console.log(strProg);

	var sorted = [];
	for(i=0;i<strName.length;i++){
		 var result = {};
		 result["name"] = strName[i];
		 if(strProg[i] == "40"){
			 result["progress"] = "39";
		 }else{
			 result["progress"] = strProg[i];
		 }
		 sorted[i] = result;
	}

	console.log(sorted);
	for(i=0;i<sorted.length;i++){
		var span = document.createElement("span");
		span.setAttribute("class","nameBox");
		var masu = document.getElementById(sorted[i].progress);
		var p = document.createElement("p");
		masu.setAttribute("name","text");
		p.appendChild(document.createTextNode(sorted[i].name));
		p.setAttribute("class","pName");
		span.appendChild(p);
		masu.appendChild(span);
	}

}());
