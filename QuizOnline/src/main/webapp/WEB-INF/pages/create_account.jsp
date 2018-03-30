<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tạo tài khoản</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	   <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/W3.css" />
</head>
 <style>
 	*{
 		margin: 0px;
 		padding: 0px;
 	}
 	.none{
 		margin: 0px;
 		padding: 0px;
 	}
 	table, th, td {
   border: 1px solid grey;
   
	}

.w3-button {width:auto;}
 </style>
 
<body>
	<div>
		<h2>${msg}</h2>
	</div>
	<div class="container"  style="border: 1px solid black;padding-bottom: 5px;">
		<div class="row">
			<div class="col-sm-12 col-md-12">
			
				
				<div class="w3-container w3-teal">
				  <h2>Tạo tài khoản IQ</h2>
				</div>
				<button class="w3-btn w3-green" id="id_tao">Tạo tài khoản</button>
				<button class="w3-btn w3-red" id="id_xoa">Xóa tài khoản</button>
				<div  id="formAccount">
				<form:form class="w3-container" action="${pageContext.request.contextPath}/HomeAdmin/createAccount" modelAttribute="form_account" method="post">
				  
				  <label class="w3-text-teal"><b>Name</b></label>
				  <input class="w3-input w3-border w3-light-grey" name="name" type="text"  path="name">
				
				  <label class="w3-text-teal"><b>Age</b></label>
				  <input class="w3-input w3-border w3-light-grey" name="age" type="number" path="age">
				  
				  <label class="w3-text-teal"><b>Address</b></label>
				  <input class="w3-input w3-border w3-light-grey" name="address" type="text" path="address">
				  
				  <label class="w3-text-teal"><b>Username</b></label>
				  <input class="w3-input w3-border w3-light-grey" name="username" type="text" path="username">
				  <label class="w3-text-teal"><b>Password</b></label>
				  <input class="w3-input w3-border w3-light-grey" name="password"  type="password" path="password">
				  <label class="w3-text-teal"><b>Role</b></label>
				  <select class="w3-input w3-border w3-light-grey" name="role" type="text" path="role">
				  	<option value="admin">Quản trị viên</option>
				  	<option value="staff">Nhân viên</option>
				  	<option value="member">Thành viên</option>
				  </select>
				  <a href="${pageContext.request.contextPath}/HomeAdmin" class="w3-btn w3-blue">Trở về</a>
				  <button class="w3-btn w3-brown" type="reset">Xóa</button>
				  <button class="w3-btn w3-green" type="submit">Lưu</button>
				  
				</form:form>
				</div>
				<div style="display: none" id="formDelete">
				<form:form  class="w3-container" action="${pageContext.request.contextPath}/HomeAdmin/deleteAccount" modelAttribute="form_account" method="post">
				  
				
				  
				  <label class="w3-text-teal"><b>Username</b></label>
				  
				 
				 <select class="w3-input w3-border w3-light-grey" name="username" type="text" path="username">
				  	 <c:forEach var="user" items="${listAccount}">
							  	<option value="${user.username}">${user.name}</option>
						  	</c:forEach>
				  </select>	
						
				  <a href="${pageContext.request.contextPath}/HomeAdmin" class="w3-btn w3-blue">Trở về</a>
				  <button class="w3-btn w3-brown" type="reset">Xóa</button>
				  <button class="w3-btn w3-green" type="submit">Lưu</button>
				  
				</form:form>
				</div>
			</div>
			<div class="col-sm-3 col-md-6">
			
			</div>
		</div>
		
	</div>
	
</body>
 <script type="text/javascript">
$(document).ready(function(){
	$("#id_tao").click(function(){
		$("#formAccount").show(); 
		$("#formDelete").hide(); 
    });

	$("#id_xoa").click(function(){
		$("#formAccount").hide();
		$("#formDelete"). show();
    });
	
	
 });
</script>
 
</html>