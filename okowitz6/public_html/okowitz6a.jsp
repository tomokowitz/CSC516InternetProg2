<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252" isErrorPage="true"
         import="java.io.CharArrayWriter, java.io.PrintWriter"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>okowitz6a</title>
    <style type="text/css">
      body {
      background-color: #ffde73; 
}
    </style>
  </head>
  <body>
  <input type="select"
  
  
  
  
  An error occured:<br/><pre>
    <%
      if (exception != null) 
      { 
        out.println(exception.getMessage());
        CharArrayWriter charArrayWriter = new CharArrayWriter(); 
        PrintWriter printWriter = new PrintWriter(charArrayWriter, true); 
        exception.printStackTrace(printWriter); 
        out.println(charArrayWriter.toString()); 
      } 
    %>
    </pre></body>
</html>