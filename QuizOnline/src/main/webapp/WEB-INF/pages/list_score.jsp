<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thành tích</title>
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
	<div class="container" style="border: 1px solid black;padding-bottom: 5px;">
		<div class="row">
			<div class="col-sm-12 col-md-12">
			
				
				<div class="w3-container w3-blue">
				  <h2>Thành tích IQ cá nhân</h2>
				</div>
				<c:forEach var="result" items="${listScore}">
						<div>
						<h2>${result.username} Thành tích: ${result.score} điểm </h2> 
						</div>
				</c:forEach>
				 <% 
					String s = (String) request.getSession().getAttribute("ROLE"); 
					if(s.equals("member")){
				%>
				 <a href="${pageContext.request.contextPath}/HomeMember" class="w3-btn w3-blue">Trở về</a>
				<%	}else if(s.equals("admin")){ %>
				 <a href="${pageContext.request.contextPath}/HomeAdmin" class="w3-btn w3-blue">Trở về</a>
				<%
					}else{
				%>
				<a href="${pageContext.request.contextPath}/HomeStaff" class="w3-btn w3-blue">Trở về</a>
				<%
					} 
				%>
			</div>
			
		</div>
		
	</div>
	
</body>

 
</html>