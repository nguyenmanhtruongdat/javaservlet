<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="16x16"
      href="favicons/favicon-16x16.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="32x32"
      href="favicons/favicon-32x32.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="57x57"
      href="favicons/apple-touch-icon-57x57.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="60x60"
      href="favicons/apple-touch-icon-60x60.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="72x72"
      href="favicons/apple-touch-icon-72x72.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="76x76"
      href="favicons/apple-touch-icon-76x76.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="96x96"
      href="favicons/apple-touch-icon-96x96.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="114x114"
      href="favicons/apple-touch-icon-114x114.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="120x120"
      href="favicons/apple-touch-icon-120x120.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="144x144"
      href="favicons/apple-touch-icon-144x144.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="152x152"
      href="favicons/apple-touch-icon-152x152.png"
    />
    <link
      rel="apple-touch-icon"
      sizes="180x180"
      href="favicons/apple-touch-icon-180x180.png"
    />
    <link
      rel="icon"
      type="image/png"
      sizes="192x192"
      href="/favicons/android-icon-192x192.png"
    />
    <link rel="stylesheet" href="css/style.css" />
    <link
      rel="stylesheet"
      href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css"
    />
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
      $(function () {
        $("#datepicker").datepicker();
      });
    </script>

    <title>Home</title>
  </head>

  <body>
    <div class="preloading">
      <img
        src="gif/pre-loader.gif"
        alt=""
        style="width: 80px !important; height: auto"
      />
    </div>
    <!-- nav starts  -->

    <nav
      class="navbar navbar-expand-lg navbar-light sticky-top"
      style="background-color: #0f2557"
    >
      <a class="navbar-brand" href="index.jsp"
        ><img src="images/vku.png" alt="" width="66px" height="35px"
      /></a>
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarColor03"
        aria-controls="navbarColor03"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarColor03">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
            <a class="nav-link" href="index.jsp">Trang ch???</a>
          </li>
          <c:if test="${sessionScope.acc.isUser==1}">
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                data-toggle="dropdown"
                href="#"
                role="button"
                aria-haspopup="true"
                aria-expanded="false"
                >????ng k??</a
              >
              <div class="dropdown-menu">
                <a class="dropdown-item" href="register-live.jsp"
                  >????ng k?? ??? n???i tr??</a
                >
                <a class="dropdown-item" href="register-infor-student.jsp"
                  >????ng k?? th??ng tin c?? nh??n</a
                >
              </div>
            </li>
          </c:if>

          <c:if test="${sessionScope.acc.isAdmin==1}">
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                data-toggle="dropdown"
                href="#"
                role="button"
                aria-haspopup="true"
                aria-expanded="false"
                >Qu???n l??</a
              >
              <div class="dropdown-menu">
                <a class="dropdown-item" href="quanlySV">Qu???n l?? sinh vi??n</a>
                <a class="dropdown-item" href="quanlyPhong">Qu???n l?? ph??ng</a>
                <a class="dropdown-item" href="quanlyAcc">Qu???n l?? t??i kho???n</a>
              </div>
            </li>
          </c:if>

          <c:if test="${sessionScope.acc.isUser==1}">
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                data-toggle="dropdown"
                href="#"
                role="button"
                aria-haspopup="true"
                aria-expanded="false"
                >C???p nh???t th??ng tin</a
              >
              <div class="dropdown-menu">
                <a class="dropdown-item" href="editLiver.jsp"
                  >C???p nh???t th??ng tin ??? n???i tr??</a
                >
                <a class="dropdown-item" href="editInfor.jsp"
                  >C???p nh???t th??ng tin c??c nh??n</a
                >
              </div>
            </li>
          </c:if>

          <c:if test="${sessionScope.acc.isAdmin==1}">
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                data-toggle="dropdown"
                href="#"
                role="button"
                aria-haspopup="true"
                aria-expanded="false"
                >Th??ng b??o</a
              >
              <div class="dropdown-menu">
                <a class="dropdown-item" href="">Duy???t ????ng k?? ph??ng</a>
                <a class="dropdown-item" href=""
                  >Li??n l???c sinh vi??n, ph??? huynh</a
                >
                <a class="dropdown-item" href="">Th??ng b??o n???p ti???n</a>
                <a class="dropdown-item" href="">Th??ng b??o h???t h???n</a>
              </div>
            </li>
          </c:if>

          <c:if test="${sessionScope.acc.isAdmin==1}">
            <li class="nav-item">
              <a class="nav-link" href="dashboard.jsp">?????n trang qu???n l??</a>
            </li>
          </c:if>

          <c:if test="${sessionScope.acc.isUser==1}">
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                data-toggle="dropdown"
                href="#"
                role="button"
                aria-haspopup="true"
                aria-expanded="false"
                >Bi???u m???u</a
              >
              <div class="dropdown-menu">
                <a class="dropdown-item" href="file1.jsp" target="_blank"
                  >????n ????ng k?? ??? n???i tr??</a
                >
                <a class="dropdown-item" href="file2.jsp" target="_blank"
                  >H???p ?????ng</a
                >
                <a class="dropdown-item" href="file3.jsp" target="_blank"
                  >Quy ?????nh</a
                >
              </div>
            </li>
          </c:if>

          <c:if test="${sessionScope.acc!=null}">
            <li class="nav-item">
              <a class="nav-link" href="#"
                >Xin ch??o ${sessionScope.acc.username} !</a
              >
            </li>
          </c:if>
        </ul>
        <c:if test="${sessionScope.acc==null}">
          <ul class="nav navbar-nav navbar-right">
            <li>
              <a href="login.jsp"
                ><i class="fa-solid fa-right-to-bracket"></i>????ng nh???p</a
              >
            </li>
          </ul>
        </c:if>
        <c:if test="${sessionScope.acc!=null}">
          <ul class="nav navbar-nav navbar-right">
            <li>
              <a href="logout"
                ><i class="fa-solid fa-right-to-bracket"></i>????ng xu???t</a
              >
            </li>
          </ul>
        </c:if>
      </div>
    </nav>
    <!-- nav end -->

    <!-- main content-->
    <div class="center" style="margin: 20 auto; width: 100%">
      <form action="./addStudent" method="post">
        <div class="container">
          <div class="text-center mt-5">
            <h1>????ng k?? th??ng tin c?? nh??n</h1>
          </div>

          <div class="row">
            <div class="col-lg-7 mx-auto">
              <div class="card mt-2 mx-auto p-4 bg-light">
                <div class="card-body bg-light">
                  <div class="container">
                    <div class="controls"></div>

                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="masv"
                            >M?? sinh vi??n <span><span>*</span></span></label
                          >
                          <input
                            type="text"
                            name="masv"
                            class="form-control"
                            id="masv"
                            required
                          />
                        </div>
                      </div>
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="hoten"
                            >H??? t??n <span><span>*</span></span></label
                          >
                          <input
                            type="text"
                            id="hoten"
                            class="form-control"
                            name="hoten"
                            required
                          />
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="ngaysinh">Ng??y sinh <span>*</span></label>
                          <input
                            type="text"
                            name="dob"
                            placeholder="dd-mm-yyyy"
                            class="form-control"
                            id="datepicker"
                            onclick="datepicker()"
                          />
                        </div>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="gioitinh">Gi???i t??nh <span>*</span></label>
                          <select
                            id="gioitinh"
                            name="gioitinh"
                            class="form-control"
                            required="required"
                          >
                            <option value="" selected disabled>
                              --Ch???n gi???i t??nh--
                            </option>
                            <option
                              name="gioitinh"
                              value="Nam"
                              class="form-control"
                              id="gioitinh"
                            >
                              Nam
                            </option>
                            <option
                              name="gioitinh"
                              value="N???"
                              class="form-control"
                              id="gioitinh"
                            >
                              N???
                            </option>
                          </select>
                        </div>
                      </div>
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="lop">L???p <span>*</span></label>
                          <input
                            type="text"
                            name="lop"
                            id="lop"
                            class="form-control"
                            required="required"
                          />
                        </div>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="nganh">Ng??nh <span>*</span></label>
                          <input
                            type="text"
                            value="${std.nganh}"
                            name="nganh"
                            class="form-control"
                            id="nganh"
                            required="required"
                          />
                        </div>
                      </div>
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="khoa">Khoa <span>*</span></label>
                          <input
                            type="text"
                            value="${std.khoa}"
                            name="khoa"
                            class="form-control"
                            id="nganh"
                            required="required"
                          />
                        </div>
                      </div>
                    </div>

                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="cmnd">CMND/CCCD <span>*</span></label>
                          <input
                            type="text"
                            value="${std.CMND}"
                            name="cmnd"
                            class="form-control"
                            id="cmnd"
                            required="required"
                          />
                        </div>
                      </div>
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="truong">Tr?????ng <span>*</span></label>
                          <input
                            type="text"
                            value="${std.truong}"
                            name="truong"
                            class="form-control"
                            id="truong"
                            required="required"
                          />
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label for="sdt"
                            >S??? ??i???n tho???i c?? nh??n <span>*</span></label
                          >
                          <input
                            type="text"
                            name="sdtSV"
                            class="form-control"
                            id="sdt"
                            required="required"
                          />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label for="sdt"
                            >S??? ??i???n tho???i gia ????nh <span>*</span></label
                          >
                          <input
                            type="text"
                            name="sdtPH"
                            class="form-control"
                            id="sdt"
                            required="required"
                          />
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="email">Email <span>*</span></label>
                          <input
                            type="email"
                            name="email"
                            class="form-control"
                            id="email"
                            required="required"
                          />
                        </div>
                      </div>
                      <div class="col-md-12">
                        <div class="form-group">
                          <label for="diachi">?????a ch??? <span>*</span></label>
                          <input
                            type="text"
                            name="diachi"
                            class="form-control"
                            id="diachi"
                            required="required"
                          />
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-12">
                        <input
                          type="submit"
                          class="btn btn-success btn-send pt-2 btn-block"
                          value="????ng k??"
                        />
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </form>
    </div>

    <script>
      var btn = document.getElementById("search");
      btn.addEventListener(
        "click",
        function () {
          $.ajax({
            url: "/tomcat/searchSV",
            type: "get",
            beforeSend: function () {
              $("#image_id").show();
            },
            success: function (data) {
              $("#image_id").hide();
              var row = document.getElementById("info_student");
              row.innerHTML += data;
            },
            error: function (xhr) {
              //Do Something to handle error
            },
          });
        },
        false
      );

      function showSV() {}
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
  </body>
</html>
