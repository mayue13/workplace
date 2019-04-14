package com.admininfo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.connection.DBConnection;
import com.connection.Dbconn;


/**
 * Servlet implementation class profile
 */
@WebServlet("/profile")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50)
public class profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	File finalpath;
	private static final int BUFFER_SIZE = 4096;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public profile() {
        super();
        // 
    }
    String getFileName(Part filePart) {

		for (String cd : filePart.getHeader("content-disposition").split(";")) {
			if (cd.trim().startsWith("filename")) {
				String fileName = cd.substring(cd.indexOf('=') + 1).trim()
						.replace("\"", "");
				return fileName.substring(fileName.lastIndexOf('/') + 1)
						.substring(fileName.lastIndexOf('\\') + 1);
				// return cd.substring(cd.indexOf('=') + 1).trim().replace("\"",
				// "") ;
			}

		}

		return null;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
        	 
	 String candidateid=request.getParameter("candidateid");
        	Connection con = DBConnection.getConnection();
            String sql1 = "SELECT * FROM tblimagemastercandidate where Id = ?";
            PreparedStatement stt1 = con.prepareStatement(sql1);
            stt1.setString(1, candidateid);
 
            ResultSet result1 = stt1.executeQuery();
            if (result1.next()) {
                // gets file name and file blob data
                String fileName = result1.getString("FileName");
                Blob blob = result1.getBlob("FileData");
                InputStream inputStream = blob.getBinaryStream();
                int fileLength = inputStream.available();
                 
                System.out.println("fileLength = " + fileLength);
 
                ServletContext context = getServletContext();
 
                // sets MIME type for the file download
                String mimeType = context.getMimeType(fileName);
                if (mimeType == null) {        
                    mimeType = "application/octet-stream";
                }              
                 
                // set content properties and header attributes for the response
                response.setContentType(mimeType);
                response.setContentLength(fileLength);
                String headerKey = "Content-Disposition";
                String headerValue = String.format("attachment; filename=\"%s\"", fileName);
                response.setHeader(headerKey, headerValue);
 
                // writes the file to the client
                OutputStream outStream = response.getOutputStream();
                 
                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;
                 
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outStream.write(buffer, 0, bytesRead);
                }
                 
                inputStream.close();
                outStream.close();             
            } else {
                // no file found
//                response.getWriter().print("File not found for the id: " + fileName);  
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            response.getWriter().print("SQL Error: " + ex.getMessage());
        } 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String candidateid=request.getParameter("candidateid");
		String currentdate=request.getParameter("currentdate");
		String candidatename=request.getParameter("organame");
		String pancard_no=request.getParameter("pancard_no");
		String gender=request.getParameter("gender");
		String Address=request.getParameter("Address");
		String email = request.getParameter("email");
		String candidatemobile=request.getParameter("candidatemobile");
		String txtwebsite=request.getParameter("txtwebsite");
		 InputStream inputStream = null;
		
		try {
		
		Connection con = DBConnection.getConnection();
		Statement st = con.createStatement();
		Statement st1 = con.createStatement();
		Statement st2= con.createStatement();
		Statement st3= con.createStatement();
	    st.executeUpdate("insert into tblngoprofile values('" + candidateid
				+ "' , '" + currentdate + "',  '" + candidatename
				+ "','"+pancard_no+"','"+gender+"','"+Address+"','"+email+"','"+candidatemobile+"','"+txtwebsite+"' )");
	   
	    
	    
} catch (Exception e) {
		// 
		e.printStackTrace();
	}
	
	RequestDispatcher rd = request.getRequestDispatcher("/AdminHome.jsp");
	rd.include(request, response); 
	}

}
