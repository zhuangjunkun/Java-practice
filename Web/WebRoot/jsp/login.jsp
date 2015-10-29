<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>用户登录</title>
	</head>
	<body>
		<html:form action="/login">
			用户名 : <html:text property="username"/><html:errors property="username"/><br/>
		&nbsp;&nbsp;密码 : <html:password property="password"/><html:errors property="password"/><br/>
			<html:submit value="登录"/><html:cancel value="取消"/>
		</html:form>
	</body>
</html>

