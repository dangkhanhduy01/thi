<%@page import="java.util.ArrayList"%>
<%@page import="model.SanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Nhúng header và nav -->
<jsp:include page="shared/header.jsp" />
<jsp:include page="shared/nav.jsp" />

<section class="bg-body-secondary text-center">
    <div class="container">
        <h1 class="jumbotron-heading text-muted">SIÊU THỊ GIÀY</h1>
        <p class="lead text-muted mb-0">CHUYÊN CUNG CẤP GIÀY THỂ THAO SỐ 1 TẠI VIỆT NAM</p>
    </div>
</section>

<div class="container" id="main-content">
    <div class="row">
        <%
            ArrayList<SanPham> dsPhams = (ArrayList<SanPham>) request.getAttribute("dsSach");
            String thongBao = (String) request.getAttribute("thongBao");

            if (thongBao != null) {
        %>
            <p class="text-center text-danger"><%= thongBao %></p>
        <%
            } else if (dsPhams != null && !dsPhams.isEmpty()) {
                for (SanPham s : dsPhams) {
        %>
            <div class="col-12 col-md-6 col-lg-4">
                <div class="card mb-2">
                    <div class="card-header">
                        <%= s.getTenSP() %>
                    </div>
                    <div class="card-body">
                        <img class="card-img" src="assets/images/products/<%= s.getHinh() %>" alt="Hình sản phẩm">
                    </div>
                    <div class="card-footer">
                        <div class="row">
                            <div class="col">
                                <p class="btn btn-danger btn-block"><%= s.getDonGia() %> VNĐ</p>
                            </div>
                            <div class="col">
                                <a href="#" class="btn btn-success btn-block">Thêm vào giỏ hàng</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <%
                }
            } else {
        %>
            <p class="text-center text-muted">Hiện tại không có sản phẩm nào.</p>
        <%
            }
        %>
    </div>
</div>

<!-- Nhúng footer -->
<jsp:include page="shared/footer.jsp" />
