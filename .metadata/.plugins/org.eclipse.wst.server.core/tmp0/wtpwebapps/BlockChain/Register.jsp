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
    <script type="text/javascript">
    function checkmail() {
    	var input=document.f1.email.value;
    	if((input.indexOf('@gmail.com')!=-1)||(input.indexOf('@moderncoe.edu')!=-1))
		{}
    	else
    	{
    		alert("Please Enter a valid address..");
    	}
	}
    
    
    </script>
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
            
            
            <%--
            <a class="navbar-brand" href="#"><span style="background-color:powderblue;" class="logo-wraper logo-white">
                <img src="images/Logo.png" alt="">Cloud Collaboration
              </span></a>
          </div>
 --%>
 
 
 
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul style="background-color:powderblue;" class="nav navbar-nav  navbar-right">
              <li class="active"><a href="Home.jsp">Home <span class="sr-only">(current)</span></a></li>
           
              <li><a href="UserLogin.jsp">User</a></li>
              <li><a href="AdminLogin.jsp">Admin</a></li>
               
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
                  <h4 class="text-upper">Registration</h4>
                
                  <form  name="f1" id="f1" class="subscription-form" action="UserRegisterController" method="post">
                  
                   <div class="form-group">
                      <input type="text" class="form-control" pattern="[a-zA-z\\s]*" required="required"  name="name" placeholder="Name_Surname">
                    </div>
                    
                    <div class="form-group">
                      <input type="email" class="form-control" onblur="checkmail()" required="required" id="exampleInputEmail1" name="email" placeholder="Email@gmail">
                    </div>
                    
                     <div class="form-group">
                      <input type="password" class="form-control"  required="required" name="password" placeholder="Password">
                    </div>
                    
                     <div class="form-group">
                      <input type="text" pattern="[7-9]{1}[0-9]{9}" class="form-control" required="required" name="mobileno" placeholder="Mobile No" maxlength="10">
                    </div>
                    
                     <div class="form-group">
                      <input type="text" class="form-control" required="required" name="address" placeholder="Address">
                    </div>
                    
                     <div class="form-group">
                      <select type="text" class="form-control" required="required" name="gender" placeholder="Gender">
                       <option>Select Gender</option>
                      <option>Male</option>
                      <option>FeMale</option>
                
                      </select>
                    </div>
                    
                   
                                      
                    <button type="submit" class="btn btn-orange border-none btn-rounded-corner">Register<span class="icon-on-button"></span></button>
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
