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
  <h4>User Dashboard</h4>
  <!-- <h1><a href="dashboard.html">Admin Dashboard</a></h1> -->
</div>
<!--close-Header-part--> 

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    
    
    <li class=""><a title="" href="logout.jsp"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
  </ul>
</div>


<!--sidebar-menu-->

<div id="sidebar"> <a href="#" class="visible-phone"><i class="icon icon-th"></i>User</a>
 <jsp:include page = "adminmenu.jsp" flush = "true" /> 

</div>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="UserView.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>> <a href="#" class="current">Shared with me</a> </div>
   
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        
        
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5> Inbox  </h5>
            <!-- <span class="label label-info"> </span> --> </div>
          <div class="widget-content ">
          
            <form enctype="multipart/form-data"  role="form" action="Download">
			<div class="form-group">
			<table style="width: 100%;font-size:20px;" border="1">
	       <tr>
			<td width="10%"><h3>ID</h3> </td>
			<td width="18%"><h3>Candidate Name</h3> </td>
			<td width="18%"><h3>Block Data</h3> </td>
		   </tr>
		   
		   <% 
        	Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
        
            ResultSet resultset =statement.executeQuery("select * from tbltransaction") ; 
			while(resultset.next())
             {
       		 %>	
       		 <tr>
           
              <td> <%= resultset.getString("Transaction_ID") %> </td>
               <td> <%= resultset.getString("Email_ID") %> </td>
                    <td> <%= resultset.getString("BlockData") %> </td>
               
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
