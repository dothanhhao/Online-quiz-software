<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Credit Login / Register Form a Responsive Widget Template :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<meta name="keywords" content="Credit Login / Register Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="<%=request.getContextPath()%>/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all">
<link href="<%=request.getContextPath()%>/css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Oswald:400,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">

<!-- //web font -->
</head>
<body>
<h1>Wellcome to test online TDT</h1>
<h1 style="color: green;"> ${msg} </h1>
<div class="main-agileits">
<!--form-stars-here-->
		<div class="form-w3-agile">
                    
			<h2>Credit login form</h2>
			 <form:form action="${pageContext.request.contextPath}/TDTTesting/login" modelAttribute="form_login" method="post">
				<div class="form-sub-w3">
					<input type="text" name="username" path="username" placeholder="Customer number or username " required="" />
				<div class="icon-w3">
					<i class="fa fa-user" aria-hidden="true"></i>
				</div>
				</div>
				<div class="form-sub-w3">
					<input type="password" name="password" path="password" placeholder="Password" required="" />
				<div class="icon-w3">
					<i class="fa fa-unlock-alt" aria-hidden="true"></i>
				</div>
				</div>
				<p class="p-bottom-w3ls">Are you new to testing?<a class="w3_play_icon1" href="#small-dialog1">  Register here</a></p>
				
				<div class="submit-w3l">
					<input type="submit" value="Login" name="action">
				</div>
			</form:form>
		</div>
<!--//form-ends-here-->
</div>
<div id="small-dialog1" class="mfp-hide">
	<div class="contact-form1">
		<div class="contact-w3-agileits">
			<h3>Register Form</h3>
			
	        
				<form:form action="${pageContext.request.contextPath}/TDTTesting/register" method="post" modelAttribute="form_register">
					<div class="form-sub-w3ls">
						<input placeholder="Name" name="name" type="text"  path="name" required="">
						<div class="icon-agile">
							<i class="fa fa-user" aria-hidden="true"></i>
						</div>
					</div>
                      <div class="form-sub-w3ls">
                           <input placeholder="Age" name="age" type="number" path="age" required="">
						<div class="icon-agile">
							<i class="fa fa-user" aria-hidden="true"></i>
						</div>
					</div>
                                        <div class="form-sub-w3ls">
						<input placeholder="Address" name="address" type="text" path="address" required="">
						<div class="icon-agile">
							<i class="fa fa-user" aria-hidden="true"></i>
						</div>
					</div>
                                        <div class="form-sub-w3ls">
						<input placeholder="Username" name="username" type="text" path="username" required="">
						<div class="icon-agile">
							<i class="fa fa-user" aria-hidden="true"></i>
						</div>
					</div>
					
					<div class="form-sub-w3ls">
						<input placeholder="Password" name="password"  type="password" path="password" required="">
						<div class="icon-agile">
							<i class="fa fa-unlock-alt" aria-hidden="true"></i>
						</div>
					</div>
					<div class="form-sub-w3ls">
						<input placeholder="Confirm Password" name="password2" type="password" path="password" required="">
						<div class="icon-agile">
							<i class="fa fa-unlock-alt" aria-hidden="true"></i>
						</div>
					</div>							
					</div>
						<div class="login-check">
							 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><p>I Accept Terms & Conditions</p></label>
						</div>
						<div class="submit-w3l">
							<input type="submit"  name="action" value="Register">
						</div>
				</form:form>
		</div>	
</div>
<!-- copyright -->
	<div class="copyright w3-agile">
		<p> © 2017 Credit Login / Register Form . All rights reserved | Design by W3layouts | TruongNguyen</a></p>
	</div>
	<!-- //copyright --> 
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.4.min.js"></script>
	<!-- pop-up-box -->  
		<script src="<%=request.getContextPath()%>/js/jquery.magnific-popup.js" type="text/javascript"></script>
	<!--//pop-up-box -->
	<script>
		$(document).ready(function() {
		$('.w3_play_icon,.w3_play_icon1,.w3_play_icon2').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
		});
																		
		});
	</script>
</body>
</html>


