
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zxx">
<head>
<title>TechEdu an Education Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<meta name="keywords" content="TechEdu Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
  
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style3.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zoomslider.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/font-awesome.min_1.css" />

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/lightbox.css">
<!-- carousel slider -->  
<link href="<%=request.getContextPath()%>/css/owl.carousel.css" rel="stylesheet" type="text/css" media="all"> 
<!-- //carousel slider -->

<script type="text/javascript" src="<%=request.getContextPath()%>/js/modernizr-2.6.2.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-2.2.3.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap2.js"></script>
<!--/web-fonts-->
<link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i" rel="stylesheet">
<!--//web-fonts-->
</head>
<body>
	<!--/banner-bottom-->
			  <div class="w3_agilits_banner_bootm">
			     <div class="w3_agilits_inner_bottom">
			            <div class="wthree_agile_login">
						     <ul>
								<li><i class="fa fa-phone" aria-hidden="true"></i> (+000) 837 755 035</li>
								<li><i class="fa fa-envelope-o list-icon" aria-hidden="true"></i><a href="http://www.tdtu.edu.vn">www.tdtu.edu.vn</a></li>
							</ul>
						</div>
						 
				</div>
			</div>
			<!--//banner-bottom-->
  <!--/banner-section-->
	<div id="demo-1" data-zs-src='["<%=request.getContextPath()%>/img/TDTU-20-nam.jpg","<%=request.getContextPath()%>/img/view_home.jpg","<%=request.getContextPath()%>/img/view_home2.png","<%=request.getContextPath()%>/img/view_home3.jpg","<%=request.getContextPath()%>/img/view_home4.jpg"]' data-zs-overlay="dots">
		<div class="demo-inner-content">
		<!--/header-w3l-->
			   <div class="header-w3-agileits" id="home">
			     <div class="inner-header-agile">	
				<nav class="navbar navbar-default">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1><a  href="index.html"><span class="letter">T</span>esting <span>T</span>DT</a></h1>
					</div>
					<!-- navbar-header -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li class="active"><a href="index.html">Trang chủ</a></li>
								<li><a href="#about" class="scroll">Giới thiệu</a></li>
								<li><a href="#agileits-services" class="scroll">Hệ thống</a></li>
								<li><a href="#portfolio" class="scroll">Thư viện</a></li>
								<li><a href="#team" class="scroll">Nhóm</a></li>
								<li><a href="#testimonials" class="scroll" >Chuyên môn</a></li>
								<li><a href="#contact" class="scroll">Liên hệ</a></li>
								<li><a href="#" class="scroll">${USER}</a></li>
								<li><a href='<s:url value="/HomeMember/logout"/>'>Logout</a></li>
							</ul>
						</div>
					<div class="clearfix"> </div>	
				</nav>
			</div> 

			   </div>
		<!--//header-w3l-->
			<!--/banner-info-->
			   <div class="baner-info">
			       <h2 style="color: white;">Chỉ số IQ</h2>
				   <h3><span>C</span>hào mừng đến với Đại học <span>T</span>DT</h3>
				  <p>Bạn có chắc đủ hiểu biết về những thứ dưới đây!</p>
				  <p>Hãy cùng nhau đi tìm hiểu nào</p>
				  <a class="hvr-rectangle-out w3_play_icon1" href="#" data-toggle="modal" data-target="#myModal">Tham gia ở đây</a>
			   </div>
			  
			<!--/banner-ingo-->		
		</div> 
    </div>
  <!--/banner-section-->
  <!--about -->
	<div id="about" class="wthree-about w3ls-section">
		<div class="container">
		
			<div class="agileits-banner-grids text-center">
				<div class="banner-bottom-girds">
					<div class="agileits-banner-grid bg-w3ls-active">
						<span class="fa fa-university banner-icon" aria-hidden="true"></span>
						<h4>Kiểm tra IQ</h4>
						<p>Hôm nay bản đã kiểm tra IQ chưa, hãy cùng thi nào</p>
						<a class="hvr-rectangle-out w3_play_icon1" href='<s:url value="/HomeMember/test"/>'> Bắt đầu thi</a>
					</div>
					 <div class="agileits-banner-grid">
						<span class="fa fa-tags banner-icon" aria-hidden="true"></span>
						<h4>Xem điểm số</h4>
						<p>Hôm nay bạn đã kiểm tra chưa, hãy cùng vào xem điểm nào</p>
						
							<a class="hvr-rectangle-out w3_play_icon1" href='<s:url value="/HomeMember/score"/>'> Xem</a>
					</div>
					
					<div class="clearfix"></div>
			    </div>		
			</div>	
			<h2 class="w3ls-title">Giới thiệu</h2>
			<h5 style="margin-top: 0px;margin-bottom: 0px;">Đại học Tôn Đức Thắng (TDTU) là đại học công lập thuộc<br> Tổng Liên đoàn Lao động Việt Nam.</h5>
			<div class="col-md-7  w3ls-about-left">
			

				<p>Thành lập ngày 24/9/1997; đến nay TDTU đã trở thành đại học Top 2 của Việt Nam và đang trên đường xác lập vị trí trong danh sách các đại học tốt nhất Châu Á.</p>
				<p class="about-bottom">Thông điệp TDTU phát biểu về phương châm hành động của toàn thể giảng viên, viên chức và sinh viên Đại học Tôn Đức Thắng.</p>
			</div>
			<div class="col-md-5 w3ls-row">
				
				<div class="col-md-12 w3_agileits_about_grid_right">
                                    <video  width="500" controls>
                                        <source src="<%=request.getContextPath()%>/video/AboutTDT.mp4" type="video/mp4">
                                        
                                    </video>
<!--					<iframe allowFullScreen frameborder="0"  mozallowfullscreen src="https://player.vimeo.com/video/243491065" webkitAllowFullScreen ></iframe>-->
				</div>
				<div class="clearfix"> </div>
				
			</div>
			<div class="clearfix"> </div>
			<div class="stats-info agileits-w3layouts">
				<div class="col-sm-3 col-xs-3 stats-grid">
					<div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='324' data-delay='.5' data-increment="1">1240</div>
					<div class="stats-img stat2">
							<p>Thành viên</p>
					</div>
				</div>
				<div class="col-sm-3 col-xs-3 stats-grid">
					<div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='200' data-delay='.5' data-increment="1">200</div>
					<div class="stats-img stat2">
						<p>Giảng viên</p>
					</div>
				</div>
				<div class="col-sm-3 col-xs-3 stats-grid stat1">
					<div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='156' data-delay='.5' data-increment="1">789</div>
					<div class="stats-img stat2">
						<p>Đề thi</p>
					</div>
				</div>
				<div class="col-sm-3 col-xs-3 stats-grid stat1">
					<div class='numscroller numscroller-big-bottom' data-slno='1' data-min='0' data-max='156' data-delay='.5' data-increment="1">20</div>
					<div class="stats-img stat2">
						<p>Chi nhánh</p>
					</div>
				</div>
				<div class="clearfix"></div>
		 </div>
		</div>
	</div>
	<!-- //about -->
  <!--services-->
  <div class="agileits-services w3ls-section" id="agileits-services" >
		<div class="container">
			<h3 class="w3ls-title">Hệ thống</h3>
			<div class="agileits-services-row">
				<div class="col-md-3 col-sm-6 agileits-services-grids">
					<span class="glyphicon glyphicon-stats effect-1" aria-hidden="true"></span>
					<h4>Bảng xếp hạng</h4>
					<p>Itaque earum rerum hic tenetur a sapiente delectus 
						reiciendis maiores alias consequatur aut</p>
				</div>
				<div class="col-md-3 col-sm-6 agileits-services-grids">
					<span class="glyphicon glyphicon-user effect-1" aria-hidden="true"></span>
					<h4>Thông tin cá nhân</h4>
					<p>Itaque earum rerum hic tenetur a sapiente delectus 
						reiciendis maiores alias consequatur aut</p>
				</div>
				<div class="col-md-3 col-sm-6 agileits-services-grids">
				
				<a href='<s:url value="/HomeMember/score"/>'>
					<span class="glyphicon glyphicon-list-alt effect-1" aria-hidden="true"></span>
					<h4>Xem kết quả</h4>
					<p>Itaque earum rerum hic tenetur a sapiente delectus 
						reiciendis maiores alias consequatur aut</p>
						</a>
				</div>
				<div class="col-md-3 col-sm-6 agileits-services-grids">
					<span class="glyphicon glyphicon-check effect-1" aria-hidden="true"></span>
					<h4>Xem câu hỏi hot</h4>
					<p>Itaque earum rerum hic tenetur a sapiente delectus 
						reiciendis maiores alias consequatur aut</p>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--//agileits-services-->
<!--portfolio-->
	<div id="portfolio" class="portfolio w3ls-section">
		<div class="container">
			<h3 class="w3ls-title">Hình ảnh</h3>
		<div class="sap_tabs">			
			<div id="horizontalTab">
				<ul class="resp-tabs-list">
					<li class="resp-tab-item"><span>Tất cả</span></li>
					<li class="resp-tab-item"><span>Hình vui</span></li>
					<li class="resp-tab-item"><span>Hình trí nhớ</span></li>
					<li class="resp-tab-item"><span>Hình hiểu biết</span></li>
					<li class="resp-tab-item"><span>Hình nhanh nhẹn</span></li>					
				</ul>	
				<div class="clearfix"> </div>	
				<div class="resp-tabs-container">
					<div class="tab-1 resp-tab-content">
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g1.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g1.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g2.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g2.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g3.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g3.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g8.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g8.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g5.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g5.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g6.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g6.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g4.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g4.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g7.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g7.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>		
					<div class="tab-1 resp-tab-content">
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g8.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g8.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g4.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g4.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g5.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g5.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="tab-1 resp-tab-content">
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g3.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g3.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g1.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g1.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="tab-1 resp-tab-content">
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g5.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g5.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g6.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g6.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g4.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g4.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g7.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g7.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="tab-1 resp-tab-content">
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g2.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g2.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g5.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g5.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="col-md-3 portfolio-grids">
							<a href="<%=request.getContextPath()%>/img/g6.jpg" data-lightbox="example-set" data-title="Lorem Ipsum is simply dummy the when an unknown galley of type and scrambled it to make a type specimen.">
								<img src="<%=request.getContextPath()%>/img/g6.jpg" class="img-responsive zoom-img" alt=""/>
								<div class="b-wrapper">
									<h5>TechEdu</h5>
								</div>
							</a>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>						
			</div>
		</div>
		</div>	
	</div>
	<!--//portfolio-->
  <!--//main-header-->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.zoomslider.min.js"></script>
	<!-- testimonial -->

<!-- //testimonial --> 
<!-- team -->
	<div class="testimonials w3ls-section" id="team">
		<div class="container">
			<h3 class="w3ls-title">Đề Hot</h3>
		<div class="w3_testimonials_grids w3_testimonials_grids">
			<div id="owl-demo" class="owl-carousel"> 
				<div class="item w3_agileits_testimonials_grid">
					<img src="<%=request.getContextPath()%>/img/t1.jpg" alt=" " class="img-responsive" />
					<h4>J. Hobbs</h4>
					<p>Donec quis turpis pellentesque justo pulvinar sceleris.</p>
				</div>
				<div class="item w3_agileits_testimonials_grid">
					<img src="<%=request.getContextPath()%>/img/t2.jpg" alt=" " class="img-responsive" />
					<h4>Paul</h4>
					<p>Donec quis turpis pellentesque justo pulvinar sceleris.</p>
				</div>
				<div class="item w3_agileits_testimonials_grid">
					<img src="<%=request.getContextPath()%>/img/t3.jpg" alt=" " class="img-responsive" />
					<h4>John</h4>
					<p>Donec quis turpis pellentesque justo pulvinar sceleris.</p>
				</div>
				<div class="item w3_agileits_testimonials_grid">
					<img src="<%=request.getContextPath()%>/img/t1.jpg" alt=" " class="img-responsive" />
					<h4>Michael </h4>
					<p>Donec quis turpis pellentesque justo pulvinar sceleris.</p>
				</div>
				<div class="item w3_agileits_testimonials_grid">
					<img src="<%=request.getContextPath()%>/img/t2.jpg" alt=" " class="img-responsive" />
					<h4>Christopher</h4>
					<p>Donec quis turpis pellentesque justo pulvinar sceleris.</p>
				</div>
			</div>
		</div>
	</div>
	</div>
<!-- //team -->
	<!-- contact -->
	<div class="contact-bottom w3ls-section" id="contact">
		<div class="container">
			<h3 class="w3ls-title">Liên hệ</h3>
			<p><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i><strong>Địa chỉ</strong> :Nguyễn Hữu Thọ, Tân Phong, Quận 7, Hồ Chí Minh <span>Việt Nam.</span></p>
			<div class="w3layouts-list">
					<div class="col-md-4 li"><span class="fa fa-map-marker" aria-hidden="true"></span><h6>Việt Nam</h6></div>
					<div class="col-md-4 li"><span class="fa fa-phone" aria-hidden="true"></span><h6>+028 3775 5035</h6></div>
					<div class="col-md-4 li"><span class="fa fa-location-arrow" aria-hidden="true"></span><a href="http://www.tdtu.edu.vn">www.tdtu.edu.vn</a></div>
					<div class="clearfix"></div>
			</div>
			<div class="col-md-6 col-sm-6  col-xs-6 agileits_w3layouts-map">
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3920.0297219665244!2d106.6963433141932!3d10.732190992351535!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752fbd7511ad67%3A0xddcbd1e31e664856!2zxJDhuqFpIGjhu41jIFTDtG4gxJDhu6ljIFRo4bqvbmc!5e0!3m2!1svi!2s!4v1511016541943"></iframe>
			</div>	
			<div class="col-md-6 col-sm-6 col-xs-6 contact-right-w3l">
				<form action="#" method="post">
					<input type="text" class="name" name="name" placeholder="First Name" required="">
					<input type="text" class="name" name="name" placeholder="Last Name" required="">
					<input type="email" class="name" name="name" placeholder="Email" required="">
					<input type="text" class="name" name="name" placeholder="Subject" required="">
					<textarea placeholder="Your Message" required=""></textarea>
					<input type="submit" value="SEND MESSAGE">
				</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
<!-- //contact -->

	<!-- footer -->
	<%@include file="footer.jsp" %>
<!-- //bootstrap-modal-pop-up --> 
<!--script for portfolio-->
	<script src="<%=request.getContextPath()%>/js/lightbox-plus-jquery.min.js"> </script>
	<script src="<%=request.getContextPath()%>/js/easyResponsiveTabs.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function () {
			$('#horizontalTab').easyResponsiveTabs({
				type: 'default', //Types: default, vertical, accordion           
				width: 'auto', //auto or any width like 600px
				fit: true   // 100% fit in a container
			});
		});		
	</script>
	<!--//script for portfolio-->


<script src="<%=request.getContextPath()%>/js/owl.carousel.js"></script>  
	<script>
		$(document).ready(function() { 
			$("#owl-demo").owlCarousel({
			  autoPlay: true, //Set AutoPlay to 3 seconds
			  items :3,
			  itemsDesktop : [640,2],
			  itemsDesktopSmall : [414,1],
			  navigation : true,
			  // THIS IS THE NEW PART
				afterAction: function(el){
					//remove class active
					this
					.$owlItems
					.removeClass('active')
					//add class active
					this
					.$owlItems //owl internal $ object containing items
					.eq(this.currentItem + 1)
					.addClass('active')
					}
			// END NEW PART
		 
			});
			
		}); 
	</script>
	
<!-- here starts scrolling icon -->
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
		<!-- flexSlider -->
					<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
					<script defer src="<%=request.getContextPath()%>/js/jquery.flexslider.js"></script>
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
		<!-- //flexSlider -->

		<!-- start-smoth-scrolling -->
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
		<!-- /ends-smoth-scrolling -->
	<!-- //here ends scrolling icon -->
	
<script type="text/javascript" src="<%=request.getContextPath()%>/js/numscroller-1.0.js"></script>
	
<script src="<%=request.getContextPath()%>/js/SmoothScroll.min.js"></script>
  </body>
 </html> 