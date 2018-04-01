<%@ page language="java"  isELIgnored="false"  contentType="text/html;"    import="java.util.*"  pageEncoding="utf-8" %><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- isELIgnored="false" 和     taglib 必须加 -->
<head>
   <meta charset="utf-8" />
   <title>Metro风格响应式后台管理系统模板MetroAdmin 博客Blog页面 - JS代码网</title>
   <meta content="width=device-width, initial-scale=1.0" name="viewport" />
   <meta content="" name="description" />
   <meta content="" name="author" />
   <link href="../static/win8/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
   <link href="../static/win8/assets/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" />
   <link href="../static/win8/assets/bootstrap/css/bootstrap-fileupload.css" rel="stylesheet" />
   <link href="../static/win8/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
   <link src="../static/win8/css/style.css" rel="stylesheet" />
   <link src="../static/win8/css/style-responsive.css" rel="stylesheet" />
   <link src="../static/win8/css/style-default.css" rel="stylesheet" id="style_color" />

</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="fixed-top">
   <!-- BEGIN HEADER -->
   <div id="header" class="navbar navbar-inverse navbar-fixed-top">
       <!-- BEGIN TOP NAVIGATION BAR -->
       <div class="navbar-inner">
           <div class="container-fluid">
               <!--BEGIN SIDEBAR TOGGLE-->
               <div class="sidebar-toggle-box hidden-phone">
                   <div class="icon-reorder tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
               </div>
               <!--END SIDEBAR TOGGLE-->
               <!-- BEGIN LOGO -->
               <a class="brand" href="index.jsp">
                   <img src="img/logo.png" alt="Metro Lab" />
               </a>
               <!-- END LOGO -->
               <!-- BEGIN RESPONSIVE MENU TOGGLER -->
               <a class="btn btn-navbar collapsed" id="main_menu_trigger" data-toggle="collapse" data-target=".nav-collapse">
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
                   <span class="arrow"></span>
               </a>
               <!-- END RESPONSIVE MENU TOGGLER -->
               <div id="top_menu" class="nav notify-row">
                   <!-- BEGIN NOTIFICATION -->
                   <ul class="nav top-menu">
                       <!-- BEGIN SETTINGS -->
                       <li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                               <i class="icon-tasks"></i>
                               <span class="badge badge-important">6</span>
                           </a>
                           <ul class="dropdown-menu extended tasks-bar">
                               <li>
                                   <p>You have 6 pending tasks</p>
                               </li>
                               <li>
                                   <a href="#">
                                       <div class="task-info">
                                         <div class="desc">Dashboard v1.3</div>
                                         <div class="percent">44%</div>
                                       </div>
                                       <div class="progress progress-striped active no-margin-bot">
                                           <div class="bar" style="width: 44%;"></div>
                                       </div>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <div class="task-info">
                                           <div class="desc">Database Update</div>
                                           <div class="percent">65%</div>
                                       </div>
                                       <div class="progress progress-striped progress-success active no-margin-bot">
                                           <div class="bar" style="width: 65%;"></div>
                                       </div>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <div class="task-info">
                                           <div class="desc">Iphone Development</div>
                                           <div class="percent">87%</div>
                                       </div>
                                       <div class="progress progress-striped progress-info active no-margin-bot">
                                           <div class="bar" style="width: 87%;"></div>
                                       </div>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <div class="task-info">
                                           <div class="desc">Mobile App</div>
                                           <div class="percent">33%</div>
                                       </div>
                                       <div class="progress progress-striped progress-warning active no-margin-bot">
                                           <div class="bar" style="width: 33%;"></div>
                                       </div>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <div class="task-info">
                                           <div class="desc">Dashboard v1.3</div>
                                           <div class="percent">90%</div>
                                       </div>
                                       <div class="progress progress-striped progress-danger active no-margin-bot">
                                           <div class="bar" style="width: 90%;"></div>
                                       </div>
                                   </a>
                               </li>
                               <li class="external">
                                   <a href="#">See All Tasks</a>
                               </li>
                           </ul>
                       </li>
                       <!-- END SETTINGS -->
                       <!-- BEGIN INBOX DROPDOWN -->
                       <li class="dropdown" id="header_inbox_bar">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                               <i class="icon-envelope-alt"></i>
                               <span class="badge badge-important">5</span>
                           </a>
                           <ul class="dropdown-menu extended inbox">
                               <li>
                                   <p>You have 5 new messages</p>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="photo"><img src="./img/avatar-mini.png" alt="avatar" /></span>
									<span class="subject">
									<span class="from">Jonathan Smith</span>
									<span class="time">Just now</span>
									</span>
									<span class="message">
									    Hello, this is an example msg.
									</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="photo"><img src="./img/avatar-mini.png" alt="avatar" /></span>
									<span class="subject">
									<span class="from">Jhon Doe</span>
									<span class="time">10 mins</span>
									</span>
									<span class="message">
									 Hi, Jhon Doe Bhai how are you ?
									</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="photo"><img src="./img/avatar-mini.png" alt="avatar" /></span>
									<span class="subject">
									<span class="from">Jason Stathum</span>
									<span class="time">3 hrs</span>
									</span>
									<span class="message">
									    This is awesome dashboard.
									</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="photo"><img src="./img/avatar-mini.png" alt="avatar" /></span>
									<span class="subject">
									<span class="from">Jondi Rose</span>
									<span class="time">Just now</span>
									</span>
									<span class="message">
									    Hello, this is metrolab
									</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">See all messages</a>
                               </li>
                           </ul>
                       </li>
                       <!-- END INBOX DROPDOWN -->
                       <!-- BEGIN NOTIFICATION DROPDOWN -->
                       <li class="dropdown" id="header_notification_bar">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown">

                               <i class="icon-bell-alt"></i>
                               <span class="badge badge-warning">7</span>
                           </a>
                           <ul class="dropdown-menu extended notification">
                               <li>
                                   <p>You have 7 new notifications</p>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="label label-important"><i class="icon-bolt"></i></span>
                                       Server #3 overloaded.
                                       <span class="small italic">34 mins</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="label label-warning"><i class="icon-bell"></i></span>
                                       Server #10 not respoding.
                                       <span class="small italic">1 Hours</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="label label-important"><i class="icon-bolt"></i></span>
                                       Database overloaded 24%.
                                       <span class="small italic">4 hrs</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="label label-success"><i class="icon-plus"></i></span>
                                       New user registered.
                                       <span class="small italic">Just now</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">
                                       <span class="label label-info"><i class="icon-bullhorn"></i></span>
                                       Application error.
                                       <span class="small italic">10 mins</span>
                                   </a>
                               </li>
                               <li>
                                   <a href="#">See all notifications</a>
                               </li>
                           </ul>
                       </li>
                       <!-- END NOTIFICATION DROPDOWN -->

                   </ul>
               </div>
               <!-- END  NOTIFICATION -->
               <div class="top-nav ">
                   <ul class="nav pull-right top-menu" >
                       <!-- BEGIN SUPPORT -->
                       <li class="dropdown mtop5">

                           <a class="dropdown-toggle element" data-placement="bottom" data-toggle="tooltip" href="#" data-original-title="Chat">
                               <i class="icon-comments-alt"></i>
                           </a>
                       </li>
                       <li class="dropdown mtop5">
                           <a class="dropdown-toggle element" data-placement="bottom" data-toggle="tooltip" href="#" data-original-title="Help">
                               <i class="icon-headphones"></i>
                           </a>
                       </li>
                       <!-- END SUPPORT -->
                       <!-- BEGIN USER LOGIN DROPDOWN -->
                       <li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                               <img src="img/avatar1_small.jpg" alt="">
                               <span class="username">Jhon Doe</span>
                               <b class="caret"></b>
                           </a>
                           <ul class="dropdown-menu extended logout">
                               <li><a href="#"><i class="icon-user"></i> My Profile</a></li>
                               <li><a href="#"><i class="icon-cog"></i> My Settings</a></li>
                               <li><a href="login.jsp"><i class="icon-key"></i> Log Out</a></li>
                           </ul>
                       </li>
                       <!-- END USER LOGIN DROPDOWN -->
                   </ul>
                   <!-- END TOP NAVIGATION MENU -->
               </div>
           </div>
       </div>
       <!-- END TOP NAVIGATION BAR -->
   </div>
   <!-- END HEADER -->
   <!-- BEGIN CONTAINER -->
   <div id="container" class="row-fluid">
      <!-- BEGIN SIDEBAR -->
      <div class="sidebar-scroll">
          <div id="sidebar" class="nav-collapse collapse">

              <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
              <div class="navbar-inverse">
                  <form class="navbar-search visible-phone">
                      <input type="text" class="search-query" placeholder="Search" />
                  </form>
              </div>
              <!-- END RESPONSIVE QUICK SEARCH FORM -->
              <!-- BEGIN SIDEBAR MENU -->
              <ul class="sidebar-menu">
                  <li class="sub-menu">
                      <a class="" href="index.jsp">
                          <i class="icon-dashboard"></i>
                          <span>Dashboard</span>
                      </a>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-book"></i>
                          <span>UI Elements</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="general.jsp">General</a></li>
                          <li><a class="" href="button.jsp">Buttons</a></li>
                          <li><a class="" href="slider.jsp">Sliders</a></li>
                          <li><a class="" href="metro_view.jsp">Metro View</a></li>
                          <li><a class="" href="tabs_accordion.jsp">Tabs & Accordions</a></li>
                          <li><a class="" href="typography.jsp">Typography</a></li>
                          <li><a class="" href="tree_view.jsp">Tree View</a></li>
                          <li><a class="" href="nestable.jsp">Nestable List</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-cogs"></i>
                          <span>Components</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="calendar.jsp">Calendar</a></li>
                          <li><a class="" href="grids.jsp">Grids</a></li>
                          <li><a class="" href="chartjs.jsp">Chart Js</a></li>
                          <li><a class="" href="flot_chart.jsp">Flot Charts</a></li>
                          <li><a class="" href="gallery.jsp"> Gallery</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-tasks"></i>
                          <span>Form Stuff</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="form_layout.jsp">Form Layouts</a></li>
                          <li><a class="" href="form_component.jsp">Form Components</a></li>
                          <li><a class="" href="form_wizard.jsp">Form Wizard</a></li>
                          <li><a class="" href="form_validation.jsp">Form Validation</a></li>
                          <li><a class="" href="dropzone.jsp">Dropzone File Upload </a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-th"></i>
                          <span>Data Tables</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="basic_table.jsp">Basic Table</a></li>
                          <li><a class="" href="dynamic_table.jsp">Dynamic Table</a></li>
                          <li><a class="" href="editable_table.jsp">Editable Table</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-fire"></i>
                          <span>Icons</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="font_awesome.jsp">Font Awesome</a></li>
                          <li><a class="" href="glyphicons.jsp">Glyphicons</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a class="" href="javascript:;">
                          <i class="icon-trophy"></i>
                          <span>Portlets</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a href="general_portlet.jsp" class=""> General Portlet</a></li>
                          <li><a href="draggable_portlet.jsp" class="">Draggable Portlet</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a class="" href="javascript:;">
                          <i class="icon-map-marker"></i>
                          <span>Maps</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a href="vector_map.jsp" class="">Vector Maps</a></li>
                          <li><a href="google_map.jsp" class="">Google Map</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu active">
                      <a href="javascript:;" class="">
                          <i class="icon-file-alt"></i>
                          <span>Sample Pages</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="blank.jsp">Blank Page</a></li>
                          <li class="active"><a class="" href="blog.jsp">Blog</a></li>
                          <li><a class="" href="timeline.jsp">Timeline</a></li>
                          <li><a class="" href="profile.jsp">Profile</a></li>
                          <li><a class="" href="about_us.jsp">About Us</a></li>
                          <li><a class="" href="contact_us.jsp">Contact Us</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-glass"></i>
                          <span>Extra</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="lock.jsp">Lock Screen</a></li>
                          <li><a class="" href="invoice.jsp">Invoice</a></li>
                          <li><a class="" href="pricing_tables.jsp">Pricing Tables</a></li>
                          <li><a class="" href="search_result.jsp">Search Result</a></li>
                          <li><a class="" href="faq.jsp">FAQ</a></li>
                          <li><a class="" href="404.jsp">404 Error</a></li>
                          <li><a class="" href="500.jsp">500 Error</a></li>
                      </ul>
                  </li>

                  <li>
                      <a class="" href="login.jsp">
                          <i class="icon-user"></i>
                          <span>Login Page</span>
                      </a>
                  </li>
              </ul>
              <!-- END SIDEBAR MENU -->
          </div>
      </div>
      <!-- END SIDEBAR -->
      <!-- BEGIN PAGE -->  
      <div id="main-content">
         <!-- BEGIN PAGE CONTAINER-->
         <div class="container-fluid">
            <!-- BEGIN PAGE HEADER-->   
            <div class="row-fluid">
               <div class="span12">
                   <!-- BEGIN THEME CUSTOMIZER-->
                   <div id="theme-change" class="hidden-phone">
                       <i class="icon-cogs"></i>
                        <span class="settings">
                            <span class="text">Theme Color:</span>
                            <span class="colors">
                                <span class="color-default" data-style="default"></span>
                                <span class="color-green" data-style="green"></span>
                                <span class="color-gray" data-style="gray"></span>
                                <span class="color-purple" data-style="purple"></span>
                                <span class="color-red" data-style="red"></span>
                            </span>
                        </span>
                   </div>
                   <!-- END THEME CUSTOMIZER-->
                  <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                   <h3 class="page-title">
                     Blog
                   </h3>
                   <ul class="breadcrumb">
                       <li>
                           <a href="#">Home</a>
                           <span class="divider">/</span>
                       </li>
                       <li>
                           <a href="#">Sample Pages</a>
                           <span class="divider">/</span>
                       </li>
                       <li class="active">
                           Blog
                       </li>
                       <li class="pull-right search-wrap">
                           <form action="search_result.jsp" class="hidden-phone">
                               <div class="input-append search-input-area">
                                   <input class="" id="appendedInputButton" type="text">
                                   <button class="btn" type="button"><i class="icon-search"></i> </button>
                               </div>
                           </form>
                       </li>
                   </ul>
                   <!-- END PAGE TITLE & BREADCRUMB-->
               </div>
            </div>
            <!-- END PAGE HEADER-->
            <!-- BEGIN PAGE CONTENT-->
             <div class="row-fluid">
                 <div class="span12">
                     <!-- BEGIN BLOG PORTLET-->
                     <div class="row-fluid">
                         <div class="span8 ">
                             <div class="row-fluid">
                                 <div class="blog">
                                     <div class="span2 orange">
                                         <a href="javascript:;" class="blog-features date active">
                                             <p class="day">02</p>
                                             <p class="month">Jul</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-comments-alt"></i>
                                             <p class="info">145 Comments</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-share"></i>
                                             <p class="info">14 Share</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-eye-open"></i>
                                             <p class="info">1400 View</p>
                                         </a>
                                     </div>
                                     <div class="span10">
                                         <h2>
                                             <a href="blog_details.jsp">Suspendisse et mauris nisi, in semper justo.</a>
                                         </h2>
                                         <p>
                                             BY <a href="javascript:;" class="author">METRO LAB</a> |  MONDAY, 12:30 PM
                                         </p>
                                         <img alt="" src="img/blog/blog1-big.jpg">
                                         <p> Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fring. Aliquam ac... <a href="blog_details.jsp" class="read-more">Continue Reading</a> </p>
                                     </div>
                                 </div>
                                 <div class="blog">
                                     <div class="span2 green">
                                         <a href="javascript:;" class="blog-features date active">
                                             <p class="day">03</p>
                                             <p class="month">Aug</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-comments-alt"></i>
                                             <p class="info">145 Comments</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-share"></i>
                                             <p class="info">14 Share</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-eye-open"></i>
                                             <p class="info">1400 View</p>
                                         </a>
                                     </div>
                                     <div class="span10">
                                         <h2>
                                             <a href="blog_details.jsp">Suspendisse et mauris nisi, in semper justo.</a>
                                         </h2>
                                         <p>
                                             BY <a href="javascript:;" class="author">METRO LAB</a> |  MONDAY, 12:30 PM
                                         </p>
                                         <img alt="" src="img/blog/blog2-big.jpg">
                                         <p> Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fring. Aliquam ac... <a href="blog_details.jsp" class="read-more">Continue Reading</a> </p>
                                     </div>
                                 </div>
                                 <div class="blog">
                                     <div class="span2 red">
                                         <a href="javascript:;" class="blog-features date active">
                                             <p class="day">05</p>
                                             <p class="month">Sep</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-comments-alt"></i>
                                             <p class="info">145 Comments</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-share"></i>
                                             <p class="info">14 Share</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-eye-open"></i>
                                             <p class="info">1400 View</p>
                                         </a>
                                     </div>
                                     <div class="span10">
                                         <h2>
                                             <a href="blog_details.jsp">Suspendisse et mauris nisi, in semper justo.</a>
                                         </h2>
                                         <p>
                                             BY <a href="javascript:;" class="author">METRO LAB</a> |  MONDAY, 12:30 PM
                                         </p>
                                         <img alt="" src="img/blog/blog3-big.jpg">
                                         <p> Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fring. Aliquam ac... <a href="blog_details.jsp" class="read-more">Continue Reading</a> </p>
                                     </div>
                                 </div>
                                 <div class="blog">
                                     <div class="span2 yellow">
                                         <a href="javascript:;" class="blog-features date active">
                                             <p class="day">02</p>
                                             <p class="month">Jul</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-comments-alt"></i>
                                             <p class="info">145 Comments</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-share"></i>
                                             <p class="info">14 Share</p>
                                         </a>
                                         <a href="javascript:;" class="blog-features comments">
                                             <i class=" icon-eye-open"></i>
                                             <p class="info">1400 View</p>
                                         </a>
                                     </div>
                                     <div class="span10">
                                         <h2>
                                             <a href="blog_details.jsp">Suspendisse et mauris nisi, in semper justo.</a>
                                         </h2>
                                         <p>
                                             BY <a href="javascript:;" class="author">METRO LAB</a> |  MONDAY, 12:30 PM
                                         </p>
                                         <img alt="" src="img/blog/blog1-big.jpg">
                                         <p> Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus.  Nam sed arcu non tellus fringilla fringilla ut vel ipsum. Aliquam ac magna metus. Nam sed arcu non tellus fringilla fring. Aliquam ac... <a href="blog_details.jsp" class="read-more">Continue Reading</a> </p>
                                     </div>
                                 </div>
                                 <div class="custom-pagination pagination-centered">
                                     <ul>
                                         <li><a href="javascript:;">«</a></li>
                                         <li><a href="javascript:;">1</a></li>
                                         <li><a href="javascript:;">2</a></li>
                                         <li><a href="javascript:;">3</a></li>
                                         <li><a href="javascript:;">4</a></li>
                                         <li><a href="javascript:;">»</a></li>
                                     </ul>
                                 </div>
                             </div>
                         </div>
                         <div class="span4">
                             <div class="blog-side-bar blue-box">
                                <h2> <i class=" icon-tasks"></i> category</h2>
                                 <ul>
                                     <li>
                                         <a href="#">
                                             <i class=" icon-umbrella"></i>
                                             <span>Animal</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <i class=" icon-trophy"></i>
                                             <span>Landscape</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <i class=" icon-plane"></i>
                                             <span>Potrait</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <i class=" icon-pushpin"></i>
                                             <span>Wild Life</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <i class=" icon-beaker"></i>
                                             <span>Video</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <i class=" icon-bullhorn"></i>
                                             <span>Nature</span>
                                         </a>
                                     </li>
                                 </ul>
                             </div>
                             <div class="blog-side-bar green-box">
                                 <h2> <i class="  icon-comments-alt"></i> Latest blog</h2>
                                 <div class="space20"></div>
                                 <div class="row-fluid">
                                     <div class="green-box-blog">
                                         <div class="span3">
                                             <img alt="" src="img/blog/blog-thumb-3.jpg">
                                         </div>
                                         <div class="span9">
                                             <h5>
                                                 <a href="javascript:;">02 MAY 2013</a>
                                             </h5>
                                             <p>Nam sed arcu non tellus
                                                 fringilla fringilla ut vel ipsum.</p>
                                         </div>
                                     </div>
                                 </div>
                                 <div class="space10"></div>
                                 <div class="row-fluid">
                                     <div class="green-box-blog">
                                         <div class="span3">
                                             <img alt="" src="img/blog/blog-thumb-2.jpg">
                                         </div>
                                         <div class="span9">
                                             <h5>
                                                 <a href="javascript:;">02 MAY 2013</a>
                                             </h5>
                                             <p>Nam sed arcu non tellus
                                                 fringilla fringilla ut vel ipsum.</p>
                                         </div>
                                     </div>
                                 </div>
                                 <div class="space10"></div>
                                 <div class="row-fluid">
                                     <div class="green-box-blog">
                                         <div class="span3">
                                             <img alt="" src="img/blog/blog-thumb-3.jpg">
                                         </div>
                                         <div class="span9">
                                             <h5>
                                                 <a href="javascript:;">02 MAY 2013</a>
                                             </h5>
                                             <p>Nam sed arcu non tellus
                                                 fringilla fringilla ut vel ipsum.</p>
                                         </div>
                                     </div>
                                 </div>
                                 <div class="space10"></div>
                             </div>
                             <div class="blog-side-bar red-box">
                                 <h2> <i class=" icon-tags"></i> popular tags</h2>
                                 <ul class="unstyled tag">
                                     <li><a href="#">Metrolab Admin</a></li>
                                     <li><a href="#"> Dashboard Theme</a></li>
                                     <li><a href="#"> Metro</a></li>
                                     <li><a href="#"> Control Panel</a></li>
                                     <li><a href="#"> UI</a></li>
                                     <li><a href="#"> Web Design</a></li>
                                     <li><a href="#"> UIX</a></li>
                                     <li><a href="#"> Blog</a></li>
                                     <li><a href="#">Metrolab Admin</a></li>
                                     <li><a href="#"> Dashboard Theme</a></li>
                                 </ul>
                             </div>
                             <div class="blog-side-bar orange-box">
                                 <h2> <i class=" icon-tasks"></i> Archive</h2>
                                 <ul>
                                     <li>
                                         <a href="#">
                                             <span class="large">OCT</span>
                                             <span>2012</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <span class="large">Nov</span>
                                             <span>2012</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <span class="large">dec</span>
                                             <span>2012</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <span class="large">jan</span>
                                             <span>2013</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <span class="large">feb</span>
                                             <span>2013</span>
                                         </a>
                                     </li>
                                     <li>
                                         <a href="#">
                                             <span class="large">mar</span>
                                             <span>2013</span>
                                         </a>
                                     </li>
                                 </ul>
                             </div>
                         </div>
                     </div>
                     <!-- END BLOG PORTLET-->
                 </div>
             </div>
            <!-- END PAGE CONTENT-->
         </div>
         <!-- END PAGE CONTAINER-->
      </div>
      <!-- END PAGE -->  
   </div>
   <!-- END CONTAINER -->
   <!-- BEGIN FOOTER -->
   <div id="footer">
       2013 &copy; Metro Lab Dashboard.
   </div>
   <!-- END FOOTER -->

   <!-- BEGIN JAVASCRIPTS -->
   <!-- Load javascripts at bottom, this will reduce page load time -->
   <script src="../static/win8/js/jquery-1.8.3.min.js"></script>
   <script src="../static/win8/js/jquery.nicescroll.js" type="text/javascript"></script>
   <script src="../static/win8/assets/bootstrap/js/bootstrap.min.js"></script>
   <script src="../static/win8/js/jquery.scrollTo.min.js"></script>

   <!-- ie8 fixes -->
   <!--[if lt IE 9]>
   <script src="../static/win8/js/excanvas.js"></script>
   <script src="../static/win8/js/respond.js"></script>
   <![endif]-->

   <!--common script for all pages-->
   <script src="../static/win8/js/common-scripts.js"></script>

   <!-- END JAVASCRIPTS -->   
</body>
<!-- END BODY -->
</html>
