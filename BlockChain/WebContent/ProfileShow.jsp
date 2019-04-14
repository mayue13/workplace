<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.connection.*"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>User Dashboard</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css1/bootstrap.min.css" />
<link rel="stylesheet" href="css1/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css1/uniform.css" />
<link rel="stylesheet" href="css1/select2.css" />
<link rel="stylesheet" href="css1/matrix-style.css" />
<link rel="stylesheet" href="css1/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
</head>
<body>

<!--Header-part-->
<div id="header">
  <h4>Admin Dashboard</h4>
  <!-- <h1><a href="dashboard.html">Admin Dashboard</a></h1> -->
</div>
<!--close-Header-part--> 

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    
    
    <li class=""><a title="" href="logout.jsp"><i class="icon icon-share-alt"></i> 
    <span style="color: white; font-size: 15px" class="text">Logout</span></a></li>
  </ul>
</div>


<!--sidebar-menu-->

<div id="sidebar"> <a href="#" class="visible-phone"><i class="icon icon-th"></i>Admin</a>
 <jsp:include page = "adminmenu.jsp" flush = "true" /> 

</div>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="UserView.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 
    Home</a>> <a href="#" class="current">Candidate Profile Show</a> </div>
   
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        
        
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5> View Profile </h5>
            <!-- <span class="label label-info"> </span> --> </div>
          <div class="widget-content ">
          
            <form enctype="multipart/form-data"  role="form" action="Download">
			<div class="form-group">
			<table style="width: 100%;font-size:20px;" border="1">
	       <tr>
			<td width="5%"><h3>ID</h3> </td>
			<td width="18%"><h3>Date</h3> </td>
			<td width="18%"><h3>Name</h3> </td>
			<td width="18%"><h3>PanCard_No</h3> </td>
			<td width="18%"><h3>Gender</h3> </td>
			<td width="18%"><h3>Designation</h3> </td>
			<td width="18%"><h3>Email_ID</h3> </td>
			<td width="18%"><h3>Mobile</h3> </td>
			  </tr>
		   
		   <% 
        	Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
        
            ResultSet resultset =statement.executeQuery("select * from tblngoprofile ") ; 
          //  ResultSet resultset =statement.executeQuery("select * from candidateprofile ") ; 
			while(resultset.next())
             {
       		 %>	
       		 <tr>
           
              <td> <%= resultset.getString(1) %> </td>
               <td> <%= resultset.getString(2) %> </td>
                 <td> <%= resultset.getString(3) %> </td>
                  <td> <%= resultset.getString(4) %> </td>
                   <td> <%= resultset.getString(5) %> </td>
                    <td> <%= resultset.getString(6) %> </td>
                    <td> <%= resultset.getString(7) %> </td>
                    <td> <%= resultset.getString(8) %> </td>
                </tr>
       		  <% 
             } 
              %>

 
			</table>
			</div>
			</form> 		
          </div>
        </div>
       
        </div>
      </div>
    </div>
  </div>

<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12">  </div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.uniform.js"></script> 
<script src="js/select2.min.js"></script> 
<script src="js/jquery.dataTables.min.js"></script> 
<script src="js/matrix.js"></script> 
<script src="js/matrix.tables.js"></script>
</body>
</html>
