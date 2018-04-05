<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="taglib/taglib.jsp"%>


<!-- isELIgnored="false" 和     taglib 必须加 -->
<!DOCTYPE html>
<html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->

 <%  
    String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<base href="<%=basePath%>">  


<head>
    <%@include file="../../admin/common/headerJsAndCss.jsp"%>	
   
    <title>
        <sitemesh:write property='title' />--晨鳥勞務系統</sitemesh:write>
    </title>
    <sitemesh:write property='head'/></sitemesh:write>
</head>

<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="fixed-top">
   
   <!-- BEGIN HEADER 
   		<%@include file="../../admin/common/header.jsp"%>-->
   <!-- END HEADER -->
   
   <!-- BEGIN CONTAINER -->
   <div id="container" class="row-fluid">
      <!-- BEGIN SIDEBAR 
      	<%@include file="../../admin/common/sidebar.jsp"%>-->
      <!-- END SIDEBAR -->
      
      <!-- BEGIN PAGE -->  
      <div id="main-content">
         <!-- BEGIN PAGE CONTAINER-->
         <!-- *.jsp的body将被填充到这儿： -->
         <sitemesh:write property='body' /></sitemesh:write>
         <!-- END PAGE CONTAINER-->
      </div>
      <!-- END PAGE -->  
   </div>
   <!-- END CONTAINER -->

   <!-- BEGIN FOOTER 
  		<%@include file="../../admin/common/foot.jsp"%>-->
   <!-- END FOOTER -->
</body>
<!-- END BODY -->
</html>
