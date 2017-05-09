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
    dwr.util.byId("btnSave").disabled = true;
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
    if (student.firstName != "Not Found")
        dwr.util.byId("btnSave").disabled = false;
}

function save()
{
    student = { userid:null, password:null, firstName:null, 
                    lastName:null, phone:null, dob:null, major:null,
                    address:null, city:null, state:null };
    dwr.util.getValues(student);
    ex3Script.setStudent(student); 
}

