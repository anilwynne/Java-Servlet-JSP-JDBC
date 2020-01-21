<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="./style/style.css" />
<script src="./js/script.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
   <div id="container-register">
        <div id="title">
            <h3> Register</h3>
        </div>
  
 <form name="reg" method="post"
			action="LoginRegisterServlet"
			onSubmit="return validation()">
     <div class="input">
                <div class="input-addon">
                    <i>First Name</i></div>
                
     <input type="text" name="firstName" placeholder="Firstname" required class="validate" autocomplete="off"/>
   </div>
      <div class="input">
                <div class="input-addon">
                    <i >Last Name</i>
                </div>
     <input type="text" name="lastName"  placeholder="Lastname" required class="validate" autocomplete="off" />
   </div>
      <div class="input">
                <div class="input-addon">
                    <i>Age</i>
                </div>
     <input type="text" name="age" placeholder="Age" required class="validate" autocomplete="off" />
    </div>
       <div class="input">
                <div class="input-addon">
                    <i>Gender</i>
                </div>
     <select id = "gender" name = "gen" placeholder="Gender" required class="validate" autocomplete="off">
   <option value = "male">Male</option>
   <option value = "female">Female</option>

</select>  </div>
     
      <div class="input">
                <div class="input-addon">
                    <i>Contact Number</i>
                </div>
     <input type="text" name="contact"  placeholder="Contact Number" required class="validate" autocomplete="off"/>
 </div>
      <div class="input">
                <div class="input-addon">
                    <i>Category</i>
                </div>
     <select id = "category" name = "category" placeholder="Category"required class="validate" autocomplete="off">
   <option value = "Admin">Admin</option>
   <option value = "User">User</option>

</select> </div>
 
      <div class="input">
                <div class="input-addon">
                    <i>User Id</i>
                </div>
     <input type="text" name="userid" placeholder="UserId"/>
   </div>
      <div class="input">
                <div class="input-addon">
                    <i >Password</i>
                </div>
     <input type="password" name="password" placeholder="Password" required class="validate" autocomplete="off"/>
  </div>
      <div class="input">
                <div class="input-addon">
                    <i>Picture</i>
                </div>
     <input type = "file" name = "pic" size = "10"  required class="validate" autocomplete="off"/>
    </div>
    <br>
   <input class="bt" type="submit" name="submit" value="Register" />
  </form>
 </div>
</body>
</html>