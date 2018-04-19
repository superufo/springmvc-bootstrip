<%@ page language="java" isELIgnored="false" contentType="text/html;"
	import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="decorators/taglib/taglib.jsp"%>

<jsp:useBean id="cnAdmin" class="com.earlybird.entity.sys.Admin" scope="request"></jsp:useBean>

<html>
<head>
  <%  
    String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
   %>  
    <base href="<%=basePath%>" > 

   <meta charset="utf-8" />
   <title>登录--晨鳥勞務系統</title>
   <meta content="width=device-width, initial-scale=1.0" name="viewport" />
   <meta content="" name="description" />
   <meta content="" name="author" />
   <link href="static/win8/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   <link href="static/win8/assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   <link href="static/win8/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   <link href="static/win8/css/style.css" rel="stylesheet" />
   <link href="static/win8/css/style-responsive.css" rel="stylesheet" />
   <link href="static/win8/css/style-default.css" rel="stylesheet" id="style_color" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="lock">
    <div class="lock-header">
        <!-- BEGIN LOGO -->
        <a class="center" id="logo" href="static/win8/index.html">
            <img class="center" alt="logo" src="static/win8/img/logo.png">
        </a>
        <!-- END LOGO -->
    </div>
    <form:form modelAttribute="cnAdmin" method="post"  action="/admin/index" >
    <div class="login-wrap">
        <div class="metro single-size red">
            <div class="locked">
                <i class="icon-lock"></i>
                <span>登录</span>
            </div>
        </div>
        <div class="metro double-size green">
                <div class="input-append lock-input">
                    <form:input type="text" class=""  name="username" placeholder="Username"  path="userName" />
                    <form:errors path="userName" />
                </div>
        </div>
        <div class="metro double-size yellow">
                <div class="input-append lock-input">
                    <form:input type="password" class="" name="password" placeholder="Password" path="password" />
                    <form:errors path="password" ></form:errors>
                </div>
        </div>
        <div class="metro single-size terques login">
                <button type="submit" class="btn login-btn">
                    登录
                    <i class=" icon-long-arrow-right"></i>
                </button>
                <form:errors path="*" cssClass="error" />
                ${errorHint}
        </div>
        <div class="login-footer">
            <div class="remember-hint pull-left">
                <input type="checkbox" id="" name="rememberMe" > 记住密码
            </div>
            <div class="forgot-hint pull-right">
                <a id="forget-password" class="" href="static/win8/javascript:;">忘记密码?</a>
            </div>
        </div>
    </div>
    </form:form>
</body>
</html>