window.onload = function(){
    var firstCheckBoxObj = document.getElementById("firstCheckBox");
    firstCheckBoxObj.onclick = function(){
        var positions = document.getElementsByName("position");
        for(var i=0;i<positions.length;i++){
            positions[i].checked = firstCheckBoxObj.checked;
        }
    }
}