<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
<link rel="stylesheet" href="css/style.css">
<link rel="icon" type="image/png" sizes="16x16"
	href="favicons/favicon-16x16.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="favicons/favicon-32x32.png">
<link rel="apple-touch-icon" sizes="57x57"
	href="favicons/apple-touch-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60"
	href="favicons/apple-touch-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="favicons/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="favicons/apple-touch-icon-76x76.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="favicons/apple-touch-icon-96x96.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="favicons/apple-touch-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="favicons/apple-touch-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144"
	href="favicons/apple-touch-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="favicons/apple-touch-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180"
	href="favicons/apple-touch-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"
	href="/favicons/android-icon-192x192.png">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Bevan&family=Satisfy&display=swap"
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Bevan&family=Cabin&family=Satisfy&display=swap"
	rel="stylesheet">
<title>Trang ch???</title>
</head>
<style>
#bg {
	position: fixed;
	top: 0;
	left: 0;
	/* Preserve aspet ratio */
	min-width: 100%;
	min-height: 100%;
}

.home {
	min-height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-flow: column;
	position: relative;
	z-index: 0;
}

.home .content {
	text-align: center;
}

.home .content h3 {
	text-align: center;
	font-size: 69px;
	font-family: 'Bevan', cursive;
	color: #fff;
	text-transform: uppercase;
	text-shadow: 0 .3rem .5rem rgba(121, 121, 121, 0.971);
}

.home .content h5 {
	font-size: 42px;
	color: #fff;
	padding: .10px 0;
	text-align: center;
	font-family: 'Cabin', sans-serif;
	text-shadow: 5px 5px 15px rgba(121, 121, 121, 0.971);
}

.home .image-container img {
	position: absolute;
	top: 0;
	left: 0;
	z-index: -1;
	height: 100vh;
	width: 100%;
	object-fit: cover;
}

.home .controls {
	padding: 1rem;
	border-radius: 5rem;
	background: rgba(0, 0, 0, .7);
	position: relative;
	top: 10rem;
}
</style>
<body>
	<!-- nav starts  -->

	<nav class="navbar navbar-expand-lg navbar-light sticky-top"
		style="background-color: rgb(1, 95, 163);">
		<a class="navbar-brand" href="index.jsp"><img src="images/vku.png"
			alt="" width="66px" height="35px"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarColor03" aria-controls="navbarColor03"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarColor03">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Trang
						ch???</a></li>
				<c:if test="${sessionScope.acc.isUser==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">????ng
							k??</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="register-live.jsp">????ng k?? ???
								n???i tr??</a> <a class="dropdown-item"
								href="register-infor-student.jsp">????ng k?? th??ng tin c?? nh??n</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isAdmin==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Qu???n
							l??</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="quanlySV">Qu???n l?? sinh vi??n</a> <a
								class="dropdown-item" href="quanlyPhong">Qu???n l?? ph??ng</a> <a
								class="dropdown-item" href="">Qu???n l?? t??i kho???n</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isUser==1}">

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">C???p
							nh???t th??ng tin</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="booktour.jsp">C???p nh???t th??ng
								tin ??? n???i tr???</a> <a class="dropdown-item" href="bookticket.jsp">C???p
								nh???t th??ng tin c??c nh??n</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isAdmin==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Th??ng
							b??o</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="">Duy???t ????ng k?? ph??ng</a> <a
								class="dropdown-item" href="">Li??n l???c sinh vi??n, ph??? huynh</a>
							<a class="dropdown-item" href="">Th??ng b??o n???p ti???n</a> <a
								class="dropdown-item" href="">Th??ng b??o h???t h???n</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc.isUser==1}">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Bi???u
							m???u</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="booktour.jsp">????n ????ng k?? ???
								n???i tr??</a> <a class="dropdown-item" href="bookticket.jsp">H???p
								?????ng</a> <a class="dropdown-item" href="bookticket.jsp">Quy ?????nh</a>
						</div></li>
				</c:if>

				<c:if test="${sessionScope.acc!=null}">
					<li class="nav-item"><a class="nav-link" href="index.jsp">Xin
							ch??o ${sessionScope.acc.username} !</a></li>
				</c:if>

			</ul>
			<c:if test="${sessionScope.acc==null}">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="login.jsp"><i
							class="fa-solid fa-right-to-bracket"></i>????ng nh???p</a></li>
				</ul>
			</c:if>
			<c:if test="${sessionScope.acc!=null}">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="logout"><i
							class="fa-solid fa-right-to-bracket"></i>????ng xu???t</a></li>
				</ul>
			</c:if>
		</div>
	</nav>
	<!-- nav end -->
	<section class="home" id="home">

		<div class="content">
			<h3 data-aos="fade-down" data-aos-easing="ease-in-sine"
				data-aos-duration="1000">H??? TH???NG K?? T??C X?? VKU!</h3>
			<h5 data-aos="fade-up" data-aos-easing="ease-in-sine"
				data-aos-duration="2000">????ng k?? th??nh c??ng! Vui l??ng ????ng nh???p
				????? s??? d???ng h??? th???ng!</h5>
			<!-- <button class="btn btnChinh" ="fade-up" -duration="1000"
                    -anchor-placement="bottom-bottom">T??m hi???u th??m</button> -->
		</div>

		<div class="image-container">
			<img src="images/background.jpg" alt="">
		</div>

	</section>
	<script>
//            var btn = document.getElementById("search");
//            btn.addEventListener("click", function () {
//                $.ajax({
//                    url: "/tomcat/searchSV",
//                    type: "get",
//                    beforeSend: function () {
//                        $('#image_id').show();
//                    },
//                    success: function (data) {
//                        $('#image_id').hide();
//                        var row = document.getElementById("info_student");
//                        row.innerHTML = data;
//                    },
//                    error: function (xhr) {
//                        //Do Something to handle error
//                    }
//                });
//            });

            function searchSVAjax() {
                var masvSearch = document.getElementById('masv').value;
//                var infor = x.parentElement.children;
//                var masvSearch = infor[0].value;
                console.log(masvSearch);
                $.ajax({
                    url: "/tomcat/searchSV",
                    type: "get",
                    data: {
                        masv: masvSearch
                    },
                    beforeSend: function () {
                        $('#ajax-loader').show();
                    },
                    success: function (data) {
                        $('#ajax-loader').hide();
                        var row = document.getElementById("info_student");
                        row.innerHTML = data;
                    },
                    error: function (xhr) {
                        //Do Something to handle error
                    }
                });
            }
            var input = document.getElementById("masv");
            input.addEventListener("keypress", function (event) {
                if (event.key === "Enter") {
                    if (input.value == "") {
                        alert("Vui l??ng nh???p m?? sinh vi??n!");
                    } else {
                        event.preventDefault();
                        document.getElementById("search").click();
                    }

                }


            });
            var btn = document.getElementById("search");
            btn.addEventListener('click', function () {
                if (input.value == "") {
                    alert("Vui l??ng nh???p m?? sinh vi??n!");
                } else {
                    searchSVAjax();
                }
            })
        </script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>