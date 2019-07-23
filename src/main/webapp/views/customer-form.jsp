<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>spring 5</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h3 class="text-center">spring jpa audit logs demo</h3>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add Customer</div>
				</div>
				<div class="panel-body">
					<form:form action="saveCustomer" cssClass="form-horizontal"
						method="post" modelAttribute="customer">

						<!-- need to associate this data with customer id -->
						<form:hidden path="id" />

						<div class="form-group">
							<label for="fname" class="col-md-3 control-label">First
								Name</label>
							<div class="col-md-9">
								<form:input path="fname" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="lname" class="col-md-3 control-label">Last
								Name</label>
							<div class="col-md-9">
								<form:input path="lname" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label for="mInitial" class="col-md-3 control-label">Middle Name Initials</label>
							<div class="col-md-9">
								<form:input path="mInitial" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="zipcode" class="col-md-3 control-label">Zipcode</label>
							<div class="col-md-9">
								<form:input path="zipcode" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="created_date" class="col-md-3 control-label">Created Date</label>
							<div class="col-md-9">
								<form:input path="created_date" cssClass="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="date_of_birth" class="col-md-3 control-label">DOB</label>
							<div class="col-md-9">
								<form:input path="date_of_birth" cssClass="form-control" />
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>
				</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>