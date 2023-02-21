<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Тew order</title>
</head>
<body>
<p>Name: ${employee.name}</p>
<p>Surname: ${employee.surname}</p>
<p>Age: ${employee.age}</p>
<p>Phone number: ${employee.phoneNumber}</p>
<p>Email: ${employee.email}</p>
<p>Gender: ${employee.gender}</p>
<p>Department: ${employee.department}</p>
<p>Salary: ${employee.salary}</p>
<p>Experience: ${employee.experience}</p>
<p>Languages(es)
<ul>
    <c:forEach var="languages" items="${employee.languages}">
        <li>${languages}</li>
    </c:forEach>
</ul>
</p>
</body>
</html>