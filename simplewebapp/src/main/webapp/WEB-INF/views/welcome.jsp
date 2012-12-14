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
	Welcome!! <a href="logout.htm">Logout</a>
	<h2>Your Details</h2>
	<div>
		<p>UserId: ${sessionScope.LOGIN_USER.userId}</p>
		<p>UserName: ${sessionScope.LOGIN_USER.userName}</p>
		<p>Password: ${sessionScope.LOGIN_USER.password}</p>
		<p>FullName: ${sessionScope.LOGIN_USER.fullName}</p>
		<p>Email: ${sessionScope.LOGIN_USER.email}</p>
		
	</div>
</body>

</html>