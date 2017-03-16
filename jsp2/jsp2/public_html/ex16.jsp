<%-- ex16.jsp --%>
<%@ include file="ex17.jsp" %> 
<html>
  <head>
    <title>ex16.jsp</title>
  </head>
  <body>
  <%
    setupDB();
    String input1 = request.getParameter( "username" );
    session.setAttribute("username", input1);
    try
    {
        ResultSet rs = stmt3.executeQuery(query3);        
        stmt4.setString(1, input1);
        ResultSet rs4 = stmt4.executeQuery();            
        rs4.next();
    %>
              <P>Pick sections, <%= rs4.getString("FNAME") %> 
              <%= rs4.getString("LNAME") %> 
              <FORM ACTION="ex18.jsp" METHOD="POST">
              <TABLE BORDER='1'>
              <TR>
              <TH>Choice</TH>
              <TH>CRN</TH>
              <TH>Course</TH>
              <TH>Section</TH>
              <TH>Date</TH>
              <TH>Time</TH>
              <TH>Instructor</TH>
              <TH>Room</TH>
              </TR>
    <%
          while (rs.next())
          {
             String crn = rs.getString("CRN");
             String course = rs.getString("COURSE");
             String section = rs.getString("SECTION");
             String date = rs.getString("DATES");
             if (date == null) date = "&nbsp;";
             String time = rs.getString("TIMES");
             if (time == null) time = "&nbsp;";
             String instructor = rs.getString("INSTRUCTOR");
             if (instructor == null) instructor = "&nbsp;";
             String room = rs.getString("ROOM");
             if (room == null) room = "&nbsp;";
             out.println("<TR>");
             out.println("<TD><input type='checkbox' name='crn" + crn +
                            "' value='" + crn + "'></TD>");
             out.println("<TD>" + crn + "</TD>");
             out.println("<TD>" + course + "</TD>");
             out.println("<TD>" + section + "</TD>");     
             out.println("<TD>" + date + "</TD>");
             out.println("<TD>" + time + "</TD>");   
             out.println("<TD>" + instructor + "</TD>");
             out.println("<TD>" + room + "</TD>");   
             out.println("</TR>");
          }
    %>
         </table>
         <input type = submit value="Submit">
         </form>
    <%
        
    }
    catch (Exception e)
    {
       e.printStackTrace();     
    }
  %>
  </body>
</html>
