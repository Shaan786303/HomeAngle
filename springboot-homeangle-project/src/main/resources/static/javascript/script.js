const typ = new Typed('.text2', {
	strings: ['THERE IS NOTHING LIKE STAYING HOME FOR REAL COMFORT'],
	typeSpeed: 100,
	backSpeed: 80,
	backDelay: 1000,
	loop: true
});

ScrollReveal({
	reset: true,
	distance: '80px',
	duration: 2000,
	delay: 200
});

ScrollReveal().reveal('.text1', { origin: 'top' });
ScrollReveal().reveal('.banner-container', { origin: 'bottom' });


function validate() {

	var id = document.getElementById("id").value;
	var name = document.getElementById("name").value;
	var email = document.getElementById("email").value;
	var password = document.getElementById("password").value;
	var contact = document.getElementById("contact").value;
	var address = document.getElementById("address").value;
	if (id == null || id == '') {
		alert("Id field should not be empty");
		return false;
	}

	if (name == null || name == '') {
		alert("Name field should not be empty");
		return false;
	}

	if (email == null || email == '') {
		alert("Email field should not be empty");
		return false;
	}

	if (password == null || password == '') {
		alert("Password field should not be empty");
		return false;
	}

	if (contact == null || contact == '') {
		alert("Contact field should not be empty");
		return false;
	}

	if (address == null || address == '') {
		alert("Address field should not be empty");
		return false;
	}

	return true;


	/*	if (address == null || address == '') {
			document.getElementById("error").innerHTML = "*Address should not be empty";
			return false;
		}*/

	/*if (name == null || un == '') {
		alert("Username should not be empty");
		return false;
	}
	
	if (cn == null || cn == '') {
		alert("Contact should not be empty");
		return false;
	}
	if (pass == null || pass == '') {
		alert("Password should not be empty");
		return false;
	}*/

}

var preloader= document.getElementById('loading');
function myFunc(){
    preloader.style.display = 'none';
}

