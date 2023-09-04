<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>E-Care App Navbar</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>

<body>

	<div class="container-fluid">
		<ul class="nav nav-tabs">
			<li class="nav-item text-dark"><a class="nav-link text-dark"
				href="/Dashboard"><b>DASHBOARD</b></a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-dark" data-toggle="dropdown"
				href="#" role="button" aria-haspopup="true" aria-expanded="false"><b>APPOINTMENTS</b></a>
				<div class="dropdown-menu">

					<a class="dropdown-item" href="/loadNewAppointmentPage">New
						Appointments</a> <a class="dropdown-item" href="/getAppointmentsList">All
						Appointments</a> <a class="dropdown-item"
						href="/DeleteAppointmentsPage">Delete Appointment</a>
				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-dark" data-toggle="dropdown"
				href="#" role="button" aria-haspopup="true" aria-expanded="false"><b>REPORTS</b></a>
				<div class="dropdown-menu">

					<a class="dropdown-item" href="#">Monthly Reports</a> <a
						class="dropdown-item" href="#">Weekly Reports</a>


				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-dark" data-toggle="dropdown"
				href="#" role="button" aria-haspopup="true" aria-expanded="false"><b>DOCTORS</b></a>
				<div class="dropdown-menu">

					<a class="dropdown-item" href="/loadNewDoctorPage">New Doctor</a> <a
						class="dropdown-item" href="/showDoctors">All Doctors</a> <a
						class="dropdown-item" href="/DeleteDoctorPage">Delete Doctor</a>

				</div>
			</li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-dark" data-toggle="dropdown"
				href="#" role="button" aria-haspopup="true" aria-expanded="false"><b>EMERGENCY</b></a>
				<div class="dropdown-menu">

					<a class="dropdown-item" href="/getICUList">Load Free Beds</a> <a
						class="dropdown-item" href="/loadICUPage">Book a Bed</a> <a
						class="dropdown-item" href="/DeleteDoctorPage">Delete Doctor</a>
				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-dark" data-toggle="dropdown"
				href="#" role="button" aria-haspopup="true" aria-expanded="false"><b>PATIENTS</b></a>
				<div class="dropdown-menu">

					<a class="dropdown-item" href="/loadNewPatientPage">New Patient</a>
					<a class="dropdown-item" href="/showPatients">All Patients</a> <a
						class="dropdown-item" href="/DeletePatientPage">Delete Patient</a>

				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-dark" data-toggle="dropdown"
				href="#" role="button" aria-haspopup="true" aria-expanded="false"><b>MEDICINES</b></a>
				<div class="dropdown-menu">

					<a class="dropdown-item" href="/loadNewMedicinePage">New
						Medicine</a> <a class="dropdown-item" href="/showMedicines">All
						Medicines</a> <a class="dropdown-item" href="/DeleteMedicinePage">Delete
						Medicine</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="/donateMedicine">Donate Medicine</a>
				</div></li>

				<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle text-dark" data-toggle="dropdown"
				href="#" role="button" aria-haspopup="true" aria-expanded="false"><b>PROVIDER ADMIN</b></a>
				<div class="dropdown-menu">

					<a class="dropdown-item" href="/provider">Access</a> <a
						class="dropdown-item" href="/">All Users</a>

				</div>
			</li>
				


			



		</ul>
	</div>

	<br></br>

</body>

</html>