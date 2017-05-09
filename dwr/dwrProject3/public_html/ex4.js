    function loadStudents()
    {
        ex3Script.getStudents(displayStudents);
    }

    var cellFunctions =
    [
      function(student) { return student.userid; },
      function(student) { return student.password; },
      function(student) { return student.firstName; },
      function(student) { return student.lastName; },
      function(student) { return student.phone; },
      function(student) { return student.dob; },
      function(student) { return student.major; },
      function(student) { return student.address; },
      function(student) { return student.city; },
      function(student) { return student.state; }
    ];

    function displayStudents(studentList)
    { 
        dwr.util.removeAllRows("students");
        dwr.util.addRows("students", studentList, cellFunctions);
    }


