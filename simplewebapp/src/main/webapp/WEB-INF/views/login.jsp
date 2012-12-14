<%@ include file="taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
	<link type="text/css" href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
	<link type="text/css" href='<spring:url value="/resources/jquery/css/redmond/jquery-ui-1.8.21.custom.css"/>' rel="stylesheet" />	
	<script type="text/javascript" src='<spring:url value="/resources/jquery/js/jquery-1.7.2.min.js"/>'></script>
	<script type="text/javascript" src='<spring:url value="/resources/jquery/js/jquery-ui-1.8.21.custom.min.js"/>'></script>
	<script>
	$(function() {
		//alert('jQuery Initialized successfully');
	});
	</script>
</head>

<body>
	<h2>User Login Form:</h2>
	<div>
		<form action="login.htm" method="post">
			<p>UserName : <input type="text" name="userName"> </p>
			<p>Password : <input type="password" name="password"></p>
			<p><input type="submit" value="Login"></p>
			<p><font color="red">${ERROR_MSG}</font></p>
			<c:if test="${param.logout != null }">
				<p><font color="red">Logged out successfully.</font></p>
			</c:if>
			
		</form>
	</div>
</body>

</html>