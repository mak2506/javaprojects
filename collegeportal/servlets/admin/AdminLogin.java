package collegeportal.admin;

import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import collegeportal.dbtasks.DBConnection;
import collegeportal.utility.Message;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
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
		
		String id=request.getParameter("userid");//userid is the name of input control user id
		String pswd=request.getParameter("pswd");
		//System.out.println("ID: "+id);
		//System.out.println("Password: "+pswd);
		
		Connection con=DBConnection.createConnection();
		String strsql="select * from admin_login where adminid=? and adminpass=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=con.prepareStatement(strsql);
			ps.setString(1, id);
			ps.setString(2, pswd);
			
			rs=ps.executeQuery();
			
			if(rs.next()) 
			{
				response.sendRedirect("/collegeportal/admin/adminhome.jsp");
			}
			else
			{
				request.setAttribute("message", Message.LOGIN_ERROR_MESSAGE);
				RequestDispatcher rd=request.getRequestDispatcher("/admin/login.jsp");
				rd.forward(request, response);
				
				//response.sendRedirect("/collegeportal/jsp/login.jsp");
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
	}

}
