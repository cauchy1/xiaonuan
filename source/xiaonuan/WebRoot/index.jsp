<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>小暖调查表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	
	-->
	
	<link rel="stylesheet" href="/dist/css/bootstrap.min.css">
	<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
	<script src="/dist/js/bootstrap.js"></script>
	
  </head>
  
  <body>
  
	<form name="regFrom" action=anwser.action>
	<label>问题1:</label>
	<input type="text" name="answer"></input>
	<input type="submit" value="提交">
	</form>
  </body>
</html>
