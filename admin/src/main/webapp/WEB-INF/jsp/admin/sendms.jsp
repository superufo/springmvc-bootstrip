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
   <title>im Test--晨鳥勞務系統</title>
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
    <script type="text/javascript">
        var socket;
        
        function connectServer() {
         if (!window.WebSocket) {
             window.WebSocket = window.MozWebSocket;
         }
         
         if (window.WebSocket) {
             socket = new WebSocket("ws://localhost:8800/ws");
             socket.onmessage = function(event) {
                 var ta = document.getElementById('responseText');
                 ta.value = ta.value + '\n' + event.data
             };
             socket.onopen = function(event) {
                 var ta = document.getElementById('responseText');
                 ta.value = "连接开启!";
             };
             socket.onclose = function(event) {
                 var ta = document.getElementById('responseText');
                 ta.value = ta.value + "连接被关闭";
             };
         } else {
             alert("你的浏览器不支持 WebSocket！");
         }
        }
        
        function send(message) {
            if (!window.WebSocket) {
                return;
            }
            if (socket.readyState == WebSocket.OPEN) {
                socket.send(message);
            } else {
                alert("连接没有开启.");
            }
        }
    </script>
    <form onsubmit="return false;">
     <input type="button" onclick="javascript:connectServer()" value="连接服务器">
        <h3> 晨鳥IM：</h3>
        <textarea id="responseText" style="width: 500px; height: 300px;"></textarea>
        <br> 
        <input type="text" name="message"  style="width: 300px" value="聊天文字在此....">
        <input type="button" value="发送消息" onclick="send(this.form.message.value)">
        <input type="button" onclick="javascript:document.getElementById('responseText').value=''" value="清空聊天记录">
    </form>
</body>
<!-- END BODY -->
</html>
