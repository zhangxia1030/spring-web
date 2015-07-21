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
	<script type="text/javascript" src="http://localhost:8080/spring-web/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript">
		$.ajax({
			url:'<%=basePath%>/toXml.do',
			type:'post',
			//dataType:'text',
			contentType:'application/xml',
			success:function(data)
			{
				//$("#tip").html(JSON.stringify(data));
				alert(data);
				$("#tipXml").html($(data));
			}
		});
		
		$.ajax({
			url:'<%=basePath%>/rest.do',
			type:'post',
			//dataType:'text',
			contentType:'application/json',
			success:function(data)
			{
				//$("#tip").html(JSON.stringify(data));
				$("#tipJson").html(JSON.stringify(data));
			}
		});
	</script>
  </head>
  
  <body>
    <h3 id="tipXml"></h3>
    <h3 id="tipJson"></h3>
  </body>
</html>
