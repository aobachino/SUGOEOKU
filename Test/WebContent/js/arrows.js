(function() {

	for(i=0;i<39;i++){
		new LeaderLine(document.getElementById(i), document.getElementById(i+1),{dash: {len: 4, gap: 24}, color: '#2e8b57',size:3});
	}
	/*
        // 縦矢印--上向き
        for(i=1,j=2,l=2;j<=40;){
            new LeaderLine(document.getElementById(i), document.getElementById(j),{dash: {len: 4, gap: 24}, color: '#2e8b57',size:3});
            if(j % 8 === 0){
                i = (8 * l);
                j = i + 1;
                l = l + 2;
            }
            i++;
            j++;
        }

        // 縦矢印--下向き
        for(i=33,j=32,l=2;j>9;){
            i--;
            j--;
            if(j % 8 === 0){
                i = (8 * l);
                j = i - 1;
            }
            new LeaderLine(document.getElementById(i), document.getElementById(j),{dash: {len: 4, gap: 24}, color: '#2e8b57',size:3});
        }
        // 横矢印
        for(i=8,j=16;j<=33;){
            new LeaderLine(document.getElementById(i), document.getElementById(j),{dash: {len: 4, gap: 24}, color: '#2e8b57',size:3});
            if(i % 8 === 0){
                i = i + 1;
                j = j + 1;
            }else{
                i = j + 7;
                j = i + 8;
            }
        }
       */
}());