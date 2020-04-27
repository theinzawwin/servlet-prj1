<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="row">
	<div class="col-8">
		<div class="card">
			<div class="card-header">Student  List</div>
			<div class="card-body">
				<div class="row">
					<table class="table table-success">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Roll No</th>
								<th>Phone Number</th>
								<th>Address</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${studentList }" var="std">
						<tr> 
							<td>${std.id }</td>
							<td>${std.name }</td>
							<td>${std.rollNo }</td>
							<td>${std.phoneNo }</td>
							<td>${std.address }</td>
							</tr>
						</c:forEach>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
		</div>
		
	</div>
</div>
</body>
</html>