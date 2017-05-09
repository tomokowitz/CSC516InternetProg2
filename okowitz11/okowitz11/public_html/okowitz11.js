function Update()
{
    cakeid = dwr.util.getValue("cakeid", UpdateData);
    
}

function UpdateData(data)
{
    dwr.util.setValue("fldCakeID", data);
}