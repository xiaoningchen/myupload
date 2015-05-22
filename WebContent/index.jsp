<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<s:debug></s:debug>
	<center>
		<s:fielderror></s:fielderror>
		<s:form action="upload" method="post" enctype="multipart/form-data" theme="simple">
			File:<s:file name="file"></s:file>
			<br>
			Desc:<s:textfield name="desc"></s:textfield>
			<br>
			<s:submit></s:submit>
		</s:form>
		<hr><br>
		<a href="download">Down load file!</a>
	</center>
</body>
</html>