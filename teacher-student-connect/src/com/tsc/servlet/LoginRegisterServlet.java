package com.tsc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.tsc.dao.UserDao;
import com.tsc.dao.UserDaoImpl;
import com.tsc.model.Register;

/**
 * Servlet implementation class LoginRegisterServlet
 */
@WebServlet("/LoginRegisterServlet")
public class LoginRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao cd =new UserDaoImpl();
        String userName = request.getParameter("userid");
        String password = request.getParameter("password");
        String submitType = request.getParameter("submit");
Register r = cd.getRegistration(userName,password);
if(submitType.equals("Login") && r!=null && r.getUserId()!=null) {
	request.setAttribute("message", r.getFirstName());
	request.getRequestDispatcher("Registration.jsp").forward(request,response);
}else if (submitType.equals("Register")) {
   try { r.setFirstName(request.getParameter("firstName"));
    
    r.setLastName((request.getParameter("lastName")));
    r.setAge(Integer.parseInt(request.getParameter("age")));
    r.setGender((request.getParameter("gen")));
    r.setContactNumber(Long.parseLong(request.getParameter("contact")));
    r.setCategory((request.getParameter("category")));
    r.setUserId(userName);
    r.setPassword(password);
   r.setPicture((request.getParameter("pic")));
   // r.setStatus((request.getParameter("").equals("Yes")));
    cd.registration(r);
	request.setAttribute("success", "Registration done");
	request.getRequestDispatcher("login.jsp").forward(request,response);
   } catch (Exception e){
	   System.out.println(e);
	   
   }
} else {
	
	request.setAttribute("msg", "Data Not Found");
	request.getRequestDispatcher("login.jsp").forward(request,response);
	
}
	}
}

