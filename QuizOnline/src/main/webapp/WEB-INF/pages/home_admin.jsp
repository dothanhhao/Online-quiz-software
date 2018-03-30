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
<title>ADmin TDT | Home </title>
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

<!-- banner -->
	<div class="banner" id="home">
		<div class="w3ls-slider">
		  <div class="banner-dott">
			<div class="header-top">
				<div class="container banner-drop">
					<div class="header">
						<div class="agile-logo">
							<h1><a href="index.html">TDT</a><span>Test</span></h1>
						</div>
						<!-- <ul class="top-links social">
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
						</ul> -->
						<div class="clearfix"> </div>
					</div>
					<div class="w3_menu">
					<div class="mobile-nav-button">
						<div class="mobile-nav-button__line"></div>
						<div class="mobile-nav-button__line"></div>
						<div class="mobile-nav-button__line"></div>
					</div>
					<nav class="mobile-menu">
						<ul>
							<li class="active"><a href="#home">Trang chủ</a></li>
							<li><a href="#new" class="scroll">Đề thi</a></li>
							<li><a href="#contact" class="scroll">Giới thiệu</a></li>
                                                        <li><a href="${pageContext.request.contextPath}/HomeAdmin/logout" >LogOut</a></li>
						</ul>
					</nav>
					</div>
				<div class="clearfix"> </div>

					
				</div>
			</div>
				<div class="w3l-banner-grids">
					<div class="container">
						<div class="slider">
							<div class="callbacks_container">
								<ul class="rslides" id="slider4">
									<li>
										<div class="w3ls-text">
											<h2>Lorem ipsum</h2>
							                <h3>ullamcorper sapien</h3>
											<p>Proin convallis leo vitae ligula portti Proin convallis leo vitae ligula elit mollis aliquam portti Proin convallis leo vitae ligula portti</p>
										</div>
									</li>
									<li>
										<div class="w3ls-text">
											<h3>Pellen tesque</h3>
							                <h3>faucibus nunc lectus</h3>
											<p>Proin convallis leo vitae ligula portti Proin convallis leo vitae ligula elit mollis aliquam portti Proin convallis leo vitae ligula portti vitae</p>
										</div>
									</li>
									<li>
										<div class="w3ls-text">
											<h3>Mauris velit</h3>
							                <h3>sagittis in rhoncus sed</h3>
											<p>Vivamus ut erat sit amet elit mollis aliquam Proin elit mollis aliquam convallis leo vitae ligula portti Proin convallis leo vitae ligula portti</p>
										</div>
									</li>
									
								</ul>
							</div>
							<script src="js/responsiveslides.min.js"></script>
							<script>
								// You can also use "$(window).load(function() {"
								$(function () {
								  // Slideshow 4
								  $("#slider4").responsiveSlides({
									auto: true,
									pager:true,
									nav:false,
									speed: 500,
									namespace: "callbacks",
									before: function () {
									  $('.events').append("<li>before event fired.</li>");
									},
									after: function () {
									  $('.events').append("<li>after event fired.</li>");
									}
								  });
							
								});
							 </script>
							<!--banner Slider starts Here-->
						</div>
					</div>
					
					
					
					<div class="banner-bottom-grids">
				<div class="col-md-1 banner-bottom-grid">
					
				</div>
				<div class="col-md-2 banner-bottom-grid">
                                    <a href="${pageContext.request.contextPath}/HomeAdmin/createAccount">
					<div class="banner-bottom-grd w3-agile-back">
						<h4>01</h4>
						<h3>Tạo tài khoản</h3>
						<p>Nhân viên<span> có thể tạo đề thi</span></p>
						<div class="clearfix"> </div>
					</div>
                                    </a>
				</div>
                                        
				<div class="col-md-2 banner-bottom-grid">
                                    <a href="${pageContext.request.contextPath}/HomeAdmin/listAccount">
					<div class="banner-bottom-grd w3-agile-back1">
						<h4>02</h4>
						<h3>Xem tài khoản</h3>
						<p>Nhân viên<span> có thể tạo câu hỏi</span></p>
						<div class="clearfix"> </div>
					</div>
                                    </a>
				</div>
				<div class="col-md-2 banner-bottom-grid">
                                    <a href="${pageContext.request.contextPath}/HomeStaff/createTest">
					<div class="banner-bottom-grd w3-agile-back">
						<h4>03</h4>
						<h3>Tạo đề thi</h3>
						<p>Nhân viên<span> có thể tạo đề thi</span></p>
						<div class="clearfix"> </div>
					</div>
                                    </a>
				</div>
                                        
				<div class="col-md-2 banner-bottom-grid">
                                    <a href="${pageContext.request.contextPath}/HomeStaff/createQuestion">
					<div class="banner-bottom-grd w3-agile-back1">
						<h4>04</h4>
						<h3>Tạo câu hỏi</h3>
						<p>Nhân viên<span> có thể tạo câu hỏi</span></p>
						<div class="clearfix"> </div>
					</div>
                                    </a>
				</div>
				<div class="col-md-2 banner-bottom-grid">
					<a href="${pageContext.request.contextPath}/HomeStaff/viewScore">
					<div class="banner-bottom-grd w3-agile-back2">
						<h4>05</h4>
						<h3>Xem danh sách điểm học viên</h3>
						<p>Nhân viên <span> có thể xem danh sách điểm thi</span></p>
						<div class="clearfix"> </div>
					</div>
                                    </a>
				</div>
				
				<div class="col-md-1 banner-bottom-grid">
					
				</div>
				
				
				<div class="clearfix"> </div>
		</div>

				</div>
		  </div>
		</div>
	</div>
<!-- //banner -->

<!-- about -->
	<div class="about" id="about">
	
		
	</div>
	
		
	<!-- //about -->

<!-- menu --><!-- navigation -->
<script>
	$(document).ready(function () {
	  $('.mobile-nav-button').on('click', function() {
	  $( ".mobile-nav-button .mobile-nav-button__line:nth-of-type(1)" ).toggleClass( "mobile-nav-button__line--1");
	  $( ".mobile-nav-button .mobile-nav-button__line:nth-of-type(2)" ).toggleClass( "mobile-nav-button__line--2");  
	  $( ".mobile-nav-button .mobile-nav-button__line:nth-of-type(3)" ).toggleClass( "mobile-nav-button__line--3");  
	  
	  $('.mobile-menu').toggleClass('mobile-menu--open');
	  return false;
	}); 
	});
</script>
<!-- //menu --><!-- //navigation -->
<!-- New -->
<%-- <div class="classes" id="new">
		<h3 class="heading">News TDT Testing</h3>
		<div class="flexslider-info">
			<section class="slider">
				<div class="flexslider">
					<ul class="slides">
                                                
                                                <%
                                                   int j =1;
                                                   List<Thongbao> list = (List<Thongbao>) request.getSession().getAttribute("List_Notification");
                                                   out.print(list.size());
                                                   for(int i = 0; i< list.size(); i++){
                                                      
                                                %>
                                                
                                           
                                                <br>
                                                <li>
							<div class="w3l-info1">
								<div class="col-md-6 classes-grid-1">
                                                                    <img src="<%=request.getContextPath()%>/images/TDTU-20-nam.jpg" width="350" height="350" class="img-responsive">
								</div>
								<div class="col-md-6 classes-grid-2">
									<div class="col-md-3 number">
										<h3><% out.print(j);j++; %></h3>
									</div>
									<div class="col-md-9 info">
                                                                           
                                                                                <h3><%out.print(list.get(i).getTieuDe());%></h3>
										<h5><%out.print(list.get(i).getNoiDung());%></h5>
										
    
										<div class="readmore-w3">
											<a class="readmore" href="#" data-toggle="modal" data-target="#myModal1">Read More</a>
										</div>
									</div>
								<div class="clearfix"> </div>
								</div>
								<div class="clearfix"> </div>
							</div>
						</li>
                                                <%
                                                    }
                                                %>
						<li>
							<div class="w3l-info1">
								<div class="col-md-6 classes-grid-1">
									<img src="images/class1.jpg" alt="" />
								</div>
								<div class="col-md-6 classes-grid-2">
									<div class="col-md-3 number">
										<h3>01</h3>
									</div>
									<div class="col-md-9 info">
										<h4>Aerobics classes</h4>
										<h5>Timings : Weekends[5 am to 8am]</h5>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque ut risus eget libero
										finibus facilisis. Phasellus tempus hendrerit sem ut iaculis.Sed sit amet augue sit amet 
										mauris gravida inter dum. Donec vulputate tempus sem eget tempus hendreritut.</p>
										<div class="readmore-w3">
											<a class="readmore" href="#" data-toggle="modal" data-target="#myModal1">Read More</a>
										</div>
									</div>
								<div class="clearfix"> </div>
								</div>
								<div class="clearfix"> </div>
							</div>
						</li>
						
					</ul>
				</div>
			</section>
		</div>
	</div> --%>
<!-- //our New -->

<!-- modal popup -->

<!-- //Modal1 -->

<!-- team -->
	
<!-- team -->

<!-- gallery -->
	
<!-- //gallery -->

<!-- clients section -->

<!-- clients section -->

<!-- contact -->
	<div id="contact" class="contact">
		<h3 class="heading">Liên hệ</h3>
		<div class="gal-btm">
			<div class="map-home">
				<div class="col-md-5 drop-pad sign-gd-two">
					<h3>Địa chỉ</h3>
					<ul>
						<li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i><strong>Address</strong> :Nguyễn Hữu Thọ, Tân Phong, Quận 7, Hồ Chí Minh <span>Việt Nam.</span></li>
						<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i><strong>Phone </strong> : +028 3775 5035</li>
						
						<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><strong>Link</strong>  : <a href="www.tdtu.edu.vn">www.tdtu.edu.vn</a></li>
					</ul>
					<ul class="top-links">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
					</ul>
				</div>
				<div class="col-md-7 map">
				 <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3920.0297219665244!2d106.6963433141932!3d10.732190992351535!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752fbd7511ad67%3A0xddcbd1e31e664856!2zxJDhuqFpIGjhu41jIFTDtG4gxJDhu6ljIFRo4bqvbmc!5e0!3m2!1svi!2s!4v1511016541943"></iframe> 
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	
</div>
<!-- //contact -->

<!-- footer -->
	
<!-- //footer -->

<!-- copyright -->
<div class="wthree_copy_right">
	<div class="container">
		<p>Copyright &copy; 2017 Fitness Goals. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
			
	</div>
</div>

<!-- //copyright -->
	

<!-- Testimonials script js -->
	<script defer src="<%=request.getContextPath()%>/js/jquery.flexslider.js"></script>
	<!--Start-slider-script-->
			<script type="text/javascript">
			
			$(window).load(function(){
			  $('.flexslider').flexslider({
				animation: "slide",
				start: function(slider){
				  $('body').removeClass('loading');
				}
			  });
			});
		  </script>
	<!--End-slider-script-->
<!-- //Testimonials script js -->

<!-- Owl-Carousel-JavaScript -->
	<script src="<%=request.getContextPath()%>/js/owl.carousel.js"></script>
	<script>
		$(document).ready(function() {
			$("#owl-demo").owlCarousel ({
				items : 3,
				lazyLoad : true,
				autoPlay : true,
				pagination : true,
			});
		});
	</script>
<!-- //Owl-Carousel-JavaScript -->  

<!-- start-smooth-scrolling -->
<script src="<%=request.getContextPath()%>/js/SmoothScroll.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/move-top.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smooth-scrolling -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->

</body>
<!-- //Body -->
</html>
