<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./style/style.css" />
<title>Login</title>
</head>
<body>
    <div id="container-login">
    
    
        <div id="title">
        
            <h3 class="material-icons lock">Login</h3>
        </div>
		<div id="title2">
            <h3 class="material-icons lock">${message}</h3>
        </div>
        <div id="title2">
            <h3 class="material-icons lock">${success}</h3>
        </div>
          <div id="title2">
            <h3 class="material-icons lock">${msg}</h3>
        </div>
        <form name="reg" method="post"
			action="LoginRegisterServlet" onSubmit="return validation()">
            <div class="input">
                <div class="input-addon">
                    <i >User ID</i>
                </div>
                <input id="username" name ="userid" placeholder="Username" type="text" required class="validate" autocomplete="off">
            </div>

            <div class="clearfix"></div>

            <div class="input">
                <div class="input-addon">
                    <i>Password</i>
                </div>
                <input id="password" name ="password" placeholder="Password" type="password" required class="validate" autocomplete="off">
            </div>

            <div class="remember-me">
                <input type="checkbox">
                <span style="color: #DDD">Remember Me</span>
            </div>

            <input type="submit" name="submit" value="Login" />
        </form>

        <div class="forgot-password">
            <a href="#">Forgot your password?</a>
        </div>

        <div class="register">
            Don't have an account yet?
            <a href="#"><button id="register-link">Register here</button></a>
        </div>
    </div>
</body>
</html>