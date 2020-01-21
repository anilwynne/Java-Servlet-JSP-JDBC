function validation() {
	var ttname = document.forms["reg"]["firstName"].value;
	if(ttname=="") {
		alert("First Name is required");
		document.forms["reg"]["firstName"].focus();
		return false;
	}
	if ((ttname.length < 2) || (ttname.length > 65)) {
		alert("First name should have 2 to 65 characters.");
		document.forms["reg"]["firstName"].select();
		return false;
	}
	if (/[^a-zA-Z ]/.test(ttname)) {
		alert("Name has to be a Alphabet");
		return false;
	}
	var ttlname = document.forms["reg"]["lastName"].value;
	if(ttlname=="") {
		alert("First Name is required");
		document.forms["reg"]["lastName"].focus();
		return false;
	}
	if (/[^a-zA-Z ]/.test(ttlname)) {
		alert("Name has to be a Alphabet");
		return false;
	}
	var tage = document.forms["reg"]["age"].value;
	if(tage=="") {
		alert("Age is required.");
		document.forms["reg"]["age"].focus();
		return false;
	}

if ((tage.length > 2) || (tage.length < 2)) {
	alert("Age must in two Digit");
	document.forms["reg"]["age"].select();
	return false;
}
	if (/[^0-9/]/.test(tage)) {
		alert("Age has to be a number.");
		return false;
	}
	var contact = document.forms["reg"]["contact"].value;
	if(contact=="") {
		alert("Contact Number is Required.");
		document.forms["reg"]["contact"].focus();
		return false;
	}	
	if (/[^0-9/]/.test(tage)) {
		alert("Contact has to be a number.");
		return false;
	}

var userid = document.forms["reg"]["userid"].value;
if(userid=="") {
	alert("UserId is Required.");
	document.forms["reg"]["userid"].focus();
	return false;
}	
	var catselect = document.forms["reg"]["category"].value;
	if(catselect=="") {
		alert("Categary is required.");	
		return false;
	}
	var gender = document.forms["reg"]["gen"].value;
	if(gender=="") {
		alert("Gender is required.");	
		document.forms["reg"]["gen"].focus();
		return false;
	}
	var pass = document.forms["reg"]["password"].value;
	if(pass=="") {
		alert("Password is required");
		document.forms["reg"]["password"].focus();
		return false;
	}
	if ((pass.length < 10) || (pass.length > 15)) {
		alert("Password should have 10 to 15 characters.");
		document.forms["reg"]["password"].select();
		return false;
	}
	}
