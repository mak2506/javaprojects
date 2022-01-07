package collegeportal.admin;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collegeportal.dbtasks.DBConnection;

/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=request.getParameter("userid");
		String pswd=request.getParameter("pswd");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String gen=request.getParameter("gender");
		
		
		
		 Connection con=DBConnection.createConnection();//connection established
		 String strinsert="insert into student(studentid, password, name, email, phone, address, gender, date) values(?,?,?,?,?,?,?,?)";
		 
		 java.util.Date d=new java.util.Date(); java.sql.Date sql_date=new java.sql.Date(d.getTime());
		 
		  PreparedStatement ps=null; 
		  
		  try { ps=con.prepareStatement(strinsert);//this will pass the query to dbms and dbms compiles the query and if there is no  error in query then it erturns the query to ps hold the refernce of the complied query to ps 
		  ps.setString(1, uid); 
		  ps.setString(2, pswd);
		  ps.setString(3, name); 
		  ps.setString(4, email); 
		  ps.setString(5, phone);
		 ps.setString(6, address); 
		 ps.setString(7, gen); 
		 ps.setDate(8, sql_date);
		 System.out.println(ps); 
		 int status= ps.executeUpdate();//to execute the insert query 
		 if(status>0) {
		 System.out.println("Account created successfully"); 
		 } 
		 } catch(SQLException se) 
		  { 
			 se.printStackTrace(); 
		  } 
		  finally {
		  
		 try { 
			 if(ps!=null)
			 { ps.close();
			 } 
			 }
		 catch(SQLException se)
		 {
		  se.printStackTrace();
		  }
		  
		  }
		 
		
		
			/*
			 * System.out.println("UID: "+uid); System.out.println("Password: "+pswd);
			 * System.out.println("Name: "+name); System.out.println("Email: "+email);
			 * System.out.println("Phone: "+phone); System.out.println("Address: "+address);
			 * System.out.println("Gender: "+gen);
			 */
		 
	
	}

}
