<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC learn application</title>
</head>
<body>
<h1>Input your details</h1>
<form:form action="/employee/show" method="get" modelAttribute="employee">
    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Age: <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>
    Phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Gender:
    <form:radiobutton path="gender" label="Man" value="Man"/>
    <form:radiobutton path="gender" label="Woman" value="Woman"/>
    <form:errors path="gender"/>
    <br><br>
    Department: <form:select path="department">
    <form:option value="IT" label="IT"/>
    <form:option value="Rent" label="Rent"/>
    </form:select>
    <br><br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Experience: <form:select path="experience">
    <form:option value="No experience" label="No experience"/>
    <form:option value="1-3 yrs" label="1-3 yrs"/>
    <form:option value="3-5 yrs" label="3-5 yrs"/>
    <form:option value="5+ yrs" label="5+ yrs"/>
    </form:select>
    <br><br>
    Languages:
    <form:checkbox path="languages" value="ENG" label="ENG"/>
    <form:checkbox path="languages" value="FR" label="FR"/>
    <form:checkbox path="languages" value="RU" label="RU"/>
    <form:checkbox path="languages" value="UK" label="UK"/>
    <br><br>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>