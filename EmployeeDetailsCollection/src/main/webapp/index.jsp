<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="DbController" method="post">
		<div>

			EmployeeId : <input type="text" name="employeeid" id="employeeid">
		</div>
		<br /> <br />

		<div>
			EmployeeName : <input type="text" name="employeename" id="employeename">
		</div>
		<br /> <br />
		<div>
			FatherName : <input type="text" name="fathername" id="fathername">
		</div>
		<br /> <br />
		<div>
			MotherName : <input type="text" name="mothername" id="mothername">
		</div>
		<br /> <br />
		<div>
			Dob : <input type="text" name="dob" id="dob">
		</div>
		<br /> <br />
		<div>
			EmailId : <input type="text" name="emailid" id="emailid">
		</div>
		<br /> <br />
		<div>
			City : <input type="text" name="city" id="city">
		</div>
		<br /> <br />
		<div>
			PhoneNo : <input type="text" name="phoneno" id="phoneno">
		</div>
		<br /> <br />
		<div>

			<button type="submit">SUBMIT</button>
		</div>
	</form>

</body>
</html>