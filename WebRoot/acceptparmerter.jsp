<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="<%=basePath%>/acceptParmerter.do" method="post">
    	<table cellpadding="0" border="0" align="center">
    		<tr>
    			<td>姓名</td>
    			<td><input name="name" type="text" width="180" height="23"></td>
    		</tr>
    		<tr>
    			<td>年龄</td>
    			<td><input name="age" type="text" width="180" height="23"></td>
    		</tr>
    		<tr>
    			<td>地址</td>
    			<td><input name="address" type="text" width="180" height="23"></td>
    		</tr>
    		<tr>
    			<td>职业</td>
    			<td><input name="work" type="text" width="180" height="23"></td>
    		</tr>
    		
    		<tr>
    			<td></td>
    			<td></td>
    		</tr>
    		
    		<tr>
    			<td></td>
    			<td><input type="submit" height="23" value="提交" width="40"></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
