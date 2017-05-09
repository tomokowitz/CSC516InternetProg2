function update() 
{
    name = dwr.util.getValue("demoName");
    ex1Script.sayHello(name, updateData);
}

function updateData(data) 
{
    dwr.util.setValue("demoReply", data);
}


