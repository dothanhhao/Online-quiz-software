<%-- 
    Document   : employees
    Created on : Nov 18, 2017, 7:05:00 PM
    Author     : WOLF_IT
--%>



<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="vi">
<!-- Head -->
<head>
<title>Notification</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<meta name="keywords" content="Fitness Goals a Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

<!-- Default-JavaScript-File -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.js"></script>
<!-- //Default-JavaScript-File -->

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/owl.carousel.css" type="text/css" media="all"/> <!-- Owl-Carousel-CSS -->

<!-- default css files -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css" type="text/css" media="all">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style_1.css" type="text/css" media="all">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/font-awesome.min_1.css" />
	 <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/W3.css" />
<!-- default css files -->
	
<!-- For testimonials -->	
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/flexslider.css" type="text/css" media="screen" /><!-- Flexislider-CSS -->
<!-- //For testimonials -->

<!-- gallery -->
<link href='<%=request.getContextPath()%>/css/simplelightbox.min.css' rel='stylesheet' type='text/css'>
<!-- //gallery -->

<!-- web font-->
	
	
<!-- //web font-->

</head>

<!-- Body -->
<body>

	<input type="hidden" id="h_val" value="${h}"/> <br/>
    <input type="hidden" id="m_val"  value="${m}"/> <br/>
    <input type="hidden" id="s_val" value="${s}"/>
 
    <div style="padding: 10px;padding-top:50px;padding-bottom:50px; witdh: 200px;border: 1px solid black; border-radius: 10px;">
            <span id="h">Giờ</span> :
            <span id="m">Phút</span> :
            <span id="s">Giây</span>
   </div>
	
    <div class="about" id="about" style="margin-top: 50px;">
		<h3 class="heading">Test IQ TDT</h3>
		<h3>${Msg}</h3>	
		<div class="container">
			<div class="w3ls_banner_bottom_grids">
				<%	
				int i =0;
				%>
				<form:form class="w3-container" action="${pageContext.request.contextPath}/HomeMember/test"  method="post">
                 
                <c:forEach var="question" items="${listTest.question}">
					
				 
						<div class="col-md-12 w3_agileits_about_grid_left" style="padding-top: 20px;" id="question<% out.print(++i);%>">
                			<h4 ><% out.print(i);%>. ${question.name}</h4><br>
                			<img src="<%=request.getContextPath()%>/img/${question.image}" alt="Smiley face" height="500" width="500">
                			<c:forEach var="answer" items="${question.listAnswer}">
                			<c:choose>
							    <c:when test="${question.type == 'radio'}">
		                				<div style="font-size: 18px;margin-bottom: 3px;" >
		                				<img src="<%=request.getContextPath()%>/img/${answer.image}" alt="Smiley face" height="100" width="100">
		                				<input id="id_${answer.id}" class="w3-radio" type="radio" name="answer<% out.print(i);%>"
		                				  value="${answer.id}"> <span for="#id_${answer.id}"> ${answer.name}</span>
		                				 </div>
							    </c:when>    
							    <c:otherwise>
							       	<div style="font-size: 18px;margin-bottom: 3px;" ">
		                				<input id="id_${answer.id}" class="w3-check" type="checkbox" name="answer<% out.print(i);%>"
		                				  value="${answer.id}">  <span for="#id_${answer.id}"> ${answer.name}</span>
		                				 </div>
							    </c:otherwise>
							</c:choose>
                			</c:forEach>
		                </div>        
		             
		                <div class="clearfix"> </div>    
				</c:forEach>           
				<button class="w3-btn w3-green" id="id_submit" name="action" type="submit">Nộp bài</button>
                 </form:form>         
                              
				<!-- <div class="col-md-6 w3_agileits_about_grid_left">
					<img src="http://www.tdtu.edu.vn/sites/www/files/events/2017/TDTU-20-nam.jpg" class="img-responsive">
				</div>
				<div class="col-md-6 w3_agileits_about_grid_right">
					<h3>Title TDT</h3>
					<h3>Writer</h3>
					<p>
Ton Duc Thang University (TDTU) is a public university under the General Federation of Labor of Vietnam; Established on September 24, 1997; To date, TDTU has become Vietnam's Top 2 University and is on its way to establishing a position in the list of the best universities in Asia.
<i>The message of TDTU speaks about the motto of action of all lecturers, officers and students of Ton Duc Thang University.</i>
					</p>
				</div>
				
				<div class="clearfix"> </div>
			</div> -->
			
		</div>
	</div>
<script type="text/javascript">
$(document).ready(function(){
	
	
	$('#buttonDemo1').click(function(){
		/* alert('demo 1'); */

		$.ajax({
			type: 'GET',
			url:'<%=request.getContextPath()%>/ajax/demo1.html',
			success: function(result){
				$('#result1').html(result);
			}
		});
	});

	$('#buttonDemo2').click(function(){
		/* alert('demo 1'); */
		var fullName = $('#fullName').val();
		$.ajax({
			type: 'GET',
			url:'<%=request.getContextPath()%>/ajax/demo2/'+fullName+'.html',
			success: function(result){
				$('#result2').html(result);
			}
		});
	});

	var h = null;
	var m = null;
	var s = null;
	var timeout = null; // Timeout
	
	start();
	
	function start()
	{
		

	    /*BÆ¯á»C 1: Láº¤Y GIÃ TRá» BAN Äáº¦U*/
	    if (h === null)
	    {
	        h = parseInt(document.getElementById('h_val').value);
	        m = parseInt(document.getElementById('m_val').value);
	        s = parseInt(document.getElementById('s_val').value);
	    }

	    /*BÆ¯á»C 1: CHUYá»N Äá»I Dá»® LIá»U*/
	    // Náº¿u sá» giÃ¢y = -1 tá»©c lÃ  ÄÃ£ cháº¡y ngÆ°á»£c háº¿t sá» giÃ¢y, lÃºc nÃ y:
	    //  - giáº£m sá» phÃºt xuá»ng 1 ÄÆ¡n vá»
	    //  - thiáº¿t láº­p sá» giÃ¢y láº¡i 59
	  
		
	   
	    
	    if (s >= 0 || s === -1){
		    if(s === -1){
	        	m -= 1;
	        	s = 59;
		    }
	        $.ajax({
				type: 'GET',
				url:'<%=request.getContextPath()%>/HomeMember/test/load/'+m+'&&'+s+'.html',
				success: function(result){
					var kq = result;
					if(kq != "stop"){
						$('#m_val').val(result);
					}else{
						return false;
					}
				}
			});
	        
	        
	    }
	    
	    // Náº¿u sá» phÃºt = -1 tá»©c lÃ  ÄÃ£ cháº¡y ngÆ°á»£c háº¿t sá» phÃºt, lÃºc nÃ y:
	    //  - giáº£m sá» giá» xuá»ng 1 ÄÆ¡n vá»
	    //  - thiáº¿t láº­p sá» phÃºt láº¡i 59
	    if (m === -1){
	        h -= 1;
	        m = 59;
	    }

	    // Náº¿u sá» giá» = -1 tá»©c lÃ  ÄÃ£ háº¿t giá», lÃºc nÃ y:
	    //  - Dá»«ng chÆ°Æ¡ng trÃ¬nh
	    if (h == -1){
	        clearTimeout(timeout);
	       
	       
	        
	        var p = document.getElementById("id_submit");
	        p.click();
	        return false;
	    }

	    /*BÆ¯á»C 1: HIá»N THá» Äá»NG Há»*/
	    document.getElementById('h').innerText = h.toString();
	    document.getElementById('m').innerText = m.toString();
	    document.getElementById('s').innerText = s.toString();

	    /*BÆ¯á»C 1: GIáº¢M PHÃT XUá»NG 1 GIÃY VÃ Gá»I Láº I SAU 1 GIÃY */
	    timeout = setTimeout(function(){
	        s--;
	        start();
	    }, 1000);
	}
	
});
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-2.1.4.min.js"></script>
    <!--paging-->

    <%-- <div class="pagination-paging container">
	<div class="col-md-12">
		<div style="margin: auto;
	    width: 50%;">
		  <a href="${pageContext.request.contextPath}/NotificationController?page=${sessionScope.Number_Choic_Page - 1}#">&laquo;</a>
                  
                  <c:forEach var = "i" begin = "1" end = "${sessionScope.Number_Page}">
                       
                        <c:if test = "${i == sessionScope.Number_Choic_Page}">
                            <a href="${pageContext.request.contextPath}/NotificationController?page=${i}#" class="active">${i}</a>
                        </c:if>
                        <c:if test = "${i != sessionScope.Number_Choic_Page}">
                            <a href="${pageContext.request.contextPath}/NotificationController?page=${i}#">${i}</a>
                        </c:if>
                 </c:forEach>
		
		  <a href="${pageContext.request.contextPath}/NotificationController?page=${sessionScope.Number_Choic_Page + 1}#">&raquo;</a>
	  </div>
        </div>
    </div>
 --%>
</body>
<!-- //Body -->
</html>
