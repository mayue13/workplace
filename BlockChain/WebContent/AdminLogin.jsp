<!DOCTYPE html>
<html lang="en">
  <head>
  <title>Cloud Collaboration</title>
    <!-- Required meta tags always come first -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,700" rel="stylesheet">
    <link rel="stylesheet" href="css/ionicons.min.css">
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/owl.theme.css">
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
  
    <header id="home" class="gradient-violat">
      <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            
            
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul style="background-color:powderblue;" class="nav navbar-nav  navbar-right">
              <li class="active"><a href="Home.jsp">Home <span class="sr-only">(current)</span></a></li>
            
              <li><a href="UserLogin.jsp">User</a></li>
              <li><a href="Register.jsp">Create Account</a></li>
               
            </ul>
          </div><!-- /.navbar-collapse -->
          <hr class="navbar-divider">
        </div><!-- /.container-fluid -->
      </nav>
    </header>
    
    <section id="newsletter" class="padding-top-bottom-120 newsletter">
    
      <div class="container">
        <div class="row">
          <div class="col-md-8 sunscription-wraper-outer col-md-offset-2 bg-fit" style="background:url(images/newsletter.png)">
            <div class="row">
              <div class="col-md-8 col-md-offset-2 padding-top-bottom-90">
                <div class="subscription-wraper text-center">
                  <h4 class="text-upper">Admin Login</h4>
                 
                  <form class="subscription-form" action="AdminLoginController" method="post">
                    <div class="form-group">
                      <input type="email" name="email" required="required" class="form-control" id="exampleInputEmail1" placeholder="Email">
                    </div>
                    
                     <div class="form-group">
                      <input type="password" name="password" required="required" class="form-control" placeholder="Password">
                    </div>
                    
                    <button type="submit" class="btn btn-orange border-none btn-rounded-corner">Login<span class="icon-on-button"></span></button>
                  <br><br><br><br><br><br><br><br><br><br><br><br><br>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
   
   
   
   
          <hr class="footer-divider">
          <div class="copyright-cta">
            <p class="text-uppercase">All rights Reserved </p>
          </div>
        </div>
      </div>
      <div class="footer-end-line"></div>
    </footer>
    <div id="scroll-top-div" class="scroll-top-div">
      <div class="scroll-top-icon-container">
        <i class="ion-ios-arrow-thin-up"></i>
      </div>
    </div>
    <!-- jQuery first, then Tether, then Bootstrap JS. -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/script.js"></script>
  </body>
</html>
