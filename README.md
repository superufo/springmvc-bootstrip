# springmvc+bootstrip

- 前言

重新使用java 整理一套開發配置,开发劳务系统 .  

原来劳务系统 PHP + 小程序 https://github.com/superufo/wechat_back_lw  



- 开发工具

Eclipse Java EE IDE for Web Developers.

Version: Oxygen.2 Release (4.7.2)
Build id: 20171218-0600   64位   jdk1.8  mysql5.7 

tomcat 去掉  server modules without publish 否则  <form:form 表格会报错



- shiro

v200 是之前版本

之后整理包的分类 改动较大  添加了测试数据

用户登录是在一个表单进行的，所以这里我们需要通过shiro的一个表单过滤器(FormAuthenticationFilter)进行实现，原理如下:
http://codingxiaxw.cn/2016/11/23/50-Shiro-Integration/

流程:  用户没有认证时，请求loginurl进行认证，输入用户名和密码点击登录时将用户身份和用户密码提交数据到loginurl，然后FormAuthenticationFilter进行拦截取出request中的username和password（FormAuthenticationFilter源码中将username和password两个参数名称写死了，而我们今后是可以将这两个参数名称写在配置文件中的），然后FormAuthenticationFilter会调用realm传入一个token（将username和password传入到token中），realm认证时根据username在数据库中查询用户信息（将在数据库中查询到的信息保存在在Activeuser.java对象中，包括 userid、usercode、username、menus），
然后返回一个authenticationInfo。如果查询不到，realm就返回null，同时FormAuthenticationFilter会向request域中填充一个参数（记录了异常信息）。
