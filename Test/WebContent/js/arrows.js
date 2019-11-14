(function() {
        // 矢印
        for(i=0;i<39;i++){
            new LeaderLine(document.getElementById(i), document.getElementById(i+1),{dash: {len: 4, gap: 24}, color: '#2e8b57',size:3});
        }
}());