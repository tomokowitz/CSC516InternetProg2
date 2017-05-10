<HTML> 
<HEAD><TITLE>Login</TITLE></HEAD> 
<BODY> 
<H1 align="center">
  Enter your login
</H1> 
<FORM ACTION="login.do" METHOD="POST"> 
 Username: <INPUT TYPE="TEXT" NAME="username">
  <BR> Password: <INPUT TYPE="PASSWORD" NAME="password">
  <BR>Action:
  <select name="operation">
    <option value="register">Register for Class</option>
    <option value="drop">Drop a Class</option> 
    <option value="see">See Grades</option>   
  </select>
  <BR> <INPUT TYPE="SUBMIT" VALUE="Log in"> 
</FORM>
</BODY>
</HTML>