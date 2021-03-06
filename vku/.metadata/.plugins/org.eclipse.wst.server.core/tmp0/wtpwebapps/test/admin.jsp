<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
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
<link rel="stylesheet" href="css/style.css">
<title>Quản lý sinh viên</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
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
<title>Quản lý sinh viên</title>
</head>
<body>

	<!-- Modal -->
	<div class="modal fade" id="addStd" tabindex="-1" role="dialog"
		aria-labelledby="addStd" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="./execSignup" method="post"
						enctype='multipart/form-data'>
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="masv">Mã sinh viên <span><span>*</span></span></label>
									<input type="text" name="masv" class="form-control" id="masv"
										required>

								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<label for="hoten">Họ tên <span><span>*</span></span></label> <input
										type="text" id="hoten" class="form-control" name="hoten"
										required>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="img">Ảnh <span><span>*</span></span></label> <input
										type="file" id="img" name="img" accept="image/*">

								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="ngaysinh">Ngày sinh <span>*</span></label> <input
										type="text" name="dob" placeholder="dd-mm-yyyy"
										class="form-control" id="datepicker" onclick="datepicker()">

								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="gioitinh">Giới tính <span>*</span></label> <select
										id="gioitinh" name="gioitinh" class="form-control"
										required="required">
										<option value="" selected disabled>--Chọn giới tính--</option>
										<option name="gioitinh" value="Nam" class="form-control"
											id="gioitinh">Nam</option>
										<option name="gioitinh" value="Nữ" class="form-control"
											id="gioitinh">Nữ</option>
									</select>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<label for="lop">Lớp <span>*</span></label> <input type="text"
										name="lop" id="lop" class="form-control" required="required">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="nganh">Ngành <span>*</span></label> <input
										type="text" name="nganh" class="form-control" id="nganh"
										required="required">
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<label for="khoa">Khoa <span>*</span></label> <input
										type="text" name="khoa" class="form-control" id="khoa"
										required="required">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="cmnd">CMND/CCCD <span>*</span></label> <input
										type="text" name="cmnd" class="form-control" id="cmnd"
										required="required">
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<label for="truong">Trường <span>*</span></label> <input
										type="text" name="truong" class="form-control" id="truong"
										required="required">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
									<label for="sdt">Số điện thoại cá nhân <span>*</span></label> <input
										type="text" name="sdtSV" class="form-control" id="sdt"
										required="required">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<label for="sdt">Số điện thoại gia đình <span>*</span></label>
									<input type="text" name="sdtPH" class="form-control" id="sdt"
										required="required">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<label for="email">Email <span>*</span></label> <input
										type="email" name="email" class="form-control" id="email"
										required="required">
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<label for="diachi">Địa chỉ <span>*</span></label> <input
										type="text" name="diachi" class="form-control" id="diachi"
										required="required">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">

								<input type="submit"
									class="btn btn-success btn-send  pt-2 btn-block
                                                               "
									value="Lưu">

							</div>

						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Hủy</button>
				</div>
			</div>
		</div>
	</div>

	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Mã sinh viên</th>
				<th scope="col">Tên sinh viên</th>
				<th scope="col">Ngày sinh</th>
				<th scope="col">Giới tính</th>
				<th scope="col">Lớp</th>
				<th scope="col">Ngành học</th>
				<th scope="col">Khoa</th>
				<th scope="col">Trường</th>
				<th scope="col">CMND</th>
				<th scope="col">Số điện thoại cá nhân</th>
				<th scope="col">Số điện thoại gia đình</th>
				<th scope="col">Email</th>
				<th scope="col">Địa chỉ</th>
				<th scope="col" colspan="2">Hành động</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listS}" var="x">
				<tr>
					<td>${x.masv}</td>
					<td>${x.ten}</td>
					<td>${x.ngaysinh}</td>
					<td>${x.gioitinh}</td>
					<td>${x.lop}</td>
					<td>${x.nganh}</td>
					<td>${x.khoa}</td>
					<td>${x.truong}</td>
					<td>${x.CMND}</td>
					<td>${x.sdtCanhan}</td>
					<td>${x.sdtGiadinh}</td>
					<td>${x.email}</td>
					<td>${x.diachi}</td>
					<td><button onclick="javascript:showUpdate('${x.masv}')">Sửa</button>
						<button type="button" onclick="javascript:showMess('${x.masv}')">Xóa</button>
					</td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
	<button class="btn btn-primary btn-lg" data-toggle="modal"
		data-target="#addStd">Thêm sinh viên</button>
	<script>
	function showMess(id) {
	    var option = confirm("Bạn có muốn xóa không?");
	    if (option === true) {
	      window.location.href = "deleteStudent?sid=" + id;
	    }
	  }
	function showUpdate(id) {
		window.location.href = "updateStd?sid=" + id;
	}
	</script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/script.js"></script>
</body>
</html>