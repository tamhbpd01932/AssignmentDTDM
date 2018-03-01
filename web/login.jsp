<%-- 
    Document   : login
    Created on : Oct 10, 2017, 11:06:05 PM
    Author     : Tam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminAditii</title>
        <script src="js/login.js" type="text/javascript"></script>
        <link href="css/logincss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="login-page">
            <div class="form">
                <div class="logo">
			<a href="../index.jsp"><img src="../images/logo.png" alt=""/> </a>
		</div>
                <h1>Login</h1>
                <form class="register-form">
                    <input type="text" placeholder="name"/>
                    <input type="password" placeholder="password"/>
                    <input type="text" placeholder="email address"/>
                    <button>create</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                </form>
                <form class="login-form" action="LoginServlet">
                    <input type="text" placeholder="username" name="user"/>
                    <input type="password" placeholder="password" name="pass"/>
                    <button>login</button>
                    <p class="message">Not registered? <a href="#">Create an account</a></p>
                </form>
            </div>
        </div>
    </body>
</html>
