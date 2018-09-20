<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <%
        String base_path = request.getContextPath();
        pageContext.setAttribute("base_path", base_path);
    %>
    <script src="${base_path}/static/js/jquery.min.js"></script>
    <link href="${base_path}/static/css/bootstrap.css" rel="stylesheet">
    <link href="${base_path}/static/css/font-awesome.min.css" rel="stylesheet">
    <script src="${base_path}/static/js/bootstrap.js"></script>
    <link rel="stylesheet" href="${base_path}/static/css/login.css" type="text/css">
</head>
<body>
<div class="container">
    <div class="form row">
        <div class="form-horizontal col-md-offset-3" id="login_form">
            <h3 class="form-title">LOGIN</h3>
            <div class="col-md-9">
                <div class="form-group">
                    <i class="fa fa-user fa-lg"></i>
                    <input class="form-control required" type="text" placeholder="Username" id="username"
                           name="username" autofocus="autofocus" maxlength="20"/>
                </div>
                <div class="form-group">
                    <i class="fa fa-lock fa-lg"></i>
                    <input class="form-control required" type="password" placeholder="Password" id="password"
                           name="password" maxlength="8"/>
                </div>
                <div class="form-group">
                    <label class="checkbox">
                        <input type="checkbox" name="remember" value="1"/>记住我
                    </label>
                </div>
                <div class="form-group col-md-offset-9">
                    <button type="submit" class="btn btn-success pull-right" id="submit">登录</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $("#submit").click(function () {
        var name = $("#username").val()
        var pwd = $("#password").val()

        // if (name == "admin" && pwd == "123")
        //     window.location.href = "choose_model.jsp"
        // else {
        //     alert('登录失败');
        //     window.location.href = "login.jsp"
        // }
        $.post("http://localhost:8080/login",{username:name,password:pwd},function(result){
           alert(result)
        });


    })
</script>
</body>
</html>
