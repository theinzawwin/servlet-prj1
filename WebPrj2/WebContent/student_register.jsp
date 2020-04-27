<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<div class="card-header">Student  Register</div>
			<div class="card-body">
				<div class="row">
				<div class="col-12">
				<form action="StudentServlet">
					<div class="form-group">
						<label class="col-4">Name</label>
						<input type="text" name="name" class="form-control" class="col-8">
					</div>
					<div class="form-group">
						<label class="col-4">RollNo</label>
						<input type="text" name="rollNo" class="form-control" class="col-8">
					</div>
					<div class="form-group">
						<label class="col-md-4">Phone Number:</label>
						<input type="text" name="phoneNo" class="form-control" class="col-8">
					</div>
					<div class="form-group">
						<label class="col-md-4">Address</label>
						<input type="text" name="address" class="form-control" class="col-8">
					</div>
					<input type="submit" value="Register" class="btn btn-primary" />
				</form>
		</div>
		</div>
			</div>
		</div>
		</div>
		
	</div>
</div>
</body>
</html>