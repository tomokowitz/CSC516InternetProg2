function emptySpans()
{
    dwr.util.setValue("firstName", "");
    dwr.util.setValue("lastName", "");
    dwr.util.setValue("phone", "");
    dwr.util.setValue("dob", "");    
    dwr.util.setValue("major", "");
    dwr.util.setValue("address", "");
    dwr.util.setValue("city", "");
    dwr.util.setValue("state", "");  
}   

function showData(user, passwd)
{
    if (user.length != 9 || passwd.length < 4)
    { 
        emptySpans();
        return;
    } 
    ex3Script.getStudent(user, passwd, displayStudent);
} 


function displayStudent(student)
{ 
    dwr.util.setValues(student);
}