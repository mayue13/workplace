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
  <h4 style="color: white;">Admin Dashboard</h4>
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
 <jsp:include  page = "adminmenu.jsp" flush = "true" /> 

</div>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> 
    <a href="AdminHome.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Admin Home</a>
     <a href="#" class="current">Candidate Profile</a> </div>
   
  </div>
  <div class="container-fluid">
    <hr>
    <div class="row-fluid">
      <div class="span12">
        
        
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5> Upload ProFile </h5>
            <!-- <span class="label label-info"> </span> --> </div>
          <div class="widget-content ">
          
            <%

String candidateid=null;
            Connection connection = DBConnection.getConnection();
Statement statement = connection.createStatement();
ResultSet resultset =statement.executeQuery("select * from tblngoprofile  order by Register_ID desc") ; 
if(resultset.next())
 {
	candidateid=resultset.getString(1);
 } 
else
{
	candidateid="0";
}
/* if(candidateid==null)
{
	candidateid="0";
}
else
{
	
	} */
int CountVoter=Integer.parseInt(candidateid);
int id=CountVoter+1;
String ids=String.valueOf(id);
System.out.println(CountVoter+"="+ids);
 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
 
	Date date = new Date();
	String strDate= formatter.format(date);
 String emailid=(String)session.getAttribute("emailid");
 %>
							<div class="post_section" align="center">
<form action="profile" method="post">
										<table class="fileup" 
											border="0" cellspacing="10" cellpadding="11"
											style="font-family: monotype corsiva; font-size: 22px; font-weight: bold">
											
											<tbody>
												
												<tr>
													<td>Register-ID</td>
													<td>
								<input type="text" name="candidateid" value=<%=ids %> style="font-family: monotype corsiva; font-size: 15px" readonly="readonly" ></td>
												</tr>
												<tr>
													<td>Current Date</td>
													<td><input type="text" name="currentdate" value=<%=strDate %>
														style="font-family: monotype corsiva; font-size: 15px" required readonly="readonly"></td>
												</tr>
												<tr>
													<td>Organization Name</td>
													<td><input type="text" name="organame"
														style="font-family: monotype corsiva; font-size: 15px" required></td>
												</tr>
												<tr>
													<td>PanCard_No</td>
													<td><input type="text" name="pancard_no" pattern="[A-Z0-9]+" maxlength="10"
														style="font-family: monotype corsiva; font-size: 15px" required /></td>
												</tr>
												<tr>
													<td>Gender</td>
													<td><select class="form-control" id="partyname" name="gender">
													<option value="Male">Male</option>
													<option value="Female">Female</option>
													</select>
</td>
												</tr>
											<tr>
													<td>Designation</td>
													<td><textarea rows="4" cols="50" name="Address"  style="width: 300px; height: 100px;">

</textarea></td>
												</tr>
												<tr>
													<td>Email ID</td>
													<td><input type="text" name="email"
														style="font-family: monotype corsiva; font-size: 15px" required /></td>
												</tr>
												<tr>
													<td>Candidate Mobile</td>
													<td><input type="text" name="candidatemobile" 
														style="font-family: monotype corsiva; font-size: 15px" required /></td>
												</tr>
												<tr>
													<td>Website</td>
													<td><input type="text" name="txtwebsite" 
														style="font-family: monotype corsiva; font-size: 15px" required /></td>
												</tr>
												
												<tr>
													<td colspan="2" align="center"><input type="submit"
														value="Save"
														style="font-family: monotype corsiva; font-size: 20px; font-weight: bold">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
												</tr>


											</tbody>
										</table>
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
