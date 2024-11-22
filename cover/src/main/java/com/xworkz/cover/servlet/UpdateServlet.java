package com.xworkz.cover.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.cover.service.CoverServiceImpl;

@WebServlet(loadOnStartup = 1,urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
	public UpdateServlet() {
		System.out.println("created no args IdServlet const");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		CoverServiceImpl impl = new CoverServiceImpl();
		String ref = impl.updateByEmail(email);
		req.setAttribute("success", ref);
		RequestDispatcher dispatcher = req.getRequestDispatcher("update.jsp");
		dispatcher.forward(req, resp);
	}
}
