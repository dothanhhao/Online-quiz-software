<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tạo đề thi</title>
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
			
				
				<div class="w3-container w3-blue">
				  <h2>Đề thi IQ</h2>
				</div>

				<form:form class="w3-container" action="${pageContext.request.contextPath}/HomeStaff/createTest" modelAttribute="form_test" method="post">
				  <p>
				  <label>Tên đề thi: </label>
				  <input class="w3-input" type="text" name="name" path="name"></p>
				  <p>
				  <label>Cấp độ: </label>
				  <select class="w3-input" type="test" name="levelTest" path="levelTest">
				  	<option value="easy">Easy</option>
				  	<option value="normal">Normal</option>
				  	<option value="hard">Hard</option>
				  	</select>
				  
				  <p>
				  <p>
				  <label>Số lượng câu hỏi: </label>
				   <select class="w3-input" type="number" id="question_test" name="questionNumber" path="questionNumber">
				  	<option value="5">5</option>
				  	<option value="10">10</option>
				  	</select>
				  	
				  <div id="question_1" style="display: block;">
				  		<p>
						  <label>Câu hỏi 1: </label>
						  <select class="w3-input" type="number" name="question1.id" path="question1.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_2" style="display: block">
				  		<p>
						  <label>Câu hỏi 2: </label>
						  <select class="w3-input" type="number" name="question2.id" path="question2.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_3" style="display: block" >
				  		<p>
						  <label>Câu hỏi 3: </label>
						  <select class="w3-input" type="number" name="question3.id" path="question3.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_4" style="display: block">
				  		<p>
						  <label>Câu hỏi 4: </label>
						  <select class="w3-input" type="number" name="question4.id" path="question4.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_5" style="display: block">
				  		<p>
						  <label>Câu hỏi 5: </label>
						  <select class="w3-input" type="number" name="question5.id" path="question5.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_6" style="display: none">
				  		<p>
						  <label>Câu hỏi 6: </label>
						  <select class="w3-input" type="number" name="question6.id" path="question6.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_7" style="display: none">
				  		<p>
						  <label>Câu hỏi 7: </label>
						  <select class="w3-input" type="number" name="question7.id" path="question7.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_8" style="display: none">
				  		<p>
						  <label>Câu hỏi 8: </label>
						  <select class="w3-input" type="number" name="question8.id" path="question8.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_9" style="display: none">
				  		<p>
						  <label>Câu hỏi 9: </label>
						  <select class="w3-input" type="number" name="question9.id" path="question9.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
				  	<div id="question_10" style="display: none">
				  		<p>
						  <label>Câu hỏi 10: </label>
						  <select class="w3-input" type="number" name="question10.id" path="question10.id">
						  	<c:forEach var="question" items="${listQuestion}">
							  	<option value="${question.id}">${question.name}</option>
						  	</c:forEach>
						  </select>
						
				  	</div>
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
				  <button class="w3-btn w3-brown" type="reset">Xóa</button>
				  <button class="w3-btn w3-green" type="submit">Tạo</button>
				  
				</form:form>
			</div>
			<div class="col-sm-3 col-md-6">
			
			</div>
		</div>
		
	</div>
	
</body>
 <script type="text/javascript">
$(document).ready(function(){
	$("#question_test").change(function(){
        if($(this).val()==5){
        	$("#question_1").show(); 
        	$("#question_2").show(); 
        	$("#question_3").show();
        	$("#question_4").show();
        	$("#question_5").show(); 
        	$("#question_6").hide(); 
        	$("#question_7").hide();
        	$("#question_8").hide();
        	$("#question_9").hide();
        	$("#question_10").hide();
        	
        }else{
        	$("#question_1").show(); 
        	$("#question_2").show(); 
        	$("#question_3").show();
        	$("#question_4").show();
        	$("#question_5").show(); 
        	$("#question_6").show(); 
        	$("#question_7").show();
        	$("#question_8").show();
        	$("#question_9").show();
        	$("#question_10").show();
        	
        }
    });
	
	
 });
</script>
 
</html>