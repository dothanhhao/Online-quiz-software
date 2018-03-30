<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tạo câu hỏi</title>
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
				  <h2>Câu hỏi IQ</h2>
				</div>

				<form:form class="w3-container" action="${pageContext.request.contextPath}/HomeStaff/createQuestion" modelAttribute="form_question" method="post">
				  <p>
				  <label>Tên câu hỏi: </label>
				  <input class="w3-input" type="text" name="name" path="name"></p>
				  <p>
				  <label>Loại câu hỏi: </label>
				  <select class="w3-input" type="text" name="type" path="type">
				  	<option value="radio">Một một đáp án đúng</option>
				  	<option value="checbox">Nhiều nhiều đáp án đúng</option>
				  </select>
				  <input class="w3-input" type="text" name="levelTest" path="levelTest"></p>
				  <p>
				  <p>
				  <label>Số lượng câu trả lời: </label>
				   <select class="w3-input" type="number" id="answer_number" name="answer_number" path="answer_number">
				  	<option value="2">2</option>
				  	<option value="3">3</option>
				  	<option value="4">4</option>
				  </select>
	
				
				  	<div id="answer_1" style="display: block">
				  		<p>
						  <label>Tên đáp án 1: </label>
						  <input class="w3-input" type="text" name="answer1.name" path="answer1.name">
						  Đáp án Đúng: <input class="w3-input w3-check" type=checkbox name="answer1.correct" path="answer1.correct" value="true">
						  </p>
				  	</div>
				  	
				  	<div id="answer_2" style="display: block">
				  		<p>
						  <label>Tên đáp án 2: </label>
						  <input class="w3-input" type="text" name="answer2.name" path="answer2.name">
						  Đáp án Đúng: <input class="w3-input w3-check" type=checkbox name="answer2.correct" path="answer2.correct" value="true">
						  </p>
				  	</div>
				  	
				  	<div id="answer_3" style="display: none">
				  		<p>
						  <label>Tên đáp án 3: </label>
						  <input class="w3-input" type="text" name="answer3.name" path="answer3.name">
						  Đáp án Đúng: <input class="w3-input w3-check" type=checkbox name="answer3.correct" path="answer3.correct" value="true">
						  </p>
				  	</div>
				  	
				  	<div id="answer_4" style="display: none">
				  		<p>
						  <label>Tên đáp án 4: </label>
						  <input class="w3-input" type="text" name="answer4.name" path="answer4.name">
						  Đáp án Đúng: <input class="w3-input w3-check" type=checkbox name="answer4.correct" path="answer4.correct" value="true">
						  </p>
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
	$("#answer_number").change(function(){
        if($(this).val()==2){
        	$("#answer_1").show(); 
        	$("#answer_2").show(); 
        	$("#answer_3").hide();
        	$("#answer_4").hide();
        	
        }else if($(this).val()==3){
        	$("#answer_1").show(); 
        	$("#answer_2").show(); 
        	$("#answer_3").show(); 
        	$("#answer_4").hide();
        }else{
        	$("#answer_1").show(); 
        	$("#answer_2").show(); 
        	$("#answer_3").show(); 
        	$("#answer_4").show();
        }
    });
	
	
 });
</script>
 
</html>