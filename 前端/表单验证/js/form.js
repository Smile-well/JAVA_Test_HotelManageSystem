window.onload = function(){
    var userNameObj = document.getElementById("username");
    var userNameRegExp = /^[A-Za-z0-9]+$/;
    var userNameErrorObj = document.getElementById("userNameError");

    var pswObj = document.getElementById("psw");
    var pswErrorObj = document.getElementById("pswError");

    var repswObj = document.getElementById("repsw");
    var rePswErrorObj = document.getElementById("rePswError");

    var emailObj = document.getElementById("email");
    var emialErrorObj = document.getElementById("emailError");
    var emailRegExp = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;

    var submitObj = document.getElementById("submitBtn");
    
    userNameObj.onblur = function(){
        var username = userNameObj.value;
        username = username.trim();
        if(username.length == 0){
            userNameErrorObj.innerText = "用户名不能为空！";
        }else{
            if(username.length>14 || username.length < 6){
                userNameErrorObj.innerText="用户名长度应在6~14之间！";
            }else if(!userNameRegExp.test(username)){
                userNameErrorObj.innerText="非法字符，用户名只能由字母和数字组成";
            }else{
                userNameErrorObj.innerText="";
            }
        }
    }

    userNameObj.onfocus = function(){
        if(userNameErrorObj.innerText!=""){
            userNameObj.value = "";
        }
        userNameErrorObj.innerText="";
    }

    pswObj.onblur = function(){
        var psw = pswObj.value;
        psw = psw.trim();
        if(psw.length < 8){
            pswErrorObj.innerText = "密码长度应大于8";
        }
    }

    pswObj.onfocus = function(){
        var psw = pswObj.value;
        psw = psw.trim();
        if(pswErrorObj.innerText!=""){
            pswObj.value = "";
        }
        pswErrorObj.innerText="";
    }


    repswObj.onblur = function(){
        var repsw = repswObj.value;
        repsw = repsw.trim();

        var psw = pswObj.value;
        psw = psw.trim();

        if(repsw != psw){
            rePswErrorObj.innerText = "密码不一致，请重新输入！";
        }
    }

    repswObj.onfocus = function(){
        if(rePswErrorObj.innerText!=""){
            repswObj.value = "";
        }
        rePswErrorObj.innerText = "";
    }

    emailObj.onblur = function(){
        var email = emailObj.value;
        email = email.trim();

        if(!emailRegExp.test(email)){
            emialErrorObj.innerText = "邮箱地址不合法，请重新输入！";
        }
    }

    emailObj.onfocus = function(){
        if(emialErrorObj.innerText!=""){
            emailObj.value = "";
        }
        emialErrorObj.innerText = "";
    }

    submitObj.onclick = function(){
        userNameObj.focus();
        pswObj.focus();
        rePswNameObj.focus();
        emailObj.focus();

        userNameObj.blur();
        pswObj.blur();
        rePswNameObj.blur();
        emailObj.blur();
        if(userNameErrorObj.innerText=="" && pswErrorObj.innerText=="" && rePswErrorObj.innerText=="" && emialErrorObj.innerText==""){
            var userFormObj = document.getElementById("userForm");
            userFormObj.action = "http://localhost:8080";
            userFormObj.submit();
        }
    }
}