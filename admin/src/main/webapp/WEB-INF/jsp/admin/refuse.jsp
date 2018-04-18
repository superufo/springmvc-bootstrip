<%@ page language="java" isELIgnored="false" contentType="text/html;"
	import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="decorators/taglib/taglib.jsp"%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
  <%  
    String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
   %>  
    <base href="<%=basePath%>" > 

   <meta charset="utf-8" />
   <title>拒绝--晨鳥勞務系統</title>
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
<body class="error-500">
    <div class="error-wrap">
        <h1>对不起</h1>
        <h2>用户名或密码错误，认证失败，请返回!</h2>
        <div class="metro green">
           <span> 4 </span>
        </div>
        <div class="metro yellow">
            <span> 0 </span>
        </div>
        <div class="metro purple">
            <span> 3 </span>
        </div>
        <p> <a  href="javascript:history.go(-1)" ><font size="20">返回</font> </a></p>
    </div>
</body>
<!-- END BODY -->
</html>
