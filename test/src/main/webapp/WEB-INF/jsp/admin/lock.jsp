<%@ page language="java"  isELIgnored="false"  contentType="text/html;"    import="java.util.*"  pageEncoding="utf-8" %><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- isELIgnored="false" 和     taglib 必须加 -->
<head>
   <meta charset="utf-8" />
   <title>Metro风格响应式后台管理系统模板MetroAdmin 锁屏页面 - JS代码网</title>
   <meta content="width=device-width, initial-scale=1.0" name="viewport" />
   <meta content="" name="description" />
   <meta content="" name="author" />
   <link href="../static/win8/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   <link href="../static/win8/assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   <link href="../static/win8/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   <link src="../static/win8/css/style.css" rel="stylesheet" />
   <link src="../static/win8/css/style-responsive.css" rel="stylesheet" />
   <link src="../static/win8/css/style-default.css" rel="stylesheet" id="style_color" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="lock">
    <div class="lock-header">
        <!-- BEGIN LOGO -->
        <a class="center" id="logo" href="index.jsp">
            <img class="center" alt="logo" src="img/logo.png">
        </a>
        <!-- END LOGO -->
    </div>
    <div class="lock-wrap">
        <div class="metro single-size gray">
            <img src="img/lock-thumb.jpg" alt="" style="height: 165px" >
        </div>
        <div class="metro double-size blue">
            <h1>Jonathan Smith</h1>
            <p>vectorlab@gmail.com</p>
        </div>
        <div class="metro double-size green">
            <form action="index.jsp">
                <div class="input-append lock-input">
                    <input type="password" class="" placeholder="Password">
                    <button type="submit" class="btn tarquoise"><i class=" icon-arrow-right"></i></button>
                </div>
            </form>
        </div>
        <div class="metro single-size terques">
            <div class="locked">
                <i class="icon-lock"></i>
                <span>Locked</span>
            </div>
        </div>
        <div class="metro double-size gray ">
            <a href="login.jsp" class="user-position">
                <i class="icon-user"></i>
                <span>Login Another User</span>
            </a>
        </div>
        <div class="metro double-size orange">
            <a href="javascript:;" class="user-position">
                <i class="icon-key"></i>
                <span>Forgot Password ?</span>
            </a>
        </div>
    </div>
</body>
<!-- END BODY -->
</html>
