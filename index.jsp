<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Student</title>

<link rel="stylesheet" href="./assets/css/bootstrap.min.css">
<link rel="stylesheet" href="./assets/css/bootstrap-theme.min.css">
</head>
<body>

<div class="row">
	<div class="container">
		<h3>Welcome to Add Students</h3>
		<h2>
		<a href="studs">Show All Studs</a>
		</h2>
		<form action="addStudent" method="post">
			
			<div class="col-6">
				<div class="form-group">
				<label for="fname">First Name</label>
				<input type="text" id="fname" name="fname" placeholder="First Name" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="lname">Last Name</label>
				<input type="text" id="lname" name="lname" placeholder="Last Name" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="pass">Password</label>
				<input type="password" id="pass" name="pass" placeholder="Password" class="form-control">
			</div>
			
			<div class="col-6">
					<div class="form-group">
				<label for="email">Email</label>
				<input type="text" id="email" name="email" placeholder="Email" class="form-control">
			</div>
			
			
			
			<div class="form-group">
				<label for="mobile">Mobile</label>
				<input type="text" id="mobile" name="mobile" placeholder="Mobile" maxlength="10" class="form-control">
			</div>
			</div>
			
			
			
			<div class="form-group">
				<input type="submit" value="Save" class="btn btn-warning">
			</div>
			</div>
			
			
		</form>
		
	</div>
</div>


<script type="text/javascript" src="./assets/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="./assets/js/bootstrap.min.js"></script>
</body>
</html>