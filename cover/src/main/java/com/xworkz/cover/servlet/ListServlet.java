package com.xworkz.cover.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.cover.service.CoverServiceImpl;



@WebServlet(loadOnStartup = 1, urlPatterns = "/search")
public class ListServlet extends HttpServlet {

	public ListServlet() {
		System.out.println("no arg const in ListServlet");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String id = req.getParameter("id");

	    if (id != null && !id.isEmpty()) {
	        int id1 = Integer.valueOf(id);

	        CoverServiceImpl impl = new CoverServiceImpl();
	        String value = impl.getListById(id1);

	        req.setAttribute("id", value);
	    } else {
	        req.setAttribute("id", "Invalid ID.");
	    }

	    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/id.jsp");
	    requestDispatcher.forward(req, resp);

		
	}
}