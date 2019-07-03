<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Login Page</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #fc0000;
	background-color: #ffffff;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #000000;
	background-color: #0452cf;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>
    <div id="login-box">
	   <c:if test="${not empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
		<c:if test="${not empty message}">
			<div class="msg">${message}</div>
		</c:if>

    <form name='login' action="<c:url value = "login.html"/>" method='POST'>
        <table>
            <tr>
                <td>Username:</td>
                <td><input type='text' name='username' value=''></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='password' /></td>
            </tr>
            <tr>
                <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
            </tr>
        </table>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
    </div>
</body>
</html>