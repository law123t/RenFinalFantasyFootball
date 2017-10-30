<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:set var="pageTitle" value="Final Fantasy Football" scope="session" />
<c:import url="content-jsp/head.jsp" />

<body>
<!-- Navigation -->
<c:import url="content-jsp/nav.jsp" />

<!-- Header -->
<c:import url="content-jsp/header-index.jsp" />

<!-- About -->
<section id="about" class="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2>We offer the Stat Tracker and Creator of your Dreams!</h2>
                <p class="lead">For Accurate Stats, head over to <a target="_blank" href="http://nfl.com/">NFL.com</a>.</p>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container -->
</section>

<!-- Services -->
<!-- The circle icons use Font Awesome's stacked icon classes. For more information, visit http://fontawesome.io/examples/ -->
<section id="services" class="snap">
    <div class="container">
        <div class="row text-center">
            <div class="col-lg-10 col-lg-offset-1">
                <h2>Get Started!</h2>
                <hr class="small">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="service-item">
                                <span class="fa-stack fa-4x">
                                <i class="fa fa-plus-circle" style="font-size:115px"></i>
                            </span>
                            <h4>
                                <strong>Create a Team</strong>
                            </h4>
                            <a href="footballApp/createTeam.jsp" class="btn btn-light">Add</a>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="service-item">
                                <span class="fa-stack fa-4x">
                                <i class=" 	glyphicon glyphicon-minus-sign" style="font-size:110px"></i>
                            </span>
                            <h4>
                                <strong>Login</strong>
                            </h4>
                            <a href="login.jsp" class="btn btn-light">Remove</a>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="service-item">
                                <span class="fa-stack fa-4x">
                                <i class="fa fa-group" style="font-size:110px"></i>
                            </span>
                            <h4>
                                <strong>PLACEHOLDER</strong>
                            </h4>
                            <a href="" class="btn btn-light">Create</a>
                        </div>
                    </div>
                </div>
                <!-- /.row (nested) -->
            </div>
            <!-- /.col-lg-10 -->
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container -->
</section>

<!-- Callout -->
<aside class="callout">
    <div class="text-vertical-center">
        <h1>Your ULTIMATE Team Tracker</h1>
    </div>
</aside>

<!-- YOUR TEAM DIV-->
<section id="portfolio" class="portfolio">
    <div class="container">
        <div class="row">
            <div class="col-lg-10 col-lg-offset-1 text-center">
                <h2>Your Team!</h2>
                <hr class="small">
                <div class="row">
                    <div class="col-md-6">
                        <div class="portfolio-item">

                        </div>
                    </div>
                </div>
            </div>
            <!-- /.col-lg-10 -->
        </div>
        <!-- /.row -->
    </div>
    <!-- /.container -->
</section>


<!-- Footer -->
<c:import url="content-jsp/footer.jsp" />

<!-- page javascript -->
<c:import url="content-jsp/javascript.jsp" />
</body>

</html>
