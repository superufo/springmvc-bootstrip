<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="taglib/taglib.jsp"%>

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
    
    <%@include file="../../admin/common/headerJsAndCss.jsp"%>	
   
    <title>
        <sitemesh:write property='title' />--晨鳥勞務系統</sitemesh:write>
    </title>
    
</head>

<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="fixed-top">
   <!-- BEGIN HEADER -->
   		<%@include file="../../admin/common/header.jsp"%>
   <!-- END HEADER -->
   
   <!-- BEGIN CONTAINER -->
   <div id="container" class="row-fluid">
      <!-- BEGIN SIDEBAR -->
      	<%@include file="../../admin/common/sidebar.jsp"%>
      <!-- END SIDEBAR -->
      
      <!-- BEGIN PAGE -->  
         <sitemesh:write property='body' /></sitemesh:write>
      <!-- END PAGE -->  
   </div>
   <!-- END CONTAINER -->

   <!-- BEGIN FOOTER -->
  		<%@include file="../../admin/common/foot.jsp"%>
   <!-- END FOOTER -->
   
       <%@include file="../../admin/common/footJsAndCss.jsp"%>
   
</body>
<!-- END BODY -->
</html>
